package com.bt.xlt.homework0305;

/**
 * Created by 王小佳 on 2016/3/7.
 * Reviewer: beigui
 * Review Date: 2016/3/8
 */
public class WangXiaoJia {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]); //把字符型强制转换成int，数组里的0，1,2，依次对应相应的变量
        System.out.println("您输入的边是："+a);
        int b=Integer.parseInt(args[1]);
        System.out.println("您输入的边是："+b);
        int c=Integer.parseInt(args[2]);
        System.out.println("您输入的边是："+c);
        if(a<=0||b<=0||c<=0){
            System.out.println("不符合边的要求");
        }
         else  if((a+b>c) && (a+c>b)&&(b+c>a)) {
            System.out.println("三条边能组成三角形");
        }
        else{
            System.out.println("三条边不能组成三角形");
        }
    }
}