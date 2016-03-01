package com.test.basic.chapter4.abstractDemo;

/**
 * Created by beigui on 2016/2/14.
 * 功能：抽象类演示
 */
public class AbstractDemo {
    public static void main(String[] args) {
        //抽象类不能被实例化
//        Animal a = new Animal();
        Animal cat = new Cat();
        cat.cry();
    }
}
