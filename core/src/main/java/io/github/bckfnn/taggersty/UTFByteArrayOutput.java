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
 * An tags output class that stores the output as a list of byte arrays. The output is encoded as UTF-8.
 */
public class UTFByteArrayOutput implements TagsOutput {
    static final int BUF_SIZE = 8 * 1024;

    private ArrayList<byte[]> buffers = new ArrayList<>();

    private byte[] buffer = new byte[BUF_SIZE];
    private int pos = 0;

    @Override
    public void write(String s) {
        //System.out.println(s);

        int l = s.length();
        for (int i = 0; i < l; i++) {
            char ch = s.charAt(i);
            if (ch <= 0x7F) {
                add((byte) ch);
            } else if (ch <= 0x7FF) {
                add((byte) (0xc0 | (ch >> 6)));
                add((byte) (0x80 | (ch & 0x3f)));
            } else {
                add((byte) (0xe0 | (ch >> 12)));
                add((byte) (0x80 | ((ch >> 6) & 0x3f)));
                add((byte) (0x80 | (ch & 0x3f)));
            }
        }
    }

    private final void add(byte b) {
        try {
            buffer[pos++] = b;
        } catch (ArrayIndexOutOfBoundsException e) {
            buffers.add(buffer);
            buffer = new byte[BUF_SIZE];
            pos = 0;
            buffer[pos++] = b;
        }
    }



    @Override
    public void write(char[] s) {
        int l = s.length;
        for (int i = 0; i < l; i++) {
            try {
                buffer[pos++] = (byte) s[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                buffers.add(buffer);
                buffer = new byte[BUF_SIZE];
                pos = 0;
                buffer[pos++] = (byte) s[i];
            }
        }
    }

    @Override
    public void write(char c) {
        try {
            buffer[pos++] = (byte) c;
        } catch (ArrayIndexOutOfBoundsException e) {
            buffers.add(buffer);
            buffer = new byte[BUF_SIZE];
            pos = 0;
            buffer[pos++] = (byte) c;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (byte[] b : buffers) {
            sb.append(new String(b));
        }
        sb.append(new String(buffer, 0, pos));
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

    /**
     * @return number of byte of accumulated output.
     */
    public int length() {
        return BUF_SIZE * buffers.size() + pos;
    }
}
