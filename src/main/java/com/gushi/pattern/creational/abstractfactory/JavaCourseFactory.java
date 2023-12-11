package com.gushi.pattern.creational.abstractfactory;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/11/26 16:20
 */
public class JavaCourseFactory implements CourseFactory{
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
