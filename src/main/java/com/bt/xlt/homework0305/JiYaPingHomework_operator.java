package com.bt.xlt.homework0305;/*
思路：1、要可以输入三个数并保存；
      2、if语句去判断条件，两边之和大于第三边，符合是三角形，否则就不是三角形
*/
/**
 * Reviewer: beigui
 * Review Date: 2016/3/6
 * Comments: 用了不同的用户输入方式，很好
 *          TODO 注意逻辑与和按位与的区别
 */

import java.util.Scanner;
public class JiYaPingHomework_operator {
    public static void main (String [] args){
        logicalVSBit();
        Scanner sc =new Scanner(System.in);
        System.out.println("输入第一个数");
        int a =sc.nextInt();
        System.out.println("输入第二个数");
        int b =sc.nextInt();
        System.out.println("输入第三个数");
        int c =sc.nextInt();
        if ((a+b)>c &(a+c) > b &(b+c)>a)
        {
         System.out.println(" 输入的是三角形");
        }else {
            System.out.println("输入的不是三角形");
        }

    }

    /**
     * && 逻辑与 vs & 按位与
     * 一般用逻辑与&&就好
     * && 逻辑与也称作短路连接，第一个条件不满足则不再继续下一个条件的判断，直接判定整个表达式为false
     */
    private static void logicalVSBit() {
        //&&只要第一个条件是false，就不会去执行第2个条件
        //但&不管第一个条件是不是false，都会执行第2个条件遇到这样的情况，结果就会不一样了
        int i = 1;
        int j = 1;
        if ((i++ < 0) & (j++ > 0)){

        }
        System.out.println("按位与之后j=" + j);

        i = 1;
        j = 1;
        if ((i++ < 0) && (j++ > 0)){

        }
        System.out.println("逻辑与之后j=" + j);
    }
}