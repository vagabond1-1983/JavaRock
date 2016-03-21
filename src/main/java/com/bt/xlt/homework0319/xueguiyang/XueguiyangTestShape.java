package com.bt.xlt.homework0319.xueguiyang;

/**
 * Created by xueguiyang on 16-3-21.
 * Reviewer: beigui
 * Review Date: 2016/3/21
 * Comments: 构造函数的访问范围.当构造函数是默认的访问权限时，意味着其他包下面，无法进行实例化。改为public
 */
public class XueguiyangTestShape {
    public static void main(String[] args) {
        XueguiyangShape circle = new XueguiyangCircle(2.0);
        circle.getArea();
        XueguiyangShape square = new XueguiyangSquare(23,43);
        square.getArea();
        XueguiyangShape triangle = new XueguiyangTriangle(23.2,21.2);
        triangle.getArea();


    }
}
