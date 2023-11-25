package com.gushi.pattern.creational.factorymethod;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/11/24 16:24
 */
public class Test {
    public static void main(String[] args) {
        WinsowsDialog winsowsDialog = new WinsowsDialog();
        HTMLDialog htmlDialog = new HTMLDialog();
        Button button = winsowsDialog.createButton();
        Button button1 = htmlDialog.createButton();
        button.click();
        button1.click();
    }
}
