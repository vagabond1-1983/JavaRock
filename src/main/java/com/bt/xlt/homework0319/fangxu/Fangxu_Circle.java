package com.bt.xlt.homework0319.fangxu;

/**
 * Created by fangxu on 2016/3/19.
 */
import java.util.Scanner;
public class Fangxu_Circle extends Fangxu_Shape {
    @Override
    public void getArea() {
        System.out.println("请输入圆形的半径（π=3.14）：  (厘米)");
        Scanner Radius = new Scanner(System.in);
        float r = Radius.nextFloat();

        float Circle_Area = Pi * r * r;
        System.out.println("圆形的面积为：" + Circle_Area + "  平方厘米");
    }
}
