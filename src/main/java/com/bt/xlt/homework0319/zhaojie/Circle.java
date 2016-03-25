package com.bt.xlt.homework0319.zhaojie;

/**
 * Created by ZhaoJie on 2016/3/22.
 * 功能：创建Shape类的子类：圆形类（Circle）
 */
public class Circle extends Shape {
    private final double PI = 3.14;
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // 取半径
    public double getRadius() {
        return radius;
    }

    // 计算圆面积
    public double getArea() {
        return PI * radius * radius;
    }
}
