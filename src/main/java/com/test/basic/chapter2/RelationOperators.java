package com.test.basic.chapter2;

/**
 * Created by beigui on 2016/1/28.
 * 功能：关系运算符
 */
public class RelationOperators {
    public static void main(String[] args) {
        int a = 90;
        int b = 90;
        if (a == b) {
            System.out.println("a equals b");
        }
        b--;
        if (a > b) {
            System.out.println("a > b");
        }

        if (a < b) {
            System.out.println("a < b");
        }
    }
}
