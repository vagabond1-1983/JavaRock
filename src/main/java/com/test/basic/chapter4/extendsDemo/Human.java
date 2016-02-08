package com.test.basic.chapter4.extendsDemo;

/**
 * Created by beigui on 2016/2/8.
 * 人：父类
 */
public class Human {
    private String name;
    private char gender;
    private int age;

    public Human(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    protected String getName() {
        return name;
    }

    public void think() {
        System.out.println(this.name + "在思考。。。");
    }
}
