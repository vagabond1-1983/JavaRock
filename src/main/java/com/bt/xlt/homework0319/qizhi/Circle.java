package com.bt.xlt.homework0319.qizhi;

/**
 * 子类：圆形，继承父类：Shape，并重写面积
 *
 * Created by QZ on 2016/3/23.
 */
public class Circle extends Shape {
    /**
     * 常量PI
     */
    private final double PI = 3.14;
    /**
     * 圆的半径
     */
    private double r;


    /**
     * 构造方法
     *
     * @param r 圆的半径
     */
    public Circle(double r) {
        this.r = r;
    }

    /**
     * 计算圆的面积
     *
     * @return 圆的面积
     */
    @Override
    public double getArea() {
        return r * r * PI;
    }
}
