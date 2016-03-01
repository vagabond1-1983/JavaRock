package com.test.basic.chapter4.overloadVSoverride;

/**
 * Created by beigui on 2016/2/9.
 * 功能：方法重写（覆盖）。猫类的cry方法覆盖了父类动物的cry方法
 * 简单的说：方法覆盖就是子类有一个方法，和父类的某个方法的名称、返回类型、参数一样，
 *          那么，我们就说子类的这个方法覆盖了父类的那个方法。
 */
public class OverrideDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.cry();
    }
}
