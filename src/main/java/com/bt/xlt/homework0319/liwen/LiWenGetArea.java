package com.bt.xlt.homework0319.liwen;

import java.util.Scanner;

/**
 * Created by wen.li on 16/3/20.
 * Reviewer: beigui
 * Review Date: 2016/3/23
 */
public class LiWenGetArea {
    public static void main(String[] args) {

        System.out.println("请选择图形Circle、Square、Triangle：");
        Scanner num = new Scanner(System.in);
        String shape = num.nextLine();

        if (shape.equals("Circle")) {
            System.out.println("圆半径：");
            float r = num.nextFloat();
            Shape circle = new Circle(r);
            circle.getArea();

        } else if (shape.equals("Square")) {
            System.out.println("边长：");
            float length = num.nextFloat();
            float width = num.nextFloat();
            Shape square = new Square(length, width);
            square.getArea();

        } else {
            System.out.println("边长：");
            float a = num.nextFloat();
            float b = num.nextFloat();
            float c = num.nextFloat();
            Shape triangle = new Triangle(a, b, c);
            triangle.getArea();
        }
    }
}
