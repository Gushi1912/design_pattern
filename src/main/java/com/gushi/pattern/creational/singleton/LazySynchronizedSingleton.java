package com.gushi.pattern.creational.singleton;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/11/29 15:58
 */
public class LazySynchronizedSingleton {
    private static LazySynchronizedSingleton lazySynchronizedSingleton = null;

    private LazySynchronizedSingleton() {

    }

    public static synchronized LazySynchronizedSingleton getInstance() {
        if (lazySynchronizedSingleton == null) {
            lazySynchronizedSingleton = new LazySynchronizedSingleton();
        }
        return lazySynchronizedSingleton;
    }
}
