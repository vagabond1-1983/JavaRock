package com.bt.xlt.homework0312.getValues;

/**
 * Created by weiyuxin on 2016/3/14.
 * 功能：给定一个数组，输出平均值，最大值，最小值、中位数。
 * Reviewer: beigui
 * Review Date: 2016/3/14
 * Comments: 文件名没有按要求<XingMingFunction>
 *           变量声明和初始化不要放在一起，一行对一个变量进行作用。修改下面的声明
 *           因为题目上求数值是一个整体，只需要做一次整体排序即可
 */
public class WeiYuXinGetValueTest {
    public static void main(String[] args) {
        int[] arr = new int[]{62,53,41,84,77,55};
        int avg,max = arr[0],min = arr[0],media,sum = 0,k = arr.length / 2;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        System.out.println("平均值是：" + avg);

        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("最大值是：" + max);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("最小值是：" + min);

        if (arr.length % 2 != 0) {
            media = arr[k] ;
        }else media = (arr[k]+arr[k-1])/2;
        System.out.println("中位数是："+ media);
    }
}