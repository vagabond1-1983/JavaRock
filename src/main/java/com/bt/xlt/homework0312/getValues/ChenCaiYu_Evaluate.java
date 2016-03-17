package com.bt.xlt.homework0312.getValues;

import java.util.Arrays;

/**
 * Created by little_5 on 2016/3/16.
 * 求值 给定一个数组62,53,41,84,77,55，输出平均值、最大值、最小值、中位数
 * Reviewer: beigui
 * Review Date: 2016/3/18
 * Comments:总体不错
 *          改进点：
 *          需要考虑平均数和中位数是小数的情况
 *          因为题目上求数值是一个整体，只需要做一次整体排序即可
 */
public class ChenCaiYu_Evaluate {
    public static void main (String[] args) {
        int arr[] = {62,53,41,84,77,55};
        //求平均值、最大值以及最小值
        int sum = arr[0];
        int avg = 0;
        int max = arr[0];
        int min = arr[0];
        for (int i = 1 ; i < arr.length ; i++) {
            sum += arr[i];
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        avg = sum / arr.length;
        System.out.println("平均值为：" + avg);
        System.out.println("最大值为：" + max);
        System.out.println("最小值为：" + min);
        //求中位数
        Arrays.sort(arr);
        int med = 0;
        int flag = 0;
        if (arr.length % 2 == 1) {
            med = arr[arr.length / 2];
        } else if (arr.length % 2 == 0) {
            flag = arr[arr.length / 2 - 1] + arr[arr.length / 2];
            med = flag / 2;
        }
        System.out.println("中位数为：" + med);
    }
}