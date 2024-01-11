package com.gushi.geekbang.unittest;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2024/1/11 11:08
 */
public class Text {

    private String content;

    public Text(String context) {
        this.content = context;
    }

    public Integer toNumber() {
        if (content == null|| content.isEmpty()) {
            return null;
        }
        content = content.trim();
        try {
            return Integer.parseInt(content);
        } catch (Exception e) {
            return null;
        }
    }
}
