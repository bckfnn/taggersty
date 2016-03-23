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

public class Tags {

    public static final String _suppress = "suppress";
    //public final String _suppress = _suppress;


    @FunctionalInterface
    public interface Generator {
        public void gen() throws Exception;
    }

    enum State {
        ATTR,
        EMPTY,
        CONTENT,
    }

    private boolean suppressWhiteSpace = false;
    protected State state = State.EMPTY;
    protected TagsOutput output;
    protected Filter filter = new CommonsLangFilter();

    private int indent = 0;
    private boolean autoNewline = true;
    private boolean autoIndent = true;

    public Tags(TagsOutput output) {
        this.output = output;
    }

    public void setAutoNewline(boolean autoNewline) {
        this.autoNewline = autoNewline;
    }

    public void setAutoIndent(boolean autoIndent) {
        this.autoIndent = autoIndent;
    }

    public void suppressWhiteSpace(boolean value) {
        suppressWhiteSpace = value;
    }

    public void output(TagsOutput output) {
        this.output = output;
    }

    public void tag(String name) {
        tag(name, null, null, null, null, null);
    }
    public void tag(String name, String attr1, String value1) {
        tag(name, attr1, value1, null, null, null);
    };

    public void tag(String name, String attr1, String value1, String attr2, String value2) {
        tag(name, attr1, value1, attr2, value2, null);
    };

    public void tag(String name, String attr1, String value1, String attr2, String value2, Generator body) {
        closeTag();

        autoIndent();
        append("<");
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

    public void attr(String name) {
        attr(name, null);
    }

    public void text(String body) {
        closeTag();
        state = State.CONTENT;
        autoIndent();
        if (body != null) {
            append(filter.encodeContent(body));
        }
        autoNewline();
    }

    public void textUnescaped(String body) {
        closeTag();
        autoIndent();
        if (body != null) {
            append(body);
        }
        autoNewline();
    }

    /*
    public void textDirect(String body) {
        if (state == State.ATTR) {
            append('>');
        }
        if (body != null) {
            append(Utils.escapeXml(body));
        }
        state = State.CONTENT;
    }
    */

    public void comment(String comment) {
        closeTag();
        autoIndent();
        append("<!-- " + comment + " -->");
        autoNewline();
    }

    public void close() {

    }

    private void append(char ch) {
        output.write(ch);
    }

    private void append(String str) {
        output.write(str);
    }

    private void autoNewline() {
        if (autoNewline && !suppressWhiteSpace) {
            append(System.lineSeparator());
        }
    }

    private void autoIndent() {
        if (autoIndent && autoNewline && !suppressWhiteSpace) {
            for (int i = 0; i < indent; i++) {
                append("    ");
            }
        }
    }

    protected void closeTag() {
        if (state == State.ATTR) {
            append('>');
            autoNewline();
            state = State.EMPTY;
        }
    }

    public static void generate(String ns, String[] tags) {
        if (ns != null) {
            ns = ns + ":";
        } else
            ns = "";
        for (String n : tags) {
            StringBuilder m = new StringBuilder();
            boolean first = true;
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
            System.out.println("     * @param attr name1 of the attribute.");
            System.out.println("     * @param value value1 of the attribute.");
            System.out.println("     * @param attr name2 of the attribute.");
            System.out.println("     * @param value value2 of the attribute.");
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
