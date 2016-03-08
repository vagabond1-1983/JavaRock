package com.bt.xlt.homework0305;

/**
 * Created by Administrator on 2016/3/5.
 *
 *
 * 作业：
 *  请编写一个程序，接收用户输入的三个数，判断是否可以组成三角形（两条边相加大于第三条边）。
 *
 * Reviewer: beigui
 * Review Date: 2016/3/8
 */

public class FangWeiLi {
    public static void main(String[] args) {

            double line = Double.parseDouble(args[0]);
            double line1 = Double.parseDouble(args[1]);
            double line2= Double.parseDouble(args[2]);

        System.out.println("录入的三个数分别是："+line+"、"+line1+"、"+line2);
        if (line+line1>line2 && line+line2>line1 && line1+line2>line){
            System.out.println("可以组成三角形");
        }else {
            System.out.println("不能组成三角形");
        }
    }
}