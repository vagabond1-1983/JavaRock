package com.test.basic.chapter2;

/**
 * Created by beigui on 2016/1/28.
 * 功能：java基本数据类型介绍
 * 基本数据类型：
 *      |--整数类型 byte(1个字节) short(2个字节) int(4个字节) long(8个字节)
 *      |--小数（浮点）类型  float double
 *      |--布尔类型 boolean(true/false)
 *      |--字符类型 char 两个字节
 * 注意：String不是基本数据类型，而是类
 */
public class BasicDataTypes {
    public static void main(String[] args) {
        byte bt = 127;
        System.out.println(bt);

        int a = 1;
        int b = 2;
        int c = a + b;
        System.out.println("c = " + c);

        boolean flag = true;
        System.out.println("flag = " + flag);
        flag = false;
        System.out.println("flag now = " + flag);

        char c1 = '中';
        System.out.println(c1);
    }
}
