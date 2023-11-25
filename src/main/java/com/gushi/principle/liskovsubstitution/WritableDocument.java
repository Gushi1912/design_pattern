package com.gushi.principle.liskovsubstitution;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/11/2 15:17
 */
public class WritableDocument extends Document{

    public void save() {
        System.out.println("文件存储了");
    }
}
