package com.bt.xlt.homework0312.computer;

/**
 * Created by jiabin on 2016/3/12.
 * Reviewer: beigui
 * Review Date: 2016/3/13
 */
public class JiaBinComputerTest {
    public static void main(String[] args) {
        JiaBinComputer computer = new JiaBinComputer("dell","red","Core i7",4,3550);

        computer.start();

        System.out.println();

        computer.shutdown();

        System.out.printf("");

        computer.sleep();
    }
}
