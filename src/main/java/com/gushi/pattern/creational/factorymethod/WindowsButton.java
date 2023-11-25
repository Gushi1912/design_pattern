package com.gushi.pattern.creational.factorymethod;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/11/24 16:21
 */
public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("windows中渲染结束");
    }

    @Override
    public void click() {
        System.out.println("windows中的按钮点击，绑定本地操作系统点击事件");
    }
}
