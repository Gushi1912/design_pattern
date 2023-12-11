package com.gushi.pattern.creational.singleton;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/11/29 16:46
 */
public class T implements Runnable{
    @Override
    public void run() {
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ": " + instance);
    }
}
