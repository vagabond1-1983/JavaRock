package com.bt.xlt.homework0319.chencaiyu;

import java.util.Scanner;

/**
 * Created by little_5 on 2016-03-22.
 */
public class ChenCaiYu_Triangle extends ChenCaiYu_Shape {
    @Override
    public void getArea() {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入底：");
        double length = input.nextDouble();
        System.out.print("请输入高：");
        double height = input.nextDouble();
        area = length * height / 2;
        System.out.println("该三角形面积为：" + area);
    }
}
