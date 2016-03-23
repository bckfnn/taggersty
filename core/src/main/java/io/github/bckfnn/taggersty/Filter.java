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
 * The taggersty interface for emiting values in diffent contents. 
 */
public interface Filter {
    /**
     * Emit a save value in a character content of the document.
     * @param content the unquoted value.
     * @return the quoted value.
     */
    String encodeContent(String content);

    /**
     * Emit a save value in an attribute content of a tag.
     * @param content the unquoted value.
     * @return the quoted value.
     */
    String encodeAttribute(String content);

    /**
     * Emit a save value in a java script content of a document.
     * @param content the unquoted value.
     * @return the quoted value.
     */
    String encodeJavascript(String content);

    /**
     * Emit a save value in a stylesheet content of a document.
     * @param content the unquoted value.
     * @return the quoted value.
     */
    String encodeStylesheet(String content);
}
