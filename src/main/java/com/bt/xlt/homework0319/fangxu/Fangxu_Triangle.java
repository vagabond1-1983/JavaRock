package com.bt.xlt.homework0319.fangxu;

/**
 * Created by fangxu on 2016/3/20.
 */
import java.util.Scanner;
public class Fangxu_Triangle extends Fangxu_Shape{
    @Override
    public void getArea() {
        System.out.println("请输入三角形的底、高：  (厘米)");
        Scanner bottom = new Scanner(System.in);
        float b = bottom.nextFloat();

        Scanner high = new Scanner(System.in);
        float h = high.nextFloat();

        float Triangle_Area = (b * h) / 2;
        System.out.println("三角形的面积为：" + Triangle_Area + "  平方厘米");
    }
}
