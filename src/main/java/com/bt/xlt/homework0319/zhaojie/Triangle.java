package com.bt.xlt.homework0319.zhaojie;

/**
 * Created by ZhaoJie on 2016/3/22.
 * 功能：创建Shape类的子类：三角形类（Triangle）
 */
public class Triangle extends Shape {
    private double base;
    private double high;

    Triangle(double base, double high) {
        this.base = base;
        this.high = high;
    }

    // 获取三角形的底
    public double getBase() {
        return base;
    }

    // 获取三角形的高
    public double getHigh() {
        return high;
    }

    // 计算三角形面积
    public double getArea() {
        return base * high * 1 / 2;
    }
}
