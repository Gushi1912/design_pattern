package com.gushi.pattern.creational.abstractfactory;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/11/26 16:18
 */
public class JavaArticle implements Article{
    @Override
    public void edit() {
        System.out.println("开始编写Java课程手记");
    }
}
