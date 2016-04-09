package com.test.basic.practice;

/**
 * Created by beigui on 2016/4/9.
 * @author chencaiyu
 */
public class StringOrder {
    public static void main(String[] args) {
        String str = "I like Java";
        String[] arr = str.split(" ");
        for (int len = arr.length - 1; len >= 0; len--) {
            System.out.print(arr[len]);
            if (len != 0) {
                System.out.print(" ");
            }
        }
        System.out.print("|");
    }
}
