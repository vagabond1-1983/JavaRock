package com.test.basic.chapter4;

/**
 * Created by beigui on 2016/2/2.
 * 功能：this代表当前对象
 * 注意：this不能在类定义的外部使用，只能在类定义的方法中使用
 */
public class ThisDemo {
    public static void main(String[] args) {
        Person1 p1 = new Person1("小王", 30);
        System.out.println(p1.speak());
    }
}

class Person1 {
    String name;
    int age;
    Person1() {}

    Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String speak() {
        return "我是" + this.name + ",今年" + this.age + "岁";
    }

}
