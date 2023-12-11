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

    public Course (CourseBuilder courseBuilder) {
        this.courseName = courseBuilder.courseName;
        this.courseVideo = courseBuilder.courseVideo;
        this.courseArticle = courseBuilder.courseArticle;
        this.coursePPT = courseBuilder.coursePPT;
        this.courseQA = courseBuilder.courseQA;
    }

    public static class CourseBuilder{
        private String courseName;

        private byte[] courseVideo;

        private byte[] coursePPT;

        private String courseQA;

        private String courseArticle;


        public CourseBuilder buildCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder buildCourseVideo(byte[] courseVideo) {
            this.courseVideo = courseVideo;
            return this;
        }

        public CourseBuilder buildCoursePPT(byte[] coursePPT) {
            this.coursePPT = coursePPT;
            return this;
        }

        public CourseBuilder buildCourseQA(String courseQA) {
            this.courseQA = courseQA;
            return this;
        }

        public CourseBuilder buildCourseArticle(String courseArticle) {
            this.courseArticle = courseArticle;
            return this;
        }

        public Course makeCourse() {
            return new Course(this);
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
