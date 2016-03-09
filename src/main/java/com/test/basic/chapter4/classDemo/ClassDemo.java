package com.test.basic.chapter4.classDemo;

/**
 * Created by beigui on 2016/1/31.
 * 功能：面向对象编程之类和对象
 * 什么是类？什么是对象？
 * e.g.
 *  人的特征：姓名，年龄，性别，说话
 *           |
 *           |抽象
 *          \|/
 *   class Person -- 类
 *           |
 *           |实例化
 *          \|/
 *       小明、小王 -- 对象
 *
 *  上面的例子，通过人的特征抽象出的Person类就是一个类，而通过类产生出的一个个个体，小明、小王就是对象
 */
public class ClassDemo {

    public static void main(String[] args) {
        Person xiaoming = new Person();
        System.out.println(xiaoming);

        Person xiaowang = new Person();
        System.out.println(xiaowang);
    }
}
