package com.bt.xlt.homework0319.fangxu;

/**
 * Created by fangxu on 2016/3/20.
 */
import java.util.Scanner;
public class Fangxu_Square extends Fangxu_Shape {
    @Override
    public void getArea() {
    System.out.println("请输入矩形的长、宽：  (厘米)");
    Scanner length = new Scanner(System.in);
    float L = length.nextFloat();

    Scanner high = new Scanner(System.in);
    float h = high.nextFloat();

    float Square_Area = (L * h);
    System.out.println("矩形的面积为：" + Square_Area + "  平方厘米");
    }

}
