/*
 * Copyright 2016 Finn Bock
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.bckfnn.taggersty;

/**
 * Implementation class of the tag writer system.
 */
public class Tags {
    /** marker value for signaling that a tag should suppress white space. */

    public static final String _suppress = "suppress";

    @FunctionalInterface
    public interface Generator {
        public void gen() throws Exception;
    }

    /** the current state of output. */
    enum State {
        /** assigned while writing attributes. */
        ATTR,
        /** assigned after the start tag '>' before writing any content. */
        EMPTY,
        /** assigned after writing some content in a tag. */
        CONTENT,
    }

    /** assigned while suppressing white space for a tag. */
    private boolean suppressWhiteSpace = false;

    /** current state **/
    private State state = State.EMPTY;

    /** the output */
    private  TagsOutput output;

    /** the filter class.*/
    private  Filter filter = new StandardFilter();

    /** Current indent */
    private int indent = 0;

    /*** emit newline between tags */
    private boolean autoNewline = true;

    /*** emit indenting spaces before tags */
    private boolean autoIndent = true;

    /**
     * Constructor.
     * @param output the output handler
     */
    public Tags(TagsOutput output) {
        this.output = output;
    }

    /**
     * Enable automatic newline after start and end tags.
     * @param autoNewline the value to set.
     */
    public void setAutoNewline(boolean autoNewline) {
        this.autoNewline = autoNewline;
    }

    /**
     * Enable automatic indentation.
     * @param autoIndent the value to set.
     */
    public void setAutoIndent(boolean autoIndent) {
        this.autoIndent = autoIndent;
    }

    /**
     * Set a encoding filter.
     * @param filter the filter to use.
     */
    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    /**
     * Set the output handler.
     * @param output the handler to set.
     */
    public void output(TagsOutput output) {
        this.output = output;
    }

    /**
     * Emit <code>name</code> tag without attributes and with the specified body.
     * @param name name the of the tag
     * @param body body of the tag.
     */
    public void tag(String name, Generator body) {
        tag(name, null, null, null, null, body);
    }

    /**
     * Emit an empty <code>name</code> tag without attributes and without a body.
     * @param name name the of the tag
     */
    public void tag(String name) {
        tag(name, null, null, null, null, null);
    }

    /**
     * Emit an empty <code>name</code> tag with a single attribute and no body.
     * @param name name the of the tag
     * @param attr1 name of the attribute
     * @param value1 value of the attribute
     */
    public void tag(String name, String attr1, String value1) {
        tag(name, attr1, value1, null, null, null);
    };

    /**
     * Emit an empty <code>name</code> tag with a two attributes and no body.
     * @param name name the of the tag
     * @param attr1 name of the first attribute
     * @param value1 value of the first attribute
     * @param attr2 name of the second attribute
     * @param value2 value of the second attribute
     */
    public void tag(String name, String attr1, String value1, String attr2, String value2) {
        tag(name, attr1, value1, attr2, value2, null);
    };

    /**
     * Emit a <code>name</code> tag with up to two attributes and body.
     * @param name name the of the tag
     * @param attr1 name of the first attribute
     * @param value1 value of the first attribute
     * @param attr2 name of the second attribute
     * @param value2 value of the second attribute
     * @param body body of the tag.
     */
    public void tag(String name, String attr1, String value1, String attr2, String value2, Generator body) {
        closeTag();

        autoIndent();
        append('<');
        append(name);
        if (attr1 != null) {
            if (attr1 == Tags._suppress) {
                suppressWhiteSpace = true;
            } else {
                attr(attr1, value1);
            }
        }
        if (attr2 != null) {
            attr(attr2, value2);
        }
        state = State.ATTR;

        if (body != null) {
            try {
                indent++;
                body.gen();
                indent--;
            } catch (Exception exc) {
                throw new RuntimeException(exc);
            }

            if (state == State.ATTR) {
                append("/>");
            } else {
                autoIndent();

                append("</");
                append(name);
                append('>');
            }
        } else {
            append("/>");
        }
        if (attr1 == _suppress) {
            suppressWhiteSpace = false;
        }

        state = State.CONTENT;
        autoNewline();
    };

    /**
     * Emit an properly encoded attribute
     * @param name name of the attribute
     * @param value value of the attribute
     */
    public void attr(String name, String value) {
        append(' ');
        append(name);
        if (value != null) {
            append('=');
            append('"');
            append(filter.encodeAttribute(value));
            append('"');
        }
    }

    /**
     * Emit an attribute without value.
     * @param name name of the attribute
     */
    public void attr(String name) {
        attr(name, null);
    }

    /**
     * Emit properly encoded text content.
     * @param content value of the content, or null of the content can be empty.
     */
    public void text(String content) {
        closeTag();
        state = State.CONTENT;
        autoIndent();
        if (content != null) {
            append(filter.encodeContent(content));
        }
        autoNewline();
    }

    /**
     * Emit raw un-encoded text content.
     * @param content value of the content, or null of the content can be empty.
     * It is very important that the content is safe to emit and that it does not contant user input that can cause XSS attacks.
     */
    public void textUnescaped(String content) {
        closeTag();
        state = State.CONTENT;
        autoIndent();
        if (content != null) {
            append(content);
        }
        autoNewline();
    }

    /**
     * Emit an CDATA tag.
     * @param body body of the tag.
     */
    public void cdata(Generator body) {
        closeTag();
        state = State.CONTENT;
        suppressWhiteSpace = true;
        append("<![CDATA[");
        if (body!= null) {
            try {
                body.gen();
            } catch (Exception exc) {
                throw new RuntimeException(exc);
            }
        }
        append("]]>");
        suppressWhiteSpace = false;
        state = State.CONTENT;
    }

