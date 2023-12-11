package com.gushi.pattern.creational.singleton;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/11/29 17:46
 */
public class InnerStaticClassSingleton {
    private InnerStaticClassSingleton () {

    }

    private static class InnerClass{
        private static InnerStaticClassSingleton innerStaticClassSingleton = new InnerStaticClassSingleton();
    }

    public static InnerStaticClassSingleton getInstance() {
        return InnerClass.innerStaticClassSingleton;
    }
}
