package com.bt.xlt.homework0312.getValues;

import java.util.Arrays;

/**
 * 给定一个数组62,53,41,84,77,55，输出平均值、最大值、最小值、中位数
 * Created by 王小佳 on 2016/3/17.
 * Reviewer: beigui
 * Review Date: 2016/3/18
 * Comments:总体不错
 *          改进点：因为题目上求数值是一个整体，只需要做一次整体排序即可
 *                没有考虑到平均数和中位数有小数的情况
 */
public class WangXiaoJiaGetValues {
    public static void main(String[] args) {
        int[] array = new int[]{62, 53, 41, 84, 77, 55};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "");
        }
        /*求最大值*/
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] <= max) {
                max = max;
            }
        }
        System.out.println("max=" + max);
        /*求最小值*/
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] >= min) {
                min = min;
            }
        }
        System.out.println("min=" + min);
        /*  求平均数*/
        double ave = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        ave = sum / array.length;
        System.out.println("平均数：" + ave);
        System.out.println("总数：" + sum);

        /*求中位数*/
        Arrays.sort(array);
        if (array.length % 2 == 0) {
            System.out.println( "中位数：" + (array[array.length / 2 - 1] + array[array.length / 2 ]) / 2);
        } else {
            System.out.println(  "中位数：" +  array[(array.length-1 )/ 2]);
        }
    }

}