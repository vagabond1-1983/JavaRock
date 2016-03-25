package com.bt.xlt.homework0319.jiabin_ref;

/**
 * Created by bin.jia on 2016/3/21.
 */
public class JiaBinTriangle extends JiaBinShape {
    private double length;
    private double height;

    public JiaBinTriangle(double length,double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public void getArea() {
        area = length * height / 2;
        System.out.println("该三角形的面积为：" + area);
    }

//    @Override
//    public void getArea(double length, double height) {
//        area = length * height / 2;
//        System.out.println("该三角形的面积为：" + area);
//    }
//
//    @Override
//    public void getArea(double num) {
//
//    }
}
