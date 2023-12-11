package com.gushi.pattern.creational.abstractfactory;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/11/26 16:21
 */
public class Test {
    public static void main(String[] args) {

        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        Video video = javaCourseFactory.getVideo();
        Article article = javaCourseFactory.getArticle();
        video.make();
        article.edit();
    }
}
