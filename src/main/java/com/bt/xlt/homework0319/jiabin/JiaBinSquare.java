package com.bt.xlt.homework0319.jiabin;

/**
 * Created by bin.jia on 2016/3/21.
 */
public class JiaBinSquare extends JiaBinShape{

    @Override
    public void getArea(double length1, double length2) {
        area = length1 * length2;
        System.out.println("该矩形的面积为：" + area);
    }

    @Override
    public void getArea(double num) {

    }
}
