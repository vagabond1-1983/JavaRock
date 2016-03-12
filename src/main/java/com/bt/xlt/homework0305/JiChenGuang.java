package com.bt.xlt.homework0305;

/**
 * Created by 700sfriend on 16/3/8.
 *
 * Reviewer: beigui
 * Review Date: 2016/3/8
 * Comments: 提交的正式版本中不要加TODO，注意代码规范
 */

public class JiChenGuang {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

//        int a = 0;
//        int b = 0;
//        int c = 0;
        System.out.println("请输入三个数字：");
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        System.out.println("输入的第一个数字是:" + a);
        System.out.println("输入的第二个数字是:" + b);
        System.out.println("输入的第三个数字是:" + c);
        int r=a+b-c;
        int w=a+c-b;
        int x=b+c-a;
        if(r>0&&w>0&&x>0) {
            System.out.println("两边之和大于第三边，是三角形");
        }else{
            System.out.println("不是三角形");
    }
    }

}