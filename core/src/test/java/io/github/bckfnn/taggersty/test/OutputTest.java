package io.github.bckfnn.taggersty.test;

import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;

import org.junit.Assert;
import org.junit.Test;

import io.github.bckfnn.taggersty.CharArrayOutput;
import io.github.bckfnn.taggersty.CommonsLangFilter;
import io.github.bckfnn.taggersty.HtmlTags;
import io.github.bckfnn.taggersty.OutputStreamOutput;
import io.github.bckfnn.taggersty.StandardFilter;
import io.github.bckfnn.taggersty.StringBuilderOutput;
import io.github.bckfnn.taggersty.TagsOutput;


public class OutputTest {

    @Test
    public void stringBuilder() {
        StringBuilderOutput out = new StringBuilderOutput();

        HtmlTags g = new HtmlTags(out).filter(new CommonsLangFilter());
        g.setAutoIndent(false);
        g.setAutoNewline(false);
        g.text("0123456789");
        Assert.assertEquals("0123456789", out.toString());
    }

    @Test
    public void stringBuilderExpansion() {
        TagsOutput out = new StringBuilderOutput();
        fillBuffer(out);
        Assert.assertEquals(10000, out.toString().length());
    }

    @Test
    public void charArrayExpansion() {
        TagsOutput out = new CharArrayOutput();
        fillBuffer(out);
        Assert.assertEquals(10000, out.toString().length());
    }

    @Test
    public void outputStreamExpansion() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TagsOutput out = new OutputStreamOutput(baos, Charset.forName("UTF-8"));
        fillBuffer(out);
        Assert.assertEquals(10000, baos.size());
    }

    private void fillBuffer(TagsOutput out) {
        HtmlTags g = new HtmlTags(out).filter(new StandardFilter());
        g.setAutoIndent(false);
        g.setAutoNewline(false);
        for (int i = 0;i < 1000; i++) {
            g.text("0123456789");
        }
    }
}
