package com.bt.xlt.homework0305;

import java.util.Scanner;

/**
 * Created by binjia on 2016/3/5.
 * Reviewer: beigui
 * Review Date: 2016/3/6
 * Comments: 能考虑到一些异常情况，并用了不同的用户输入方式，能考虑到三角形的边长可以是非整数，很好
 */
public class JiaBinPanDuanSanJiaoXing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个正数：");

        try{
            Float a = sc.nextFloat();
            Float b = sc.nextFloat();
            Float c = sc.nextFloat();
            if (a<=0 || b<=0 || c<=0){
                System.out.println("请输入正数！");
            }else if(((a+b)>c) && (a+c)>b && (b+c)>a){
                System.out.println("a,b,c可以构成三角形");
            }else{
                System.out.println("a,b,c不可以构成三角形");
            }
        }catch (Exception e){
            System.out.println("请输入正数！");
        }

    }

}