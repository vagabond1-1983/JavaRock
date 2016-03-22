package com.bt.xlt.homework0319.lidongkun;

import java.util.Scanner;

/**
 * Created by lidongkun on 2016/3/21.
 */
public class Triangle extends Shape {
    public void getArea() {
        double area = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("三角形的底长为：");
        double a = sc.nextDouble();
        System.out.println("三角形的高为：");
        double b = sc.nextDouble();

       if(a > 0 && b > 0) {
           area = a * b / 2;
           System.out.println("三角形的面积为" + area);
       }else {
           System.out.println("三角形的底和高均不能为0.");
       }


    }
}
