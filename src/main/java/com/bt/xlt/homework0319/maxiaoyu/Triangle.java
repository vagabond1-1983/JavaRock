package com.bt.xlt.homework0319.maxiaoyu;

/**
 * Created by maxy on 2016/3/23.
 */
public class Triangle extends Shape {

    protected double a;
    protected double h;
    Triangle( double a, double h ) {
        this.shapetype = "三角形";
        this.a = a;
        this.h = h;
    }

    protected double getArea() {
        this.area = 0.5 * a * h;
        return area;
    }
}
