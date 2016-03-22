package com.bt.xlt.homework0319.chencaiyu;

import java.util.Scanner;

/**
 * Created by little_5 on 2016-03-22.
 */
public class ChenCaiYu_Circle extends ChenCaiYu_Shape {
    @Override
    public void getArea() {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入半径长度：");
        double edge = input.nextDouble();
        area = edge * edge * Math.PI;
        System.out.println("该圆形面积为：" + area);
    }
}
