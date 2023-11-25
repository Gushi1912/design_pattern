package com.gushi.principle.singleresponsibility;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/10/19 19:50
 */
public class CourseImpl implements ICourseContent, ICourseManage{
    @Override
    public String getName() {
        return null;
    }

    @Override
    public byte[] getVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
