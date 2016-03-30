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

import java.util.ArrayList;

/**
 * An output class that stores the output as a list of character arrays.
 */
public class CharArrayOutput implements TagsOutput {
    static final int BUF_SIZE = 8 * 1024;

    private ArrayList<char[]> buffers = new ArrayList<>();

    private char[] buffer = new char[BUF_SIZE];
    private int pos = 0;

    @Override
    public void write(String s) {
        int l = s.length();
        for (int i = 0; i < l; i++) {
            try {
                buffer[pos++] = s.charAt(i);
            } catch (ArrayIndexOutOfBoundsException e) {
                buffers.add(buffer);
                buffer = new char[BUF_SIZE];
                pos = 0;
                buffer[pos++] = s.charAt(i);
            }
        }

    }


    @Override
    public void write(char[] s) {
        int l = s.length;
        for (int i = 0; i < l; i++) {
            try {
                buffer[pos++] = s[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                buffers.add(buffer);
                buffer = new char[BUF_SIZE];
                pos = 0;
                buffer[pos++] = s[i];
            }
        }
    }

    @Override
    public void write(char c) {
        try {
            buffer[pos++] = c;
        } catch (ArrayIndexOutOfBoundsException e) {
            buffers.add(buffer);
            buffer = new char[BUF_SIZE];
            pos = 0;
            buffer[pos++] = c;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(BUF_SIZE * buffers.size() + pos);
        for (char[] b : buffers) {
            sb.append(b);
        }
        sb.append(buffer, 0, pos);
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
