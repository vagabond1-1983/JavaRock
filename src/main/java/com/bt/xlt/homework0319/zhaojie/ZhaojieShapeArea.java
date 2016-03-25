package com.bt.xlt.homework0319.zhaojie;

/**
 * Created by ZhaoJie on 2016/3/22.
 * 功能：输出图形（圆、矩形、三角形）面积
 * Reviewer: beigui
 * Review Date: 2016/3/25
 */
public class ZhaojieShapeArea {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        Square s = new Square(8.0, 5.55);
        Triangle t = new Triangle(5, 12);

        System.out.println("c的面积：" + c.getArea());
        System.out.println("s的面积：" + s.getArea());
        System.out.println("t的面积：" + t.getArea());
    }
}
