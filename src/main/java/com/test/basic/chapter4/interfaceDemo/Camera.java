package com.test.basic.chapter4.interfaceDemo;

/**
 * Created by beigui on 2016/3/26.
 */
public class Camera implements IUSB {
    public void start() {
        System.out.println("我是照相机，开始工作了。");
    }

    public void stop() {
        System.out.println("我是照相机，停止工作了。");
    }
}
