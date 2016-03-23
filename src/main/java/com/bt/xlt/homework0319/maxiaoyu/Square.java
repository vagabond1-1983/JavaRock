package com.bt.xlt.homework0319.maxiaoyu;

/**
 * Created by maxy on 2016/3/23.
 */
public class Square extends Shape {

    protected double a;
    protected double b;
    Square( double a, double b ) {
        this.shapetype = "矩形";
        this.a = a;
        this.b = b;
    }

    protected double getArea() {
        this.area = a * b;
        return area;
    }
}
