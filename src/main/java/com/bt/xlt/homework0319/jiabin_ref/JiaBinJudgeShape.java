package com.bt.xlt.homework0319.jiabin_ref;


import java.util.Scanner;

/**
 * Created by bin.jia on 2016/3/21.
 */
public class JiaBinJudgeShape {

    public void judgeShape(int shape) {
        Scanner s = new Scanner(System.in);
        switch (shape) {
            case 1:
                System.out.println("请输入圆形半径：");
                double radius = s.nextDouble();
                JiaBinShape circle = new JiaBinCircle(radius);
                circle.getArea();
                break;
            case 2:
                System.out.println("请输入矩形的两个边长：");
                double length1 = s.nextDouble();
                double length2 = s.nextDouble();
                JiaBinShape square = new JiaBinSquare(length1,length2);
                square.getArea();
                break;
            case 3:
                System.out.println("请输入三角形的底和高：");
                double length = s.nextDouble();
                double height = s.nextDouble();
                JiaBinShape triangle = new JiaBinTriangle(length,height);
                triangle.getArea();
                break;
            default:
                System.out.println("输入数字有误，请输入数字1、2、3！");

        }
    }
}
