package com.gushi.principle.singleresponsibility;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/10/19 18:27
 */
public class Bird {
    public void mainMoveMethod(String bird) {
        if("鸵鸟".equals(bird)) {
            System.out.println(bird + "用脚走");
        } else {
            System.out.println(bird + "用翅膀飞");
        }
    }
}
