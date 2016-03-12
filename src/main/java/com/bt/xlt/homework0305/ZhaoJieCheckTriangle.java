package com.bt.xlt.homework0305;

/**
 * 第一次作业：三角形判断：两边之和大于第三边；等腰、等边、直角等；
 * Created by Jay on 2016/3/10.
 *
 * Reviewer: beigui
 * Review Date: 2016/3/11
 * Comments: 遵守编码规范，程序考虑比较周到
 */
public class ZhaoJieCheckTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        System.out.println("您输入的三个边分别是：" + a + " " + b + " " + c);
        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c || a + c > b || b + c > a) {
                if (a == b && b == c) {
                    System.out.println("这三个边组成的是等边三角形");
                } else if (a == b || b == c || a == c) {
                    System.out.println("这三个边组成的是等腰三角形");
                } else if (a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b){
                    System.out.println("这三个边组成的是直角三角形");
                }
                else {
                    System.out.println("这三个边组成的是普通三角形");
                }
            } else {
                System.out.println("这三个边不能构成三角形");
            }
        } else {
            System.out.println("这三个边长度不能小于零");
        }
    }
}