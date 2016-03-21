package com.bt.xlt.homework0319.lichangxing;

/**
 * Created by LiChangxing on 2016/3/20.
 * Reviewer: beigui
 * Review Date: 2016/3/21
 * Comments: 用构造函数初始化属性值，会比可变长度的参数要好
 *           因为可变长度的参数，你无法限定使用时的问题，检查会增多。在一个系统里，需要做限制的，用语言去限制最有效最可靠，人的输入都是不可控的。
 */
public class LiChangxingTestShapeDemo {
    public static void main( String[] args ) {

        LiChangxingAbstractShape circle = new LichanxingCircle();
        LiChangxingAbstractShape square = new LiChangxingSquare();
        LiChangxingAbstractShape triangle = new LiChangxingTriangle();

        //求圆的面积
        System.out.println("圆的面积为：" + circle.getArea(4));

        //求矩形的面积
        System.out.println("矩形的面积：" + square.getArea(5,7));

        //求三角形面积
        System.out.println("三角形面积为：" + triangle.getArea(5,6));

    }
}
