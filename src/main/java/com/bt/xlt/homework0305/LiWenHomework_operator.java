package com.bt.xlt.homework0305;

/**
 * Created by wen.li on 16/3/5.
 *  作业：
 *  请编写一个程序，接收用户输入的三个数，判断是否可以组成三角形（两条边相加大于第三条边）。
 *
 * Reviewer: beigui
 * Review Date: 2016/3/7
 * Comments: 能检查输入参数个数，很好。
 */
public class LiWenHomework_operator {

    public static void main(String[] args){

        int len = args.length;

        if (len < 3 || len > 3){

            System.out.println("用户输入边数值大于或者小于3个数");

        }else {

            float a =Float.parseFloat(args[0]);
            float b =Float.parseFloat(args[1]);
            float c =Float.parseFloat(args[2]);

            System.out.println("a = "+ a + ", b = " + b + ", c = " + c);

            if (a > 0 && b > 0 && c > 0){
                if (a + b > c && a + c > b && b + c > a){
                    System.out.println("ok");
                }else{
                    System.out.println("false");
                }
            }else{
                System.out.println("false , 三条边长度有一个或多个小于等于0");
            }
        }
    }
}


