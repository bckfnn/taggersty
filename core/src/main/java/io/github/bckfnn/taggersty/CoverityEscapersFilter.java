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

import com.coverity.security.Escape;

/**
 * A XSS filter that uses the coverty escapers dependency.
 */
public class CoverityEscapersFilter implements Filter {

    @Override
    public String encodeContent(String content) {
        return Escape.htmlText(content);
    }

    @Override
    public String encodeAttribute(String content) {
        return Escape.html(content);
    }

    @Override
    public String encodeJavascript(String content) {
        return  Escape.jsString(content);
    }

    @Override
    public String encodeStylesheet(String content) {
        return Escape.cssString(content);
    }
}
