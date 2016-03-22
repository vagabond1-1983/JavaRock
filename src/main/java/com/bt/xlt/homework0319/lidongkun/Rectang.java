package com.bt.xlt.homework0319.lidongkun;

import java.util.Scanner;

/**
 * Created by lidongkun on 2016/3/21.
 */
public class Rectang extends Shape{
    public void getArea() {
        double area = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入矩形的长：");
        double a = sc.nextDouble();
        System.out.println("请输入矩形的宽：");
        double b = sc.nextDouble();

        if(a > 0 && b > 0) {
            area = a * b;
            System.out.println("矩形的面积为：" + area);
        }else {
            System.out.println("矩形的长和宽都不能小于零.");
        }

    }

}
