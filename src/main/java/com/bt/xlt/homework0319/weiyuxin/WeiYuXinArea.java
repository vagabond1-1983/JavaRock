package com.bt.xlt.homework0319.weiyuxin;

import java.util.Scanner;

/**
 * Created by yuxinwei on 2016/3/22.
 * 功能：定义一个图形父类abstract Shape，包含求面积的方法getArea()
 * 扩展子类：圆Circle、矩形Square、三角形Triangle，分别重写求面积方法
 * Reviewer: beigui
 * Review Date: 2016/3/22
 * Comments: 抽象类的定义，因为他不知道应该怎么样去实现这个功能，才抽象了，把权力下发到子类中实现。而不是所有的东西都在自己这做。
 */
abstract class Shape{
    double area;
    double r;
    double width;
    double length;
    double height;
    double bottom;
    public void valueCircle(double r){
        this.r = r;
    }
    public void valueSquare(double width,double length){
        this.width = width;
        this.length = length;
    }
    public void valueTriangle(double height,double bottom){
        this.height = height;
        this.bottom = bottom;
    }
    abstract void getArea();
}
class Circle extends Shape{
    void getArea(){
        System.out.println("请输入圆形的半径： ");
        Scanner s = new Scanner(System.in);
        super.valueCircle(s.nextDouble());
        super.area = 3.14*super.r*super.r;
        System.out.println("圆的面积是： "+super.area);
    }
    }
class Square extends Shape{
    void getArea(){
        System.out.println("请输入矩形的宽度和长度： ");
        Scanner s = new Scanner(System.in);
        super.valueSquare(s.nextDouble(),s.nextDouble());
        super.area = super.width* super.length;
        System.out.println("矩形的面积是： "+super.area);
    }
}
class Triangle extends Shape{
    void getArea(){
        System.out.println("请输入三角形的高和底： ");
        Scanner s = new Scanner(System.in);
        super.valueTriangle(s.nextDouble(),s.nextDouble());
        super.area = 0.5*super.height*super.bottom;
        System.out.println("三角形的面积是： "+super.area);
    }
} 
public class WeiYuXinArea{
    public static void main(String[] args) {
        Circle cir = new Circle();
        cir.getArea();
        Square squ = new Square();
        squ.getArea();
        Triangle tri = new Triangle();
        tri.getArea();
    }
}