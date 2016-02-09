package com.test.basic.chapter4.overloadVSoverride;

/**
 * Created by beigui on 2016/2/9.
 *
 */
public class Cat extends Animal{
    @Override
    public void cry() {
        System.out.println("猫猫叫！");
    }
}
