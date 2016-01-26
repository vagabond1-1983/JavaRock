package com.test.basic.chapter3;

/**
 * Created by beigui on 2016/1/30.
 * 功能：根据年龄阶段数值判断给出所在阶段定义
 */
public class SwitchDemo {
    public static void main(String[] args) {
        int level = Integer.parseInt(args[0]);

        System.out.println("您输入的年龄阶段是：" + level);
        System.out.print("您是：");
        switch (level){
            case 1:
                System.out.println("学龄前儿童");
                break;
            case 2:
                System.out.println("小学生");
                break;
            case 3:
                System.out.println("中学生");
                break;
            case 4:
                System.out.println("大学生");
                break;
            default:
            System.out.println("职场人");
        }
    }
}
