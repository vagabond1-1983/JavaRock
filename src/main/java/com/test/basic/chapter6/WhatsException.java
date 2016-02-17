package com.test.basic.chapter6;

/**
 * Created by beigui on 2016/2/17.
 * 功能：展示什么是异常
 */
public class WhatsException {
    public static void main(String[] args) {
//        nullPointerException();
//        arrayIndexOutOfBoundsException();
    }

    private static void arrayIndexOutOfBoundsException() {
        int[] a = new int[]{1,2,3};
        System.out.println(a[4]);
    }

    private static void nullPointerException() {
        String a = null;
        a.length();
    }

}
