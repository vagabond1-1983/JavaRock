package com.bt.xlt.homework0319.liwen;

/**
 * Created by wen.li on 16/3/21.
 */
public class Triangle extends Shape {
    private float a;
    private float b;
    private float c;

    public Triangle (float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void getArea() {
        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && a + c > b && b + c > a) {
                float p = (a + b + c)/2;
                double s = Math.sqrt((p-a)*(p-b)*(p-c));
                System.out.println(s);
            } else {
                System.out.println("输入三条边不能组成三角形");
            }
        } else {
            System.out.println("false , 三条边长度有一个或多个小于等于0");
        }
    }
}
