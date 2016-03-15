package com.bt.xlt.homework0312.getValues;

/**
 * Created by Xiaoyu on 2016/3/14.
 * Reviewer: beigui
 * Review Date: 2016/3/15
 * Comments:非常认真，代码规范不错
 *          改进点：
 *          因为题目上求数值是一个整体，只需要做一次整体排序即可
 *          把问题简单化也是一种能力
 */
public class MaXiaoYuArrayFind {
    public static void main(String[] args) {

        /** 创建数组 */
        int[] arr = new int[] { 62, 53, 41, 84, 77, 55 };

        /** 输出数组最大值 */
        int max = arr[0];
        int i;
        for ( i = 0; i < arr.length; i++ ) {
            if ( arr[i] > max ) {
                max = arr[i];
            }
        }
        System.out.println( "数组的最大值是："+ max );

        /** 输出数组最小值 */
        int min = arr[0];
        int j;
        for ( j = 0; j < arr.length; j++ ) {
            if ( arr[j] < min ) {
                min = arr[j];
            }
        }
        System.out.println( "数组的最小值是："+ min );

        /** 输出数组平均值 */
        double ave;
        int sum = 0;
        int k;
        for  ( k = 0; k < arr.length; k++ ) {
            sum = sum + arr[k];
        }
        ave = ( double )sum / arr.length;
        System.out.println( "数组的平均值是：" + ave );

        /** 输出数组中位数 */
        double mid = 0;
        int[] arr1 = new int[arr.length];
        arr1 = arr;
        int max1 = arr1[0];
        int min1 = arr1[0];
        int sum1 = sum;
        int p;
        int q;
        int q1 = 0;
        int q2 = 0;
        int mark = 0;
        for ( p = 0; p < arr.length; p++ ) {
            mark = mark + Math.abs(arr1[p]) + 1;
        }
        for ( p = 0; p < (arr1.length - 1)/2; p++ ) {
            for ( q = 0; q < arr.length; q++) {
                if (arr1[q] == mark ) {
                    continue;
                }
                else if (arr1[q] > max1) {
                    max1 = arr1[q];
                    q1 = q;
                }
                else if (arr1[q] < min1) {
                    min1 = arr1[q];
                    q2 = q;
                }
            }
            sum1 = sum1 - max1 - min1;
            arr1[q1] = mark;
            arr1[q2] = mark;
            max1 = min;
            min1 = max;
            q = 0;
        }
        if ( arr1.length % 2 == 0 ) {
            mid = ( double ) sum1/2;
        }
        else {
            mid = sum1;
        }
        System.out.println( "数组的中位数是：" + mid );
    }
}
