package com.gushi.pattern.creational.factorymethod;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/11/24 16:23
 */
public class WinsowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
