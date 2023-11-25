package com.gushi.principle.demeter;

import java.util.ArrayList;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/10/25 21:23
 */
public class Boss {

    public void checkCourseNumber(TeamLeader teamLeader) {
        teamLeader.checkNumberOfCourse();
    }
}
