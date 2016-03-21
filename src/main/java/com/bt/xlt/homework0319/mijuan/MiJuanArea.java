package com.bt.xlt.homework0319.mijuan;

/**
 * Created by mijua on 3/19/2016.
 * Reviewer: beigui
 * Review Date: 2016/3/21
 */
public class MiJuanArea {
    public static void main(String[] args) {
        abstractShape circle = new Circle();
        abstractShape square = new Square();
        abstractShape triangle = new Triangle();

        /**圆的面积*/
        circle.getArea();

        /**矩形面积*/
        square.getArea();

        /**三角形面积*/
        triangle.getArea();
    }
}
