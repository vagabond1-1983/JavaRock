package com.bt.xlt.homework0312.getValues;

import java.util.Arrays;

/**
 * Created by jiabin on 2016/3/12.
 * Reviewer: beigui
 * Review Date: 2016/3/13
 */
public class JiaBinCheckNum {
    public static void main(String[] args) {
        int[] arr = new int[]{62,53,41,84,77,55};
        int sum = 0;
        int arrLength = arr.length;
        double median;  //中位数

        Arrays.sort(arr);
        for (int num : arr) {
            sum += num;
        }

        double avg = (double)sum / arrLength;   //平均数

        if (arrLength % 2 == 0) {
            median = (double) (arr[arrLength / 2 - 1] + arr[arrLength / 2]) / 2;
        } else {
            median = arr[arrLength / 2];
        }

        System.out.println("最小数：" + arr[0] + "\n" + "最大数：" + arr[arrLength - 1] + "\n" + "平均数：" + avg + "\n" + "中位数：" + median);
    }
}
