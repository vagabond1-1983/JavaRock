package com.bt.xlt.homework0319.jiabin;

import java.util.Scanner;

/**
 * Created by bin.jia on 2016/3/21.
 * Reviewer: beigui
 * Review Date: 2016/3/22
 * Comments: 到目前为止，最符合题意的程序。
 *          改进点：getArea需不需要写两个方法？ 好好考虑封装，巧用构造函数
 */
public class JiaBinShapeTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("圆形：请输入1，矩形：请输入2，三角形：请输入3！");

        int shape = s.nextInt();

        JiaBinJudgeShape judge = new JiaBinJudgeShape();
        judge.judgeShape(shape);
    }
}
