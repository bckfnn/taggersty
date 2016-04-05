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
import io.vertx.core.buffer.Buffer;
import io.vertx.core.streams.ReadStream;
import io.vertx.core.streams.WriteStream;

public class VertxHtmlTags extends HtmlTags {
    private VertxOutput output;

    public VertxHtmlTags(VertxOutput output) {
        super(output);
        this.output = output;
    }

    public <T> Handler<T> async(BiConsumer<VertxHtmlTags, T> body) {
        VertxOutput subOut = output.addSubOutput();
        return new Handler<T>() {
            @Override
            public void handle(T event) {
                VertxHtmlTags next = new VertxHtmlTags(subOut);
                next.setAutoNewline(isAutoNewline());
                next.setFilter(getFilter());
                body.accept(next, event);
                subOut.close();
            }
        };
    }

    public <T> void forEach(ReadStream<T> list, BiConsumer<VertxHtmlTags, T> body) {
        closeTag();

        VertxOutput subOut = output.addSubOutput();
        VertxHtmlTags next = new VertxHtmlTags(subOut);
        subOut.drainHandler($ -> {
            list.resume();
        });
        list.endHandler($ -> {
            //cnt.decrementAndGet();
            subOut.close();
        });
        list.handler(item -> {
            //log.trace("item readstream {}, {}", list, item);
            //System.out.println("list item");
            body.accept(next, item);
            if (subOut.writeQueueFull()) {
                list.pause();
            }
        });
    }

    public static class VertxOutput implements TagsOutput, Appendable {
        private LinkedList<Appendable> buffers = new LinkedList<>();

        private VertxOutput parent;
        private WriteStream<Buffer> writeStream;
        private int pending;
        private boolean closed = false;
        private Handler<Void> drainHandler = $ -> {};

        public VertxOutput(WriteStream<Buffer> writeStream) {
            this.writeStream = writeStream;
            buffers.add(new StringBuilder());
        }

        public VertxOutput(VertxOutput parent) {
            this.parent = parent;
            this.writeStream = parent.writeStream;
            buffers.add(new StringBuilder());
        }

        public boolean writeQueueFull() {
            return writeStream.writeQueueFull();
        }

        public void drainHandler(Handler<Void> drainHandler) {
            this.drainHandler = drainHandler;
            this.writeStream.drainHandler(drainHandler);
        }

        public VertxOutput addSubOutput() {
            VertxOutput sub = new VertxOutput(this);
            buffers.add(sub);
            buffers.add(new StringBuilder());
            pending++;
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
            System.out.println("close:" + pending + " " + toString());
            closed = true;
            if (pending == 0) {
                for (Appendable a : buffers) {
                    writeStream.write(Buffer.buffer(a.toString(), "UTF-8"));
                }
                buffers.clear();
            }
            if (parent != null) {
                parent.pending--;
                if (parent.pending == 0 && parent.closed) {
                    parent.close();
                }
                parent.drainHandler(parent.drainHandler);
            }
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

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (Appendable a : buffers) {
                sb.append(a);
            }
            return sb.toString();
        }
    }
}
