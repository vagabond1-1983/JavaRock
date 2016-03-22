package com.bt.xlt.homework0319.chencaiyu;

/**
 * Created by little_5 on 2016-03-22.
 * 定义一个图形父类abstract Shape，包含求面积的方法getArea()，扩展子类：圆Circle、矩形Square、三角形Triangle，分别重写求面积方法。
 * 用户可以选择输入某一个多边形，输入数据后，求出这个多边形的面积
 */
public abstract class ChenCaiYu_Shape {
    double area;
    public abstract void getArea();
}
