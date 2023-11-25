package com.gushi.principle.dependenceinversion;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/10/19 13:00
 */
public class Test {
    public static void main(String[] args) {
//        Gugugu gugugu = new Gugugu();
//        gugugu.studyJavaCourse();
//        gugugu.studyFECourse();
//        gugugu.studyPythonCourse();

        Gugugu gugugu = new Gugugu();
        gugugu.study(new StudyJavaCourse());
        gugugu.study(new StudyPythonCourse());
    }
}
