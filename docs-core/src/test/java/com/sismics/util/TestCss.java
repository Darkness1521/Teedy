package com.sismics.util;

import org.junit.Assert;
import org.junit.Test;

import com.sismics.util.css.Selector;

/**
 * Test of CSS utilities.
 *
 * @author bgamard
 */
public class TestCss {
    @Test
    public void testBuildCss() {
        Selector selector = new Selector(".test")
            .rule("background-color", "yellow")
            .rule("font-family", "Comic Sans");
        String result = selector.toString();
        Assert.assertTrue(result.contains(".test"));
        Assert.assertTrue(result.contains("background-color: yellow"));
        Assert.assertTrue(result.contains("font-family: Comic Sans"));
        System.out.println(result);
    }

    @Test
    public void testEmptySelector() {
        Selector selector = new Selector("#empty");
        String result = selector.toString();
        Assert.assertTrue(result.contains("#empty"));
        Assert.assertTrue(result.contains("{"));
        Assert.assertTrue(result.contains("}"));
        System.out.println(result);
    }

    @Test
    public void testMultipleRules() {
        Selector selector = new Selector(".multi")
            .rule("color", "red")
            .rule("font-size", "14px")
            .rule("margin", "10px")
            .rule("padding", "5px");
        String result = selector.toString();
        Assert.assertTrue(result.contains("color: red"));
        Assert.assertTrue(result.contains("font-size: 14px"));
        Assert.assertTrue(result.contains("margin: 10px"));
        Assert.assertTrue(result.contains("padding: 5px"));
        System.out.println(result);
    }

    @Test
    public void testChaining() {
        // Test that rule() method returns the selector for chaining
        Selector selector = new Selector(".chain");
        Selector returned = selector.rule("display", "block");
        Assert.assertSame(selector, returned);
    }
}
