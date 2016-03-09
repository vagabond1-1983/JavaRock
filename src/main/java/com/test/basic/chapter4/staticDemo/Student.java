package com.test.basic.chapter4.staticDemo;

class Student {
    static int totalNo = 0;
    String name;
    int age;
    Student(String name, int age) {
        totalNo++;
    }

    public static void speak() {
        System.out.println("我是红领巾。");
    }

    public int getTotalNo() {
        return totalNo;
    }
}