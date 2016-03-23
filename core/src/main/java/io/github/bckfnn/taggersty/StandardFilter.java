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

public class StandardFilter implements Filter {

    @Override
    public String encodeContent(String content) {
        return replace(content, c -> {
            switch (c) {
            case '&':
                return "&amp;";
            case '<':
                return "&lt;";
            case '>':
                return "&gt;";
            case '"':
                return "&quot;";
            case '\'':
                return "&#39;";
            }
            return null;
        });
    }

    @Override
    public String encodeAttribute(String content) {
        return encodeContent(content); 
    }

    @Override
    public String encodeJavascript(String content) {
        return content;
    }

    @Override
    public String encodeStylesheet(String content) {
        return content;
    }


    public static String replace(String orig, ReplaceFunc f) {
        if (orig == null) return orig;

        StringBuilder sb = null; // lazy create for edge-case efficiency
        for (int i = 0, len = orig.length(); i < len; i++) {
            final char ch = orig.charAt(i);
            final String replacement = f.subst(ch);

            if (replacement != null) {
                // output differs from input; we write to our local buffer
                if (sb == null) {
                    sb = new StringBuilder((int) (1.1 * len));
                    sb.append(orig.substring(0, i));
                }
                sb.append(replacement);
            } else if (sb != null) {
                // earlier output differs from input; we write to our local buffer
                sb.append(ch);
            }
        }

        return sb == null ? orig : sb.toString();
    }

    public interface ReplaceFunc {
        String subst(char c);
    }

}
