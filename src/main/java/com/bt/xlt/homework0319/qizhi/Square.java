package com.bt.xlt.homework0319.qizhi;

/**
 * 子类：矩形，继承父类：Shape，并重写面积
 *
 * Created by QZ on 2016/3/23.
 */
public class Square extends Shape {
    /**
     * 矩形长
     */
    private double length;
    /**
     * 矩形宽
     */
    private double width;

    /**
     * 构造函数
     *
     * @param length 矩形长
     * @param width  矩形宽
     */
    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * 功能：计算矩形面积
     *
     * @return 矩形面积
     */
    @Override
    public double getArea() {
        return length * width;
    }
}
