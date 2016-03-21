package com.bt.xlt.homework0319.xueguiyang;

/**
 * Created by xueguiyang on 16-3-21.
 */
public class XueguiyangCircle extends XueguiyangShape{
    private static final double PI = 3.14;
    private double radius;

    XueguiyangCircle(double r){
        radius = r;
    }
    @Override
    public void getArea() {
       System.out.println("圆形的面积: "+ PI * radius * radius);

    }

}