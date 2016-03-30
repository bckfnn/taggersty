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

import java.nio.charset.Charset;

import io.github.bckfnn.taggersty.TagsOutput;
import io.vertx.core.Handler;
import io.vertx.core.buffer.Buffer;

public class HandlerOutput implements TagsOutput {
    private final Buffer buffer = Buffer.buffer();

    private final Handler<Buffer> handler;
    private final Charset charset;

    public HandlerOutput(Handler<Buffer> handler, Charset charset) {
        this.handler = handler;
        this.charset = charset;
    }

    @Override
    public void write(String s) {
        buffer.appendBytes(s.getBytes(charset));
    }

    @Override
    public void write(char[] s) {
        for (int i = 0; i < s.length; i++) {
            buffer.appendByte((byte) s[i]);
        }
    }

    @Override
    public void write(char c) {
        buffer.appendByte((byte) c);
    }

    @Override
    public void flush() {
        handler.handle(buffer);
    }

    @Override
    public void close() {
        handler.handle(buffer);
    }
}
