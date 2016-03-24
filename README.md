# taggersty

java tag generator template library

A native java 8 library for generating xml & html output.

Main focus is speed and XSS security

## Installation

    <dependency>
        <groupId>io.githib.bckfnn</groupId>
        <artifactId>taggersty-core</artifactId>
        <version>0.0.1-SNAPSHOT</version>
    </dependency>


## Example.

``` java
        HtmlTags.run(out, g -> {
            g.html(() -> {
                g.head(() -> {
                    g.title(() -> g.text("Hello world"));
                });
                g.body(() -> {
                    g.div("id", "content", () -> {
                        g.h1(() -> g.text("Home"));
                        g.p(() -> g.text("Welcome to my home page. My name is Finn"));
                    });
                    g.div("id", "footer", () -> {
                        g.text("Copyright 2016");
                    });
                });
            });
        });
```

