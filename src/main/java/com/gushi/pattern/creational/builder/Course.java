package com.gushi.pattern.creational.builder;

import java.util.Arrays;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/11/27 16:52
 */
public class Course {
    private String courseName;

    private byte[] courseVideo;

    private byte[] coursePPT;

    private String courseQA;

    private String courseArticle;

    public static class CourseActualBuilder extends CourseBuilder {

         x

        @Override
        public CourseBuilder buildCourseName(String courseName) {

            return null;
        }

        @Override
        public CourseBuilder buildCourseVideo(byte[] courseVideo) {
            return null;
        }

        @Override
        public CourseBuilder buildCoursePPT(byte[] coursePPT) {
            return null;
        }

        @Override
        public CourseBuilder buildCourseQA(String courseQA) {
            return null;
        }

        @Override
        public CourseBuilder buildCourseArticle(String courseArticle) {
            return null;
        }

        @Override
        public Course makeCourse() {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseVideo=" + Arrays.toString(courseVideo) +
                ", coursePPT=" + Arrays.toString(coursePPT) +
                ", courseQA='" + courseQA + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                '}';
    }
}
