package com.bt.xlt.homework0305;

/**
 * Created by yuxinwei on 2016/3/6.
 * 输入三个数判断是否为三角形：
 * 1、两边之和大于第三边
 * 2、输入限制：不能输入非法字符、不能小于等于0、可以为浮点型
 * 3、类型：等腰、等边、普通三角形
 *
 * Reviewer: beigui
 * Review Date: 2016/3/7
 */
public class WeiYuXinHomeWorkTest {
    public static void main(String[] args) {
    int length1=Integer.parseInt(args[0]);
    int length2=Integer.parseInt(args[1]);
    int length3=Integer.parseInt(args[2]);
        System.out.println("您输入的三个数分别为 ： "+length1+" ，"+length2+" ，"+length3);
    if(length1>0 && length2>0 && length3>0){
     if((length1+length2>length3) && (length1+length3>length2) && (length2+length3>length1)) {
            if ((length1 == length2 && length1 != length3) || (length1 == length3 && length1 != length2) || (length2 == length3 && length1 != length2)) {
                System.out.println("可以组成三角形，此三角形为等腰三角形");
            }
            if ((length1 == length2) && length1 == length3) {
                System.out.println("可以组成三角形，此三角形为等边三角形");
            }
            if ((length1 != length2 && length1 != length3 && length2 != length3)) {
                System.out.println("可以组成三角形，此三角形为普通三角形");
            }
        }else{
         System.out.println("无法构成三角形");
     }
    }else{
            System.out.println("无法构成三角形");
    }
    }
}
