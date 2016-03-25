package com.bt.xlt.homework0319.qizhi;

import java.util.Scanner;

/**
  * 功能：用户可以选择输入某一个多边形，输入数据后，求出这个多边形的面积
 *
 *  Created by QZ on 2016/3/23.
 *  Reviewer: beigui
 * Review Date: 2016/3/25
 */
public class TestShape {
    public static void main(String[] args) {
        int num = 0;
        boolean flag = true;
        Scanner in = null;
        while (flag) {
            System.out.println("请输入相应的数字进行不同多边形运算【1：圆形 2：矩形 3：三角形】");
            in = new Scanner(System.in);
            try {
                num = in.nextInt();
                if (num != 1 && num != 2 && num != 3) {
                    throw new Exception();
                }
                flag = false;
            } catch (Exception e) {
                System.out.println("输入错误，请重新输入");
            }
        }

        // int num = in.nextInt();
        switch (num) {
            case 1:
                System.out.println("请输入圆的半径：");
                double r = in.nextDouble();
                Shape circle = new Circle(r);
                System.out.println("当圆的半径是：" + r + " 时——>圆的面积是：" + circle.getArea());
                break;
            case 2:
                System.out.println("请输入矩形的长和宽：");
                double length = in.nextDouble();
                double width = in.nextDouble();
                Shape square = new Square(length, width);
                System.out.println("当矩形的长是：" + length + "，宽是：" + width + " 时——>矩形的面积是：" + square.getArea());
                break;
            case 3:
                System.out.println("请输入三角形的底边长和高：");
                double bottom = in.nextDouble();
                double height = in.nextDouble();
                Shape triangle = new Triangle(bottom, height);
                System.out.println("当三角形的底边长是：" + bottom + "，高是：" + height + " 时——>三角形的面积是：" + triangle.getArea());
                break;
            default:
                System.out.println("输入有误，请重新输入");

        }
    }
}
