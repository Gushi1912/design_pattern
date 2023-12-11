package com.gushi.pattern.creational.builder;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/11/29 11:22
 */
public class CourseX {
    private String courseName;

    private String courseVideo;

    private String coursePPT;

    private String courseQA;

    private String courseArticle;

    public CourseX(){}

    public CourseX(CourseX old) {
        this.courseArticle = old.courseArticle;
        this.coursePPT = old.coursePPT;
        this.courseVideo = old.courseVideo;
        this.courseName = old.courseName;
        this.courseQA = old.courseQA;
    }

    public static class CourseBuilder{
        private CourseX courseX = new CourseX();

        public CourseBuilder buildCourseName(String courseName) {
            courseX.courseName = courseName;
            return this;
        }

        public CourseBuilder buildCourseVideo(String courseVideo) {
            courseX.courseVideo = courseVideo;
            return this;
        }

        public CourseBuilder buildCoursePPT(String coursePPT) {
            courseX.coursePPT = coursePPT;
            return this;
        }

        public CourseBuilder buildCourseQA(String courseQA) {
            courseX.courseQA = courseQA;
            return this;
        }

        public CourseBuilder buildCourseArticle(String courseArticle) {
            courseX.courseArticle = courseArticle;
            return this;
        }

        public CourseX build() {
            return new CourseX(courseX);
        }
    }

    @Override
    public String toString() {
        return "CourseX{" +
                "courseName='" + courseName + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseQA='" + courseQA + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                '}';
    }
}
