package com.bt.xlt.homework0319.jiabin_ref;

/**
 * Created by bin.jia on 2016/3/21.
 */
public class JiaBinCircle extends JiaBinShape {
    final double PI = 3.14;
    private double radius;

    public JiaBinCircle(double radius){
        this.radius = radius;
    }

    @Override
    public void getArea() {
        area = PI * Math.pow(radius,2);
        System.out.println("该圆形的面积为：" + area);
    }

//    @Override
//    public void getArea(double radius) {
//        area = PI * Math.pow(radius,2);
//        System.out.println("该圆形的面积为：" + area);
//    }
//
//    @Override
//    public void getArea(double num1, double num2) {
//
//    }
}
