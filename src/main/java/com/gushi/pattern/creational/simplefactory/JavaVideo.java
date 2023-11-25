package com.gushi.pattern.creational.simplefactory;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/11/2 17:13
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("生产java视频");
    }
}
