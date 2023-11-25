package com.gushi.principle.singleresponsibility;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/10/19 19:03
 */
public interface ICourse {

    String getName();

    byte[] getVideo();

    void studyCourse();

    void refundCourse();

}
