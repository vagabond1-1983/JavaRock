package com.bt.xlt.homework0305;

/**
 * Created by kevin on 2016/3/6.
 * Reviewer: beigui
 * Review Date: 2016/3/6
 * Comments: 能考虑到一些异常情况，并扩展了作业的潜在需求
 *           TODO 请注意写代码的规范，这是协作编程时的重点。少一个输出，“三边不能组成三角形”
 */
public class LiChangXin {

    public static void main(String [] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        System.out.println("您输入的三个数是：" + a + " "+ b + " " + c);

        if(a<0 ||b<0||c<0)

        {
            System.out.println("三角形三边必须是正数！！！");
        }else if( a+b>c&&c-b<a)
        {
            //System.out.println("您输入的三边可以组成三角形");

            if( a == b || a ==c || b ==c)
            {
                System.out.println("您输入的三遍可以组成等腰三角形");

                if(a==b &&b==c)
                {
                    System.out.println("您输入的三边可以组成等边三角形");
                }
            }else
            {
                System.out.println("您输入的数可以组成普通三角形");
            }

        }

    }

}
