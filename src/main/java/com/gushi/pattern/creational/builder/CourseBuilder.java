package com.gushi.pattern.creational.builder;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/11/27 16:53
 */
public abstract class CourseBuilder {

    public abstract CourseBuilder buildCourseName(String courseName);
    public abstract CourseBuilder buildCourseVideo(byte[] courseVideo);
    public abstract CourseBuilder buildCoursePPT(byte[] coursePPT);
    public abstract CourseBuilder buildCourseQA(String courseQA);
    public abstract CourseBuilder buildCourseArticle(String courseArticle);

    public abstract Course makeCourse();
}
