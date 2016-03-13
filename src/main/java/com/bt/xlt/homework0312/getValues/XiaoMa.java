package com.bt.xlt.homework0312.getValues;

/**
 * Reviewer: beigui
 * Review Date: 2016/3/14
 * Comments:总体不错，排序是用的冒泡排序
 *          改进点：文件名没有按格式，类上没有作者和日期，作业java文件打包
 *                因为题目上求数值是一个整体，只需要做一次整体排序即可
 *                没有考虑到平均数和中位数有小数的情况
 */
public class XiaoMa {

    //1.求数组平均值
    public static int getAvg(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];//求和操作
        }
        return sum / arr.length;//和除以数组长度
    }

    //2.求数组最大值
    public static int getMax(int[] arr) {
        int Max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > Max) {//获取到的不同元素与最大值比较
                Max = arr[i];
            }
        }
        return Max;
    }

    //3.获取数组最小值
    public static int getMin(int[] arr) {

        int Min = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[Min]) {
                arr[Min] = arr[i];
            }
        }
        return arr[Min];
    }

    //4.获取中位数
    //步骤：1.先对数组进行排序；2.然后进行折半查找，获取排序后中间值,如果数组出现偶数，把中间两位相加求平均数
    public static void GetMid(int[] arr) {
        int Min = 0;
        int Max = arr.length - 1;
        int Mid = (Min + Max) / 2;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[i] > arr[k]) {

                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }

        if (arr.length % 2 == 0)
            System.out.println("获取到的中位数是：" + (arr[Mid] + arr[Mid + 1]) / 2);
        else
            System.out.println("获取到的中位数是：" + arr[Mid]);
    }

    public static void main(String[] args) {

        int[] arr = new int[]{62, 53, 41, 84, 77, 55};
        //调用中位数函数
        GetMid(arr);
        System.out.println("获取到的平均数为：" + getAvg(arr));
        System.out.println("获取到的最大数为：" + getMax(arr));
        System.out.println("获取到的最小数为：" + getMin(arr));

    }
}
