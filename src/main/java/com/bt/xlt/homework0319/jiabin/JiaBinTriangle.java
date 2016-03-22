package com.bt.xlt.homework0319.jiabin;

/**
 * Created by bin.jia on 2016/3/21.
 */
public class JiaBinTriangle extends JiaBinShape {

    @Override
    public void getArea(double length, double height) {
        area = length * height / 2;
        System.out.println("该三角形的面积为：" + area);
    }

    @Override
    public void getArea(double num) {

    }
}
