package com.bt.xlt.homework0312.getValues;

import java.util.Arrays;
/**
 * Created by QZ on 2016/3/16.
 * 作业：给定一个数组62,53,41,84,77,55，输出平均值、最大值、最小值、中位数*
 * Reviewer: beigui
 * Review Date: 2016/3/18
 * Comments:能考虑到数据个数为1的特殊情况，增加了程序的健壮性
 */
public class QiZhiArrayOperate {
    public static void main(String[] args) {
        int[] arr = new int[]{62, 53, 41, 84, 77,55};
        System.out.println(arr);
        int sum = 0;
        Arrays.sort(arr);
        System.out.print("升序结果是：");
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        System.out.println("数组元素中各个元素之和为：" + sum);
        System.out.println("数组元素平均值为：" + sum / arr.length);
        System.out.println("数组中最大值是：" + arr[(arr.length - 1)]);
        System.out.println("数组中最小值是：" + arr[0]);

        if (arr.length % 2 != 0) {
            System.out.println("数组中的中位数是：" + arr[arr.length / 2]);
        } else if(arr.length % 2 == 0){
            System.out.println("数组中的中位数是：" + arr[(arr.length / 2) - 1] + "," + arr[(arr.length / 2)]);
        }
        else
            System.out.println("数组个数必须大于1");

    }
}