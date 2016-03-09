package com.test.basic.chapter4.constructorDemo;

/**
 * Created by beigui on 2016/2/1.
 * 功能：构造函数
 * 总结：
 *      1.构造函数名和类名相同
 *      2.构造函数没有返回值
 *      3.对新对象的初始化
 *      4.在创建新对象时，系统自动的调用该类的构造函数
 *      5.一个类可以有多个构造函数
 *      6.每个类都有一个默认的构造函数
 */
public class ConstructorDemo {
    public static void main(String[] args) {
        Person p = new Person("小明", 25);
        System.out.println(p.speak());
    }
}


