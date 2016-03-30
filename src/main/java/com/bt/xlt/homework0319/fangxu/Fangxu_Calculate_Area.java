package com.bt.xlt.homework0319.fangxu;

/**
 * Created by fangxu on 2016/3/20.
 */
import java.util.Scanner;

public class Fangxu_Calculate_Area {
    public static void main(String[] args) {

        System.out.println("请选择图像类型：（1：圆形； 2：三角形； 3：矩形；）");
        Scanner ShapeType = new Scanner(System.in);
        int Type = ShapeType.nextInt();

        if (Type == 1) {
            Fangxu_Shape CircleArea = new Fangxu_Circle();
            CircleArea.getArea();
        } else if (Type == 2) {
            Fangxu_Shape TriangleArea = new Fangxu_Triangle();
            TriangleArea.getArea();
        } else if (Type == 3) {
            Fangxu_Shape SquareArea = new Fangxu_Square();
            SquareArea.getArea();
        } else {
            System.out.println("没有该类型的图形");
        }
    }
}
