package com.gushi.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/10/25 21:23
 */
public class TeamLeader {

    public void checkNumberOfCourse() {
        ArrayList<Course> courses = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courses.add(new Course());
        }
        System.out.println("在线课程数量为：" + courses.size());
    }
}
