package com.test.basic.chapter4.abstractDemo;

/**
 * Created by beigui on 2016/2/14.
 * 当一个类继承的父类是抽象类，需要实现抽象类的所有抽象方法
 */
public class Cat extends Animal {
    @Override
    public void cry() {
        System.out.println("猫猫叫");
    }
}
