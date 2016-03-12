package com.test.basic.array;

/**
 * Created by beigui on 2016/3/7.
 * 功能：对于给定的一个数组，找到其中的次大数，并输出
 * 思路：
 *      想类似的情况：找到最大数，这个比较好做，一趟比较下来，能获得最大数
 *      那次大数如何获得，应该是在最大数的情况下，多一次比较，比最大数小的那个就是次大数了
 *      1. 通过for循环取出当前数，把当前数跟最大数和次大数进行比较
 *      2. 另声明一个变量，保存比最大数小的那个数
 *      3. 比最大数大，则次大数为之前的最大数，最大数为当前数；比最大数小，比次大数大，则次大数为当前数
 */
public class GetSecondMaxNum {
    public static void main(String[] args) {
        int[] array = {4, 3, 8, 1, 10, 6};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int max = array[0];
        int secondMax = 0;
        for (int i = 1; i < array.length; i++) {
            //当前元素是最大数，需要更新最大数
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] <= max && array[i] >= secondMax) {
                //当前元素比次大数大，更新次大数
                secondMax = array[i];
            }
        }
        System.out.println("max=" + max);
        System.out.println("second max=" + secondMax);
    }
}
