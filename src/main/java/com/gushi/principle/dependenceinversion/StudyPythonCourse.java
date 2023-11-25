package com.gushi.principle.dependenceinversion;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/10/19 13:02
 */
public class StudyPythonCourse implements ICourse{
    @Override
    public void study() {
        System.out.println("学习python课程");
    }
}
