package com.bt.xlt.homework0312.computer;

/**
 * Created by QZ on 2016/3/16.
 *
 */
public class QiZhiComputerTest {
    public static void main(String[] args) {
        QiZhiComputer computer = new QiZhiComputer("ThinkPad", "Black", "I5-2420", "8G", 8888);
        // 开机
        String openMsg = computer.open();
        System.out.println("开机：" + openMsg);
        // 休眠
        String sleepMsg = computer.sleep();
        System.out.println("休眠：" + sleepMsg);
        // 关机
        String shutdownMsg = computer.shutdown();
        System.out.println("关机：" + shutdownMsg);
    }
}
