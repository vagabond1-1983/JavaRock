package com.bt.xlt.homework0312.computer;
/**
 * Created by fx on 2016/3/16.
 * Reviewer: beigui
 * Review Date: 2016/3/20
 * Comments: 能想到与用户互动，不错。
 *           改进点：属性赋值用构造函数更省力
 */
import java.util.Scanner;
public class Fangxu_MyComputer {

    public static void main(String[] args) {
        Fangxu_computer my = new Fangxu_computer();
        my.brand = "联想";
        my.color = "黑色";
        my.cpu = "core i7-6700";
        my.memory = "8G";
        my.price = 5999;

        System.out.println("输入电脑运行状态（关机：0 ；开机：1 ；休眠：2；）：");

        Scanner s = new Scanner(System.in);
        int status = s.nextInt();

        if (status == 0) {
            my.off();
        } else if (status == 1) {
            my.open();
        } else if (status == 2) {
        my.sleep();
        } else {
            System.out.println("没有该状态");
        }
    }
}