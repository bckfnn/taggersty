# taggersty

java tag generator template library

A native java 8 library for generating xml & html output.

Main focus is speed and XSS security

[ ![Download](https://api.bintray.com/packages/bckfnn/maven/taggersty/images/download.svg) ](https://bintray.com/bckfnn/maven/taggersty/_latestVersion)

## Installation

    <dependency>
        <groupId>io.github.bckfnn</groupId>
        <artifactId>taggersty-core</artifactId>
        <version>0.0.6</version>
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
5. Alsways perfectly matched html tags.
6. Support indented as well as 'minified' putput. 

Cons:

1. The current version of the java compiler (java8 & eclipse) is taking its time to compile huge templates.
4. The whole java language is available in your templates. :smile:  


## Modules

* core: the core template HtmlTags
* vertx: en extended HtmlTags with helpers methods for callback and streams.
* xslfo: a DSL that generated [XSL:FO](https://www.w3.org/TR/xsl11/) formatting object
* performance: A small performace test using JMH. An implementation of the [template-benchmark](https://github.com/mbosecke/template-benchmark) by Mitchell Bösecke

## Complex templates

Implementing the [example from rocker](https://github.com/fizzed/rocker/blob/master/docs/SYNTAX.md#building-complex-templates)


    /**
     * An index page that uses a common "main" page for page layout.
     */
    private void index() {
        StringBuilderOutput out = new StringBuilderOutput();

        HtmlTags g = new HtmlTags(out).filter(new StandardFilter());
        
        Tags.Generator extracss = () -> {
            g.link("rel", "stylesheet", "href", "/assets/css/main.css");
        };
        main(g, "Home", extracss, () -> {}, () -> {
            g.h1(() -> g.text("Hello!"));
        });
        
        System.out.println(out);
    }
    
    /**
     * The common page
     * @param g the tags generator
     * @param title page title
     * @param extracss extra css.
     * @param extrajs extra js.
     * @param content the page content.
     */
    private void main(HtmlTags g, String title, Tags.Generator extracss, Tags.Generator extrajs, Tags.Generator content) {
        g.html(() -> {
            g.head(() -> {
                g.title(() -> g.text(title));
                g.link("rel", "stylesheet", "href", "/assets/css/bootstrap.min.css");
                extracss.gen();
            });
            g.body(() -> {
                content.gen();
                g.script("type", "text/javascript", "src", "/assets/js/jquery-1.10.2.min.js", () -> {});
                extrajs.gen();
            });
        });
    }
 