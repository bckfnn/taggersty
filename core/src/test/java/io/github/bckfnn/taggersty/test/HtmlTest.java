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
package io.github.bckfnn.taggersty.test;

import org.junit.Assert;
import org.junit.Test;

import io.github.bckfnn.taggersty.CommonsLangFilter;
import io.github.bckfnn.taggersty.CoverityEscapersFilter;
import io.github.bckfnn.taggersty.HtmlTags;
import io.github.bckfnn.taggersty.StringBuilderOutput;
import io.github.bckfnn.taggersty.Tags;

public class HtmlTest {


    @Test
    public void testTagsConsumer() {
        StringBuilderOutput out = new StringBuilderOutput();

        HtmlTags.run(out, g -> {
            g.html(() -> {
                g.head();
                g.body(() -> {
                    g.div(HtmlTags._class, "hide", () -> {
                        g.text("line1");
                        g.p(() -> g.text("ppp"));
                        g.text("line2");
                    });
                    g.div(Tags._suppress, null, () -> {
                        g.text("x");
                        g.p(() -> g.text("ppp"));
                    });
                });
            });
        });
        Assert.assertTrue(out.toString().length()  > 0);
    }

    @Test
    public void testTagsSubclass() {
        StringBuilderOutput out = new StringBuilderOutput();

        HtmlTags g = new HtmlTags() {
            @Override
            public void render() {
                html(() -> {
                    head();
                    body(() -> {
                        div(_class, "hide", () -> {
                            text("line1");
                            p(() -> text("ppp"));
                            text("line2");
                        });
                        div(_suppress, null, () -> {
                            text("x");
                            p(() -> text("ppp"));
                        });
                    });
                });
            }
        };
        g.render(out);
        Assert.assertTrue(out.toString().length()  > 0);
    }

    @Test
    public void testCoverity1() {
        StringBuilderOutput out = new StringBuilderOutput();

        HtmlTags g = new HtmlTags(out).filter(new CoverityEscapersFilter());
        g.setAutoIndent(false);
        g.setAutoNewline(false);
        g.div(() -> g.text("<script>alert(1);</script>"));
        Assert.assertEquals("<div>&lt;script&gt;alert(1);&lt;/script&gt;</div>", out.toString());
    }

    @Test
    public void testCoverity2() {
        StringBuilderOutput out = new StringBuilderOutput();

        HtmlTags g = new HtmlTags(out).filter(new CoverityEscapersFilter());
        g.setAutoIndent(false);
        g.setAutoNewline(false);
        g.div("attr", "<script>alert(1);</script>");
        Assert.assertEquals("<div attr=\"&lt;script&gt;alert(1);&lt;&#x2F;script&gt;\"/>", out.toString());
    }

    @Test
    public void testCommonsLang1() {
        StringBuilderOutput out = new StringBuilderOutput();

        HtmlTags g = new HtmlTags(out).filter(new CommonsLangFilter());
        g.setAutoIndent(false);
        g.setAutoNewline(false);
        g.div(() -> g.text("<script>alert(1);</script>"));
        Assert.assertEquals("<div>&lt;script&gt;alert(1);&lt;/script&gt;</div>", out.toString());
    }

    @Test
    public void testCommonsLang2() {
        StringBuilderOutput out = new StringBuilderOutput();

        HtmlTags g = new HtmlTags(out).filter(new CommonsLangFilter());
        g.setAutoIndent(false);
        g.setAutoNewline(false);
        g.div("attr", "<script>alert(1);</script>");
        Assert.assertEquals("<div attr=\"&lt;script&gt;alert(1);&lt;/script&gt;\"/>", out.toString());
    }


}
