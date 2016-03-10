package com.bt.xlt.homework0305;

/**
 * Created by Administrator on 2016/3/5.
 * Reviewer: beigui
 * Review Date: 2016/3/10
 * Comments: 能考虑到一些异常情况，并扩展了作业的潜在需求
 */
public class FangXu
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if  (a>0 && b>0 && c>0) {
            System.out.println("您输入的三角形三边长分别为：" + a + "," + b + "," + c);
            if (a+b<=c || a+c<=b || b+c<=a) {
                System.out.println("错误！不能构成三角形。");
            }
                else if ((a==b && a!=c) || (a==c && a!=b) || (b==c && b!=a)){
                System.out.println("为等腰三角形");
                 }
                else if (a==b && b==c) {
                System.out.println("为等边三角形");
                 }
            else {
                System.out.println("为普通三角形");
            }
        }
        else
            System.out.println("错误！三角形三边不能小于等于零。");
    }
}

