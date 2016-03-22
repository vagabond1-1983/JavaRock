package com.bt.xlt.homework0319.chencaiyu;

import java.util.Scanner;

/**
 * Created by little_5 on 2016-03-22.
 * 定义一个图形父类abstract Shape，包含求面积的方法getArea()，扩展子类：圆Circle、矩形Square、三角形Triangle，分别重写求面积方法。
 * 用户可以选择输入某一个多边形，输入数据后，求出这个多边形的面积
 * Reviewer: beigui
 * Review Date: 2016/3/22
 */
public class ChenCaiYu_Area {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请按照要求输入您想计算面积的图形，圆形输入1，矩形输入2，三角形输入3，其他图形输入0。");
        System.out.print("请输入：");
        int shape = input.nextInt();
        ChenCaiYu_Shape shapeObject = null;
        switch (shape) {
            case 1 :
                shapeObject = new ChenCaiYu_Circle();
                break;
            case 2 :
                shapeObject = new ChenCaiYu_Square();
                break;
            case 3 :
                shapeObject = new ChenCaiYu_Triangle();
                break;
            default:
                System.out.println("暂不支持该类图形的面积计算");
                break;
        }
        if(shapeObject != null) {
            shapeObject.getArea();
        }
    }
}
