package com.bt.xlt.homework0319.maxiaoyu;

/**
 * Created by maxy on 2016/3/23.
 */
public class Circle extends Shape {

    protected double r;
    Circle( double r ) {
        this.shapetype = "圆形";
        this.r = r;
    }

    protected double getArea() {
        this.area = Math.PI * r * r;
        return area;
    }
}
