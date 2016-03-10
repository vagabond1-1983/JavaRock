package com.test.basic.array;

/**
 * Created by beigui on 2016/3/7.
 * 功能：冒泡排序 从小到大排
 * 思路：相邻两个数比较，左边比右边大则交换，整体比较完毕是一次排序
 *      这样的排序要进行n-1趟
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{63, 4, 24, 1, 3, 13};
        System.out.println("冒泡排序法从小到大排序的过程是：");
        //i是趟数
        for (int i = 1; i < array.length; i++) {
            //j是一趟中比较次数
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    //swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                System.out.print(array[j] + "  ");
            }
            System.out.print("【");
            for (int j = array.length - i; j < array.length; j++) {
                System.out.print(array[j] + "  ");
            }
            System.out.println("】");
        }
    }
}
