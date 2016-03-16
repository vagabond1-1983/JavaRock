package com.bt.xlt.homework0312.getValues;

import java.util.Arrays;
/**
 * Created by LiChangxing on 2016/3/14.
 * Reviewer: beigui
 * Review Date: 2016/3/16
 * Comments:总体不错
 *          改进点：
 *          需要考虑平均数是小数的情况。中位数不能自己理解，如果对需求理解不准确，写下的程序就更不准确了。希望有所启发。
 *          因为题目上求数值是一个整体，只需要做一次整体排序即可
 */
public class LiChangxingArraryCompare {
    public static void main(String[] args) {
        int[] array = new int[]{62, 53, 41, 84, 77,55};

        int Max = array[0];
        int Min = array[0];
        int Sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > Max) {
                Max = array[i];
            }
            if (array[i] < Min) {
                Min = array[i];
            }

            Sum += array[i];
        }

        System.out.println("该数组的最大数为：" + Max);
        System.out.println("该数组的最小数位：" + Min);
        System.out.println("该数组的平均数为："+ Sum/array.length);

        Arrays.sort(array);

        if( array.length % 2 == 0){

            System.out.println("该数组的中位数是：" + array[( array.length-1 )/2 ] + " " + array[( array.length-1 )/2 + 1]);
        }else {
            System.out.println("该数组的中位数是：" + array[(array.length +1 )/2 - 1]);
        }

    }
}

