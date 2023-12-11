package com.gushi.pattern.creational.abstractfactory;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/11/26 16:18
 */
public class PythonVideo implements Video{
    @Override
    public void make() {
        System.out.println("开始制作python视频课程");
    }
}
