package com.bt.xlt.homework0319.wangxiaojia;

/**
 * Created by 王小佳 on 2016/3/21.
 * 定义一个图形父类abstract Shape，包含求面积的方法getArea()，扩展子类：圆Circle、矩形Square、三角形Triangle，分别重写求面积方法。
 * 用户可以选择输入某一个多边形，输入数据后，求出这个多边形的面积
 * Reviewer: beigui
 * Review Date: 2016/3/25
 */
public abstract class Wangxiaojia_Shape {
    public static void main(String[] args) {
        final float PI=3.14159f;
        wangxiaojia_Area areaCir = new wangxiaojia_Circle(10);
        float circle = areaCir.getArea();
        System.out.println("图形的名称是："+areaCir.getName());
        System.out.println("图形的面积是："+ circle);

        wangxiaojia_Area areaSq = new wangxiaojia_Square(10,20);
        float square = areaSq.getArea();
        System.out.println("图形的名称是："+areaSq.getName());
        System.out.println("图形的面积："+ square);

        wangxiaojia_Area areaTr = new wangxiaojia_Triangle(10,20);
        float Trianle = areaTr.getArea();
        System.out.println("图形的名称是："+ areaTr.getName());
        System.out.println("图形的面积是："+ Trianle);
    }
}
