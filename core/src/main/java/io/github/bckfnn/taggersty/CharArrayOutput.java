package io.github.bckfnn.taggersty;

import java.util.ArrayList;

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
        //s.getChars(0, l, buffer, pos);
        //pos += l;
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
        StringBuilder sb = new StringBuilder();
        for (char[] b : buffers) {
            sb.append(b);
        }
        sb.append(buffer, 0, pos);
        return sb.toString();
    }

    @Override
    public void close() {
    }

}
