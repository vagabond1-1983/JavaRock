package com.bt.xlt.homework0312.getValues;

import java.util.Arrays;

/**
 * 功能：给定一个数组｛62,53,41,84,77,55｝，输出平均值、最大值、最小值、中位数
 * 中位数：当变量值的项数N为奇数时，处于中间位置的变量值即为中位数；当N为偶数时，中位数则为处于中间位置的2个变量值的平均数。（注意：中位数只能有一个）
 * Reviewer: beigui
 * Review Date: 2016/3/18
 */
public class ZhaoJieArray {

    public static void main(String[] args) {
        int[] myArray = {62, 53, 41, 84, 77, 55};

        //打印所有数组元素
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        /* 方法2：打印所有数组元素
        for (int element: myArray) {
            System.out.println(element);
        }
        */

        // 计算所有元素的总和
        double total = 0;
        for (int i = 0; i < myArray.length; i++) {
            total += myArray[i];
        }
        System.out.println("");
        System.out.println("total is " + total);

        //输出平均值
        double avg = 0;
        avg = total / myArray.length;
        System.out.println("avg is " + avg);

        //输出最大值
        int max = myArray[0];//初始化为数组中任意一个元素
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        System.out.println("max is " + max);

        //输出最小值
        int min = 0;//初始化为数组中任意一个角标
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < myArray[min]) {
                min = i;
            }
        }
        System.out.println("min is " + myArray[min]);

        //输出中位数
        Arrays.sort(myArray);//排序
        double med = 0;

        if ((myArray.length % 2) == 0) {
            med = (myArray[myArray.length / 2] + myArray[myArray.length / 2 - 1]) / 2.0;//medNum为double类型，除数是2的话，结果为int类型
        } else {
            med = myArray[myArray.length / 2];
        }
        System.out.println("med is " + med);
    }
}
