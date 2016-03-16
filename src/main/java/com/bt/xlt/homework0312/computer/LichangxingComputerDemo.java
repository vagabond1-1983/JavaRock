package com.bt.xlt.homework0312.computer;

/**
 * Created by LiChangxing on 2016/3/14.
 * Reviewer: beigui
 * Review Date: 2016/3/16
 */
public class LichangxingComputerDemo {
    public static void main(String[] args) {
        LiChangxingComputer Com = new LiChangxingComputer("Dell","黑色", "Intel","4096M", 5800.5,"开机");
        System.out.println(Com.StarUp());

        Com.ShutDown("关机");
        Com.Sleep();

    }
}
