package com.bt.xlt.homework0319.zhaojie;

/**
 * Created by ZhaoJie on 2016/3/22.
 * 功能：创建Shape类的子类：矩形类（Square）
 */
public class Square extends Shape {
    private double length;
    private double width;

    Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // 获取矩形的长度
    public double getLength() {
        return length;
    }

    // 获取矩形的宽度
    public double getWidth() {
        return width;
    }

    // 计算矩形面积
    public double getArea() {
        return length * width;
    }
}
