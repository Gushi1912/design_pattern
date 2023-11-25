package com.gushi.principle.openclose;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/10/18 21:46
 */
public class DiscountJavaCourse extends JavaCourse{
    public DiscountJavaCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginalPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}
