package com.bt.xlt.homework0305;

/**
 * Created by QZ on 2016/3/6.
 * Reviewer: beigui
 * Review Date: 2016/3/6
 * Comments: 注意代码规范
 */
public class QiZhiTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        System.out.println("输入的三边之长分别是 a=" + a + ",b=" + b +",c=" + c);
        if(a + b> c && a + c > b && c + b > a){
            System.out.println("可以组成三角形");
        }
            else System.out.println("不符合三角形组成条件，所以不能组成三角形");

    }
}
