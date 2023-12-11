package com.gushi.pattern.creational.abstractfactory;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/11/26 16:20
 */
public class PythonCourseFactory implements CourseFactory{
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
