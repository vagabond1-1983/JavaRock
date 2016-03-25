package com.bt.xlt.homework0319.jiabin_ref;

/**
 * Created by bin.jia on 2016/3/21.
 */
public class JiaBinSquare extends JiaBinShape {
    private double length1;
    private double length2;

    public JiaBinSquare(double length1,double length2){
        this.length1 = length1;
        this.length2 = length2;
    }

    @Override
    public void getArea() {
        area = length1 * length2;
        System.out.println("该矩形的面积为：" + area);
    }

//    @Override
//    public void getArea(double length1, double length2) {
//        area = length1 * length2;
//        System.out.println("该矩形的面积为：" + area);
//    }
//
//    @Override
//    public void getArea(double num) {
//
//    }
}
