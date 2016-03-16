package com.bt.xlt.homework0312.getValues;

/**
 * Created by wen.li on 16/3/12.
 * 给定一个数组62,53,41,84,77,55，输出平均值、最大值、最小值、中位数
 * Reviewer: beigui
 * Review Date: 2016/3/16
 * Comments: 不错，能考虑到平均数和中位数为小数的情况
 */

public class LiWenArrayOperate {
    public static void main(String[] args) {
        int[] arr = new int[]{62,53,41,84,77,55};
        int temp;
        float sum = 0;
        float mid;
        int len = arr.length;
        for (int i = 0; i < len; i++) {

            //排序
            for (int j = 0; j< len-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.print("排序后数组：");

        for (int j = 0; j< len; j++) {
            sum += arr[j];
            System.out.print(arr[j] + ",");
        }

        //计算中位数
        if (len % 2 == 1) {
            mid = arr[(len-1)/2];
        } else {
            mid = (arr[len/2] + arr[(len/2) - 1]);
            mid = mid / 2;
        }

        System.out.println("sum = " + sum);
        System.out.println("数组最大值为：" + arr[len-1]);
        System.out.println("数组最小值为：" + arr[0]);
        System.out.println("平均值：" + sum / len);
        System.out.println("中位数为：" + mid);
    }
}
