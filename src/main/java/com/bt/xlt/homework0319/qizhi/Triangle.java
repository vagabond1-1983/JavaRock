package com.bt.xlt.homework0319.qizhi;

/**
 * 子类：三角形，继承父类：Shape，并重写面积
 *
 * Created by QZ on 2016/3/23.
 */
public class Triangle extends Shape {
    /**
     * 三角形底边长
     */
    private double bottom;
    /**
     * 三角形高
     */
    private double height;

    /**
     * 构造方法
     *
     * @param bottom 三角形底边长
     * @param height 三角形高
     */
    public Triangle(double bottom, double height) {
        this.bottom = bottom;
        this.height = height;
    }

    /**
     * 计算三角形的面积
     *
     * @return 三角形面积
     */
    @Override
    public double getArea() {
        return bottom * height / 2;
    }
}
