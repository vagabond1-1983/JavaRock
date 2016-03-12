package com.test.basic.chapter3;

/**
 * Created by beigui on 2016/1/30.
 * 功能：从1加到100的和
 */
public class ForDemo {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i;  //sum = sum + i;
        }
        System.out.println("1+2+3+...+100=" + sum);
    }
}
