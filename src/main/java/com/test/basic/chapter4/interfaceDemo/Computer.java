package com.test.basic.chapter4.interfaceDemo;

/**
 * Created by beigui on 2016/2/14.
 * 功能：计算机类，使用USB接口
 */
public class Computer {
    public Computer() {
        System.out.println("计算机启动了");
    }

    public void useUSB(IUSB usb) {
        usb.start();
        usb.stop();
    }

    public void useAb(AbstractUSB ausb) {
        ausb.start();
    }
}
