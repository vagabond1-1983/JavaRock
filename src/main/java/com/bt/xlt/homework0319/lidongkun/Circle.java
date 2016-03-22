package com.bt.xlt.homework0319.lidongkun;

import java.util.Scanner;

/**
 * Created by lidongkun on 2016/3/21.
 */
public class Circle extends Shape {
    public void getArea() {
        double area = 0;
        Scanner cl = new Scanner(System.in);
        System.out.println("请输入该园的半径:");
        double radii = cl.nextDouble();

        if(radii > 0) {
            area = radii * radii *3.14;
            System.out.println("园的面积为：" + area);
        }else {
            System.out.println("园的半径不能小于等于零");
        }
    }
}
