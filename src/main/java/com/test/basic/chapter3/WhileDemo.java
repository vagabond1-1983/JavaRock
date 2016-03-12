package com.test.basic.chapter3;

/**
 * Created by beigui on 2016/1/30.
 * 功能：从1加到100的和用while实现
 */
public class WhileDemo {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i++;
        }
        System.out.println("1+2+3+...+100=" + sum);
        System.out.println(i);

//        do while
        int doSum = 0;
        int j = 1;
        do {
            doSum += j++;
        } while (j <= 100);
        System.out.println("1+2+3+...+100=" + doSum);
    }
}
