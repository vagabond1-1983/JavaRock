package com.test.basic.chapter4.thisDemo;

/**
 * Created by beigui on 2016/2/2.
 * 功能：this代表当前对象
 * 注意：this不能在类定义的外部使用，只能在类定义的方法中使用
 */
class Person {
    String name;
    int age;
    Person() {}


    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(String name) {
        this(name, 1);
    }

    String speak() {
        return "我是" + this.name + ",今年" + this.age + "岁";
    }

}