package com.gushi.pattern.creational.simplefactory;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/11/2 17:14
 */
public class PythonVideo extends Video{
    @Override
    public void produce() {
        System.out.println("生产python视频");
    }
}
