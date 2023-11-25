package com.gushi.pattern.creational.factorymethod;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/11/24 16:21
 */
public class HTMLButton implements Button{
    @Override
    public void render() {
        System.out.println("HTML中渲染结束");
    }

    @Override
    public void click() {
        System.out.println("HTML中的按钮点击，绑定网络浏览器点击事件");
    }
}
