package com.gushi.pattern.creational.builder;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/11/28 16:37
 */
public class Test {
    public static void main(String[] args) {
        /*Course course = new Course.CourseBuilder()
                .buildCourseName("Java视频课程")
                .buildCoursePPT("Java视频课程PPT".getBytes())
                .buildCourseQA("Java视频课程问答")
                .buildCourseVideo("Java视频课程".getBytes())
                .buildCourseArticle("Java视频课程手记")
                .makeCourse();
        System.out.println(course);*/
        CourseX courseX = new CourseX.CourseBuilder()
                .buildCourseName("Java视频课程")
                .buildCoursePPT("Java视频课程PPT")
                .buildCourseQA("Java视频课程问答")
                .buildCourseVideo("Java视频课程")
                .buildCourseArticle("Java视频课程手记")
                .build();
        System.out.println(courseX);
    }
}
