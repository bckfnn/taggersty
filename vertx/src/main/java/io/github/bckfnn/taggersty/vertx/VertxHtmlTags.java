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
package io.github.bckfnn.taggersty.vertx;

import java.io.IOException;
import java.util.LinkedList;
import java.util.function.BiConsumer;

import io.github.bckfnn.taggersty.HtmlTags;
import io.github.bckfnn.taggersty.TagsOutput;
import io.vertx.core.Handler;

public class VertxHtmlTags extends HtmlTags {
    private VertxOutput output;

    public VertxHtmlTags(VertxOutput output) {
        super(output);
        this.output = output;
    }

    public <T> Handler<T> delay(BiConsumer<VertxHtmlTags, T> body) {
        return new Handler<T>() {
            @Override
            public void handle(T event) {
                VertxOutput subOut = output.addSubOutput();
                VertxHtmlTags next = new VertxHtmlTags(subOut);
                body.accept(next, event);
                subOut.close();
            }
        };
    }

    public static class VertxOutput implements TagsOutput, Appendable {
        LinkedList<Appendable> buffers = new LinkedList<>();

        public VertxOutput() {
            buffers.add(new StringBuilder());
        }

        public VertxOutput addSubOutput() {
            VertxOutput sub = new VertxOutput();
            buffers.add(sub);
            buffers.add(new StringBuilder());
            return sub;
        }

        @Override
        public void write(String s) {
            try {
                buffers.getLast().append(s);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void write(char[] s) {
            try {
                for (int i = 0; i < s.length; i++) {
                    buffers.getLast().append(s[i]);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void write(char c) {
            try {
                buffers.getLast().append(c);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void flush() {
        }

        @Override
        public void close() {
        }

        @Override
        public Appendable append(CharSequence s) throws IOException {
            buffers.getLast().append(s);
            return this;
        }

        @Override
        public Appendable append(CharSequence s, int start, int end) throws IOException {
            buffers.getLast().append(s, start, end);
            return this;
        }

        @Override
        public Appendable append(char c) throws IOException {
            buffers.getLast().append(c);
            return this;
        }
    }
}
