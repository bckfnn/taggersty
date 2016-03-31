# taggersty

java tag generator template library

A native java 8 library for generating xml & html output.

Main focus is speed and XSS security

## Installation

    <dependency>
        <groupId>io.github.bckfnn</groupId>
        <artifactId>taggersty-core</artifactId>
        <version>0.0.2-SNAPSHOT</version>
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

## Main points

1. Your html views are coded in ordinary well known java.
2. The templating is speedy.
3. Content and html attributes are correctly escaped.
4. The whole java language is available in your templates.

Cons:

1. The current version of the java compiler (java8 & eclipse) is taking its time to compile huge templates.
4. The whole java language is available in your templates. :smile:  


## Modules

* core: the core template HtmlTags
* vertx: en extended HtmlTags with helpers methods for callback and streams. 
* performance: A small performace test using JMH. An implementation of the [template-benchmark](https://github.com/mbosecke/template-benchmark) by Mitchell Bösecke
 