package com.gushi.geekbang.unittest;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2024/1/11 11:11
 */
public class TestClass {
    @Test
    public void testNull() {
        Text text1 = new Text("123q");
        Text text2 = new Text("123q ");
        Text text3 = new Text("12 3q");
        Text text4 = new Text("12 3");
        Text text5 = new Text("");
        Text text6 = new Text(null);
        Assert.assertNull(text1.toNumber());
        Assert.assertNull(text2.toNumber());
        Assert.assertNull(text3.toNumber());
        Assert.assertNull(text4.toNumber());
        Assert.assertNull(text5.toNumber());
        Assert.assertNull(text6.toNumber());
    }

    @Test
    public void testNum() {
        Text text1 = new Text("123");
        Text text2 = new Text("123 ");
        Text text3 = new Text(" 123");
        Text text4 = new Text(" 123        ");
        Assert.assertEquals(Integer.valueOf(123), text1.toNumber());
        Assert.assertEquals(Integer.valueOf(123), text2.toNumber());
        Assert.assertEquals(Integer.valueOf(123), text3.toNumber());
        Assert.assertEquals(Integer.valueOf(123), text4.toNumber());
    }
}
