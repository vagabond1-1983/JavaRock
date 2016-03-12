package com.bt.xlt.homework0305;

/**
 * Created by lenovo on 2016/3/7.
 * Reviewer: beigui
 * Review Date: 2016/3/7
 * Comments: 跟别人不同的思路，思路开阔。
 */
public class MaXiaoYu {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        System.out.println("请输入三个整数：");
        System.out.println(a + "，" + b + "，" + c);
        int p = (Math.abs(a-b-c)-(a-b-c))*(Math.abs(b-a-c)-(b-a-c))*(Math.abs(c-a-b)-(c-a-b));
        switch (p){
            case 0:
            System.out.print("不");
            break;
        }
        System.out.println("可以构成三角形");
    }
}