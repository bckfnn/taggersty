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
package io.github.bckfnn.taggersty.vertx.test;

import java.util.concurrent.CountDownLatch;

import org.junit.Assert;
import org.junit.Test;

import io.github.bckfnn.taggersty.StandardFilter;
import io.github.bckfnn.taggersty.vertx.VertxHtmlTags;
import io.vertx.core.Vertx;

public class VertxTest {
    @Test
    public void testSimple() {
        VertxHtmlTags.VertxOutput out = new VertxHtmlTags.VertxOutput();
        VertxHtmlTags g = make(out);
        g.html(() -> {
            g.head(() -> {
                g.title(() -> g.text("title"));
            });
            g.body(() -> {
                g.p(() -> g.text("content"));
            });
        });
        
        Assert.assertEquals("<html><head><title>title</title></head><body><p>content</p></body></html>", out.toString());
    }

    @Test
    public void testDelay() throws Exception {
        Vertx vertx = Vertx.vertx();
        CountDownLatch latch = new CountDownLatch(1);
        
        VertxHtmlTags.VertxOutput out = new VertxHtmlTags.VertxOutput();
        VertxHtmlTags g = make(out);
        g.html(() -> {
            g.head(() -> {
                g.title(() -> g.text("title"));
            });
            vertx.setTimer(100, g.delay((n, id) -> {
                n.body(() -> {
                    n.p(() -> n.text("content"));
                });
                latch.countDown();
            }));
        });
        
        latch.await();
        Assert.assertEquals("<html><head><title>title</title></head><body><p>content</p></body></html>", out.toString());
    }

    private VertxHtmlTags make(VertxHtmlTags.VertxOutput out) {
        VertxHtmlTags g = new VertxHtmlTags(out);
        g.setFilter(new StandardFilter());
        g.setAutoNewline(false);
        return g;
    }
}
