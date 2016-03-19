package com.test.basic.chapter4.extendsDemo;

/**
 * Created by beigui on 2016/2/8.
 * 功能：继承。创建人和小学生，人在思考，小学生在学习
 */
public class PersonsMain {
    public static void main(String[] args) {
        Human person = new Human("林冲", '男', 30);
        person.think();

        Pupil liming = new Pupil("001", "李明", '男', 8);
        liming.think();
        liming.learn();
    }
}