    /**
     * Emit an javascript commented CDATA tag.
     * @param body body of the tag.
     */
    public void cdataComment(Generator body) {
        closeTag();
        state = State.CONTENT;
        suppressWhiteSpace = true;
        append("/*<![CDATA[*/");
        if (body!= null) {
            try {
                body.gen();
            } catch (Exception exc) {
                throw new RuntimeException(exc);
            }
        }
        append("/*]]>*/");
        suppressWhiteSpace = false;
        state = State.CONTENT;
    }

    /**
     * Emit a comment.
     * @param comment the comment to emit.
     */
    public void comment(String comment) {
        closeTag();
        autoIndent();
        append("<!-- " + filter.encodeContent(comment) + " -->");
        autoNewline();
    }

    /**
     * Close the output.
     */
    public void close() {
        output.close();
    }

    /**
     * Append a single character to the out.
     * @param ch the character.
     */
    private void append(char ch) {
        output.write(ch);
    }

    /**
     * Append a string to the output.
     * @param str the string.
     */
    private void append(String str) {
        output.write(str);
    }

    /**
     * Append a newline if autoNewline is enabled.
     */
    private void autoNewline() {
        if (autoNewline && !suppressWhiteSpace) {
            append(System.lineSeparator());
        }
    }

    /**
     * Indent the nes tag if autoIndent and autoNewline is enabled.
     */
    private void autoIndent() {
        if (autoIndent && autoNewline && !suppressWhiteSpace) {
            for (int i = 0; i < indent; i++) {
                append("    ");
            }
        }
    }

    /**
     * Emit a close '>' is needed.
     */
    protected void closeTag() {
        if (state == State.ATTR) {
            append('>');
            autoNewline();
            state = State.EMPTY;
        }
    }

    /**
     * Generate java source code for the specified tags that can be added to a class and used as dsl for tag generation.
     * @param ns the name space to use for the tags.
     * @param tags the array of tags to generate java source code for.
     */
    public static void generate(String ns, String[] tags) {
        if (ns != null) {
            ns = ns + ":";
        } else
            ns = "";
        for (String n : tags) {
            StringBuilder m = new StringBuilder();
            boolean first = true;
            if (n.contains(" - ")) {
                n = n.substring(0, n.indexOf(" - "));
            }
            for (String p : n.split("-")) {
                m.append(first ? p : Character.toUpperCase(p.charAt(0)) + p.substring(1));
                first = false;
            }

            System.out.println("    /**");
            System.out.println("     * Create en empty a @code{" + n + "} tag");
            System.out.println("     */");
            System.out.println("    public void " + m +"() {");
            System.out.println("        tag(\"" + ns + n + "\");");
            System.out.println("    }");
            System.out.println();
            System.out.println("    /**");
            System.out.println("     * Create en empty a @code{" + n + "} tag");
            System.out.println("     * @param attr name of the attribute.");
            System.out.println("     * @param value value of the attribute.");
            System.out.println("     */");
            System.out.println("    public void " + m +"(String attr, String value) {");
            System.out.println("        tag(\"" + ns + n + "\", attr, value);");
            System.out.println("    }");
            System.out.println();
            System.out.println("    /**");
            System.out.println("     * Create en empty a @code{" + n + "} tag");
            System.out.println("     * @param attr1 name of the attribute.");
            System.out.println("     * @param value1 value of the attribute.");
            System.out.println("     * @param attr2 name of the attribute.");
            System.out.println("     * @param value2 value of the attribute.");
            System.out.println("     */");
            System.out.println("    public void " + m +"(String attr1, String value1, String attr2, String value2) {");
            System.out.println("        tag(\"" + ns + n + "\", attr1, value1, attr2, value2);");
            System.out.println("    }");
            System.out.println();
            System.out.println("    /**");
            System.out.println("     * Create a @code{" + n + "} tag with zero attribute");
            System.out.println("     * @param body the body generator for the tag.");
            System.out.println("     */");
            System.out.println("    public void " +m +"(Generator body) {");
            System.out.println("        tag(\"" + ns + n + "\", null, null, null, null, body);");
            System.out.println("    }");
            System.out.println();
            System.out.println("    /**");
            System.out.println("     * Create a @code{" + n + "} tag with one attribute");
            System.out.println("     * @param attr name of the attribute.");
            System.out.println("     * @param value value of the attribute.");
            System.out.println("     * @param body the body generator for the tag.");
            System.out.println("     */");
            System.out.println("    public void " + m +"(String attr, String value, Generator body) {");
            System.out.println("        tag(\"" + ns + n + "\", attr, value, null, null, body);");
            System.out.println("    }");
            System.out.println();
            System.out.println("    /**");
            System.out.println("     * Create a @code{" + n + "} tag with one attribute");
            System.out.println("     * @param attr1 name of the first attribute.");
            System.out.println("     * @param value1 value of the first attribute.");
            System.out.println("     * @param attr2 name of the second attribute.");
            System.out.println("     * @param value2 value of the second attribute.");
            System.out.println("     * @param body the body generator for the tag.");
            System.out.println("     */");
            System.out.println("    public void " + m +"(String attr1, String value1, String attr2, String value2, Generator body) {");
            System.out.println("        tag(\"" + ns + n + "\", attr1, value1, attr2, value2, body);");
            System.out.println("    }");
            System.out.println();
        }
    }

}
