package com.test.basic.chapter4.abstractDemo;

/**
 * Created by beigui on 2016/2/14.
 * 抽象类
 * 注意：抽象类不一定有抽象方法，反过来，有抽象方法的类必是抽象类
 */
public abstract class Animal {
    String name;
    int age;
    //动物会叫
    public abstract void cry();
}
