package com.gushi.principle.openclose;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/10/18 19:07
 */
public class JavaCourse implements ICourse{

    private Integer id;
    private String name;

    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    @Override
    public Integer getId() {
        return this.id;
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public Double getPrice() {
        return this.price;
    }
}
