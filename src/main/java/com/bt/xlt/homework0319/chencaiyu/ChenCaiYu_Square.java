package com.bt.xlt.homework0319.chencaiyu;

import java.util.Scanner;

/**
 * Created by little_5 on 2016-03-22.
 */
public class ChenCaiYu_Square extends ChenCaiYu_Shape {
    @Override
    public void getArea() {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入长：");
        double length = input.nextDouble();
        System.out.print("请输入宽：");
        double width = input.nextDouble();
        area = length * width;
        System.out.println("该矩形面积为：" + area);
    }
}
