package com.test.basic.array;

import java.util.Arrays;

/**
 * Created by beigui on 2016/2/13.
 * 功能：介绍数组
 * 注意：数组是在内存中是一片连续的空间，下标从0开始
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,9,5,3};
        System.out.println(arr.toString());
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("数组的和为：" + sum);

        Arrays.sort(arr);
        System.out.println("用工具类Arrays进行排序后的结果：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
