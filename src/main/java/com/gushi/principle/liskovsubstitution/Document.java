package com.gushi.principle.liskovsubstitution;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/11/2 14:47
 */
public class Document {
    private byte[] data;

    private String filename;

    public void open() {
        System.out.println(filename + "打开了");
    }
}
