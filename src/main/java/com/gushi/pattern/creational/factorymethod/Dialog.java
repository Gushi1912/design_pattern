package com.gushi.pattern.creational.factorymethod;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/11/24 16:22
 */
public abstract class Dialog {

    public void Render() {
        Button button = createButton();
        button.click();
        button.render();
    }

    public abstract Button createButton();
}
