package com.gushi.principle.dependenceinversion;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/10/19 12:58
 */
public class Gugugu {



    public void study(ICourse course) {
        course.study();
    }

    public void studyJavaCourse() {
        System.out.println("gugugu学习java课程");
    }
    public void studyFECourse() {
        System.out.println("gugugu学习FE课程");
    }
    public void studyPythonCourse() {
        System.out.println("gugugu学习python课程");
    }
}
