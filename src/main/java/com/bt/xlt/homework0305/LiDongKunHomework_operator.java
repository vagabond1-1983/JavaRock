package com.bt.xlt.homework0305;

/**
 * Created by lenovo on 2016/3/6.
 * Reviewer: beigui
 * Review Date: 2016/3/7
 */
public class LiDongKunHomework_operator {
    public static void main(String[] agrs){
        int a=Integer.parseInt(agrs[0]);
        int b=Integer.parseInt(agrs[1]);
        int c=Integer.parseInt(agrs[2]);
        System.out.println("请输入三角形第一个边的长"+a);
        System.out.println("请输入三角形第二条边的长"+b);
        System.out.println("请输入三角形第三条边的长"+c);
        if((a+b)>c&&(a+c)>b&&(c+b)>a){
            System.out.println("可以组成一个三角形");
        }
        else{
            System.out.println("不能组成一个三角形");
        }
    }
}
