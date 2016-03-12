package com.test.basic.chapter2;

/**
 * Created by beigui on 2016/1/28.
 * 功能：判断逻辑关系的运算符 && 与， || 或， ! 非
 */
public class LogicalOperators {
    public static void main(String[] args) {
        int a = 100;
        int b = 100;

        System.out.println(a > b && a > 99);
        //a大于b并且a大于99
        if (a > b && a > 99) {
            System.out.println("a > 99 and a > b");
        }

        //a大于b或者是a大于99
        System.out.println(a > b || a > 99);
        if (a > b || a > 99) {
            System.out.println("a > 99 but not a > b");
        }

        //a小于等于b
        System.out.println((a > b));
        System.out.println(!(a > b)); // !(a > b) ==> (a <= b)
        if (!(a > b)) {
            System.out.println("not a > b");
        }

    }
}
