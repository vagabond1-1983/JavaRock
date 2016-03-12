package com.test.basic.chapter4.staticDemo;

/**
 * Created by beigui on 2016/2/2.
 * 功能：静态变量和静态方法。只初始化一次，用于计算总量或者说共享区域的特性。
 * 下面的程序是计算总学生人数和访问静态方法举例。
 */
public class StaticDemo {
    public static void main(String[] args) {
        Student s1 = new Student("小明", 10);
        Student s2 = new Student("小王", 13);
        System.out.println("总人数：" + s2.getTotalNo());

        Student.speak();
    }
}


