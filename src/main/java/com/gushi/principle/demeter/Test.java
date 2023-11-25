package com.gushi.principle.demeter;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/10/25 21:26
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.checkCourseNumber(new TeamLeader());
    }
}
