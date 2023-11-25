package com.gushi.principle.singleresponsibility;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/10/19 18:31
 */
public class Test {
    public static void main(String[] args) {
//        Bird bird = new Bird();
//        bird.mainMoveMethod("大雁");
//        bird.mainMoveMethod("鸵鸟");
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMethod("大雁");
        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMethod("企鹅");
    }
}
