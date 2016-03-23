package com.bt.xlt.homework0319.liwen;

/**
 * Created by wen.li on 16/3/20.
 */
public class Circle extends Shape {
    public float r;

    public Circle (float r) {
        this.r = r;
    }

    @Override
    public void getArea() {
        System.out.print("圆的面积为：");
        System.out.println(Math.PI*r*r);
    }
}
