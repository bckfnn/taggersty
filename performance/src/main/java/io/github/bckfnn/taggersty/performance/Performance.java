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
package io.github.bckfnn.taggersty.performance;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

import io.github.bckfnn.taggersty.CharArrayOutput;
import io.github.bckfnn.taggersty.Filter;
import io.github.bckfnn.taggersty.HtmlTags;
import io.github.bckfnn.taggersty.RawFilter;
import io.github.bckfnn.taggersty.TagsOutput;

/**
 * Performance test based on https://github.com/mbosecke/template-benchmark
 * 
 * 2016-03-30: Result "benchmark":
 * 42962,383 (99.9%) 1467,519 ops/s [Average]
 * (min, avg, max) = (38732,900, 42962,383, 49029,566), stdev = 2964,461
 * CI (99.9%): [41494,864, 44429,902] (assumes normal distribution)
 *
 */
@Fork(5)
@Warmup(iterations = 5)
@Measurement(iterations = 10)
@BenchmarkMode(Mode.Throughput)
@OutputTimeUnit(TimeUnit.SECONDS)
@State(Scope.Benchmark)
public class Performance {
    Filter filter = new RawFilter();
    
    @Setup
    public void setup() throws IOException {
        // no config needed, replicate stocks from context
    }
    
    @Benchmark
    public String benchmark() throws IOException {
        TagsOutput out = new CharArrayOutput();
        HtmlTags w = makeTemplate(Stock.dummyItems());
        w.setAutoIndent(false);
        w.setAutoNewline(false);
        w.render(out);
        return out.toString();
    }
    
    HtmlTags makeTemplate(List<Stock> items) {
        return new HtmlTags(false) {

            @Override
            public void render() {
                textUnescaped("<!DOCTYPE html>");
                html(() -> {
                    head(() -> {
                        title(() -> text("Stock Prices"));
                        meta("http-equiv", "Content-Type", "content", "text/html; charset=UTF-8");
                        meta("http-equiv", "Content-Style-Type", "content", "text/css");
                        meta("http-equiv", "Content-Script-Type", "content", "text/javascript");
                        link("rel", "shortcut icon", "href", "/images/favicon.ico");

                        link("rel", "stylesheet", "type", "text/css", () -> {
                            attr("href", "/css/style.css");
                            attr("media", "all");
                        });
                        script("type", "text/javascript", "src", "/js/util.js", () -> text(""));
                        style("type", "text/css", () -> {
                            cdataComment(() -> {
                                text("body { color: #333333; line-height: 150%; }");
                                text("thead { font-weight: bold; background-color: #CCCCCC; }");
                                text(".odd { background-color: #FFCCCC; }");
                                text(".even { background-color: #CCCCFF; }");
                                text(".minus { color: #FF0000; }");
                            });
                        });
                    });

                    body(() -> {
                        h1(() -> text("Stock Prices"));

                        table(() -> {
                            thead(() -> {
                                tr(() -> {
                                    th(() -> text("#"));
                                    th(() -> text("symbol"));
                                    th(() -> text("name"));
                                    th(() -> text("price"));
                                    th(() -> text("change"));
                                    th(() -> text("ratio"));
                                });
                            });
                            tbody(() -> {
                                for (int i = 0; i < items.size(); i++) {
                                    int i$ = i + 1;
                                    Stock item = items.get(i);
                                    tr("class", i$ % 2 == 0 ? "even" : "odd", () -> {
                                        td(() -> text(String.valueOf(i$)));
                                        td(() -> {
                                            a("href", "/stocks/" + item.getSymbol(), () -> {
                                                text(item.getSymbol());
                                            });
                                        });
                                        td(() -> {
                                            a("href", item.getUrl(), () -> {
                                                text(item.getName());
                                            });
                                        });
                                        td(() -> {
                                            strong(() -> {
                                                text(String.valueOf(item.getPrice()));
                                            });
                                        });
                                        td(() -> {
                                            if (item.getChange() < 0.0) {
                                                attr("class", "minus");
                                            }
                                            text(String.valueOf(item.getChange()));
                                        });
                                        td(() -> {
                                            if (item.getChange() < 0.0) {
                                                attr("class", "minus");
                                            }
                                            text(String.valueOf(item.getRatio()));
                                        });
                                    });
                                }
                            });
                        });
                    });
                });
            }
        }.filter(filter);
    }

}
