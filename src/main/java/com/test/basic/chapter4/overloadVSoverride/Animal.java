package com.test.basic.chapter4.overloadVSoverride;

/**
 * Created by beigui on 2016/2/9.
 */
public class Animal {
    private String name;
    private int age;
    //动物都会叫唤
    public void cry() {
        System.out.println("动物都会叫唤，但是具体的某一个种类的动物叫唤方式不同，需要重写我的cry方法");
    }

}
