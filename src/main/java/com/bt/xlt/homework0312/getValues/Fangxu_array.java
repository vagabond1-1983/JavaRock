package com.bt.xlt.homework0312.getValues;

import java.util.Arrays;

/**
 * Created by fangxu on 2016/3/13.
 * Reviewer: beigui
 * Review Date: 2016/3/20
 */
public class Fangxu_array {
    public static void main(String[] args) {
        //初始化数组，输出数组元素内容
        int[] array = new int[]{62,53,41,84,77,55};
        System.out.print("数组元素为：");
        for (int i = 0; i < array.length; i++)
        System.out.print(+ array [i] + " ");

        //计算并输出最小值
        int min = array[0];
        for (int j = 0; j < array.length - 1; j++) {
            if (min > array[j + 1]) {
                min = array[j + 1];
            }
        }
        System.out.println("\n数组元素的最小值为：" + min);

        //计算并输出最大值
        int max = array[0];
        for (int m = 0; m < array.length - 1; m++) {
            if (max < array[m + 1]) {
                max = array[m + 1];
            }
        }
        System.out.println("数组元素的最大值为：" + max);

        //计算并输入最大值后，除以数组位数，求平均数
        int sum = 0;
        for (int x = 0; x < array.length; x++) {
            sum += array[x];
        }
        System.out.println("数组元素的和为：" + sum);
        float avg = sum / array.length;
        System.out.println("平均数为：" + avg);

        //计算中位数
        Arrays.sort(array);                      //给数组排序
        int MidNum1 , MidNum2 = 0;
        int ArrLenOdevity = array.length % 2;    //求数组元素数的奇偶性
        if (ArrLenOdevity == 0) {                //如果是偶数，有两个中位数
            int MN1 = array.length / 2;          //计算出后一个中位数的数组下标
            int MN2 = MN1 -1;                    //计算出前一个中位数的数组下标
            MidNum1 = array[MN1];
            MidNum2 = array[MN2];
            float avgMidNum = ( MidNum1 + MidNum2 ) / 2;
            System.out.println("数组的中间位置的数有两个，分别为：" + MidNum2 + "和" + +MidNum1);
            System.out.println("取这两个数的平均数后，数组的中位数是：" + avgMidNum);
         } else {
            //数组元素数为奇数时，（数组个数-1）/2 求中位数元素的数组下标
            int MN1 = (array.length - 1) / 2;
            MidNum1 = array[MN1];       // 求出中位数
            System.out.println("数组的中位数是：" + MidNum1);
        }

    }
}
