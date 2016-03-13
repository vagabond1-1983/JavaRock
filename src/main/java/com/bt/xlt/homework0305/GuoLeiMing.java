package com.bt.xlt.homework0305;

/**
 * Reviewer: beigui
 * Review Date: 2016/3/13
 */
public class GuoLeiMing {
    public static void main(String[] agrs) {

        int a = Integer.parseInt(agrs[0]);
        int b = Integer.parseInt(agrs[0]);
        int c = Integer.parseInt(agrs[0]);
        System.out.println("第一个边长" + a);
        System.out.println("第二个边长" + b);
        System.out.println("第三个边长" + c);

        if ((a + b) > c && (a + c) > b && (c + b) > a) {
            System.out.println("可以组成三角形");
        } else {
            System.out.println("不能组成三角形");
        }
    }
}