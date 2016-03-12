package com.bt.xlt.homework0305;

/**
 * Created by little_5 on 2016/3/8.
 * 作业：
 *  请编写一个程序，接收用户输入的三个数，判断是否可以组成三角形（两条边相加大于第三条边）。
 *
 * Reviewer: beigui
 * Review Date: 2016/3/8
 */
public class ChenCaiYu {
    public static void  main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if(a + b > c && a + c > b && b + c > a){
            System.out.println(a + " " + b + " " + c + "可以组成三角形");
        }else{
            System.out.println(a + " " + b + " " + c + "不能组成三角形");
        }
    }
}