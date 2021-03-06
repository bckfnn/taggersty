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
 * An <code>TagsOutput</code> implementation that append the output to a StringBuffer.
 */
public class StringBuilderOutput implements TagsOutput {
    private StringBuilder sb = new StringBuilder(1024 * 8);

    @Override
    public void write(String s) {
        sb.append(s);
    }

    @Override
    public void write(char[] c) {
        sb.append(c);
    }

    @Override
    public void write(char c) {
        sb.append(c);
    }

    @Override
    public String toString() {
        return sb.toString();
    }

    @Override
    public void flush() {
        // Empty
    }

    @Override
    public void close() {
        // Empty
    }
}