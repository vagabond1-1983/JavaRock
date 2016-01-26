package com.test.basic.chapter2;

/**
 * Created by beigui on 2016/1/28.
 * 功能：变量的初始化和赋值
 * 注意：为什么单独一个例子？因为变量的初始化非常重要，一些空指针异常经常是因为没有变量初始化造成的。有些诡异的问题，最终发现也是
 *      因为没有初始化。最好在定义变量的时候就进行初始化。idea也会提示你初始化。
 */
public class Parameter {
    public static void main(String[] args) {
        int a = 3;
//        int b;
        System.out.println("a = " + a);
//        System.out.println("b = " + b);
    }
}
