package com.bt.xlt.homework0312.getValues;

/**
 * Created by lidongkun on 2016/3/14.
 * Reviewer: beigui
 * Review Date: 2016/3/14
 * Comments:总体不错
 *          改进点：
 *          需要考虑平均数和中位数是小数的情况
 *          因为题目上求数值是一个整体，只需要做一次整体排序即可
 */
public class LiDongKunArraysValues {
    public static void main(String[] args) {
        int[] arr = new int[] {62,53,41,84,77,55};
        int sum = 0;
        int avg = 0;
        for(int i = 0;i < arr.length;i ++) {
            sum += arr[i];
        }
        avg = sum/arr.length;
        System.out.println("arr数组的平均值为：" + avg);

        int max = arr[0];
        for(int i = 1;i < arr.length;i ++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("arr数组的最大值为：" + max);

        int min = arr[0];
        for(int i = 1;i < arr.length;i ++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("arr数组的最小值为：" + min);

        System.out.println("arr数组的中位数为" + arr[(arr.length/2)-1]);
    }
}
