package com.gushi.pattern.creational.singleton;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/11/29 14:42
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;
    private LazySingleton(){
    }
    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
