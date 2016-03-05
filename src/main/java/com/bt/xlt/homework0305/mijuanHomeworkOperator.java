package com.bt.xlt.homework0305;

/**
 * Created by mijua on 3/5/2016.
 * Reviewer: beigui
 * Review Date: 2016/3/5
 * Comments: 能考虑到一些异常情况，并扩展了作业的潜在需求， A
 *           TODO 请注意写代码的规范，这是协作编程时的重点。
 */
public class mijuanHomeworkOperator {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        System.out.println("您输入的三角形第一条边长度为：" + a);
        System.out.println("您输入的三角形第二条边长度为：" + b);
        System.out.println("您输入的三角形第三条边长度为：" + c);

        if(a <= 0 || b <= 0 || c <=0)
        {
            System.out.println("您输入的三角形长度有误，请重新输入！");
            return;
        }
        if (a==b&&b==c)
        {System.out.println("您输入的是等边三角形");}
        else if(a==b || a==c || b ==c )
        {System.out.println("您输入的是等腰三角形");}
        else if (a+b>c&&a+c>b&&b+c>a)
        {System.out.println("您输入的是普通三角形");}
        else
        {System.out.println("您输入的三条边不能组成三角形");}
    }
}