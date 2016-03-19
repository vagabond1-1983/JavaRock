package com.test.basic.chapter4.extendsDemo;

/**
 * Created by beigui on 2016/2/8.
 * 小学生：子类
 */
public class Pupil extends Human{
    private String studentNo;

//    public Pupil() {
//        System.out.println("Pupil none con");
//    }

    public Pupil(String studentNo, String name, char gender, int age) {
        super(name, gender, age);  //super用来调用父类构造方法，必须是第一句
        this.studentNo = studentNo;
        System.out.println("Pupil....");
    }

    public void learn() {
        System.out.println(this.getName() + "在学习。。。");
    }
}
