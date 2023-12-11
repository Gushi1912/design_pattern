package com.gushi.pattern.creational.abstractfactory;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/11/26 16:17
 */
public class JavaVideo implements Video{
    @Override
    public void make() {
        System.out.println("开始制作Java课程视频");
    }
}
