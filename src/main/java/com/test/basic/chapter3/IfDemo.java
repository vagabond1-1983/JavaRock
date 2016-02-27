package com.test.basic.chapter3;

/**
 * Created by beigui on 2016/1/30.
 * 功能：根据年龄判断给出所在阶段定义
 */
public class IfDemo {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);

        System.out.println("您输入的年龄是：" + age);
        System.out.print("您是：");
        if (age < 8) {
            System.out.println("学龄前儿童");
        } else if (age >= 8 && age < 14) {
            System.out.println("小学生");
        } else if (age >= 14 && age < 20) {
            System.out.println("中学生");
        } else if (age >= 20 && age < 25) {
            System.out.println("大学生");
        } else {
            System.out.println("职场人");
        }
    }
}
