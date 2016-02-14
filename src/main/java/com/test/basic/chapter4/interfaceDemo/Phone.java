package com.test.basic.chapter4.interfaceDemo;

/**
 * Created by beigui on 2016/2/14.
 * 功能：手机类实现USB接口
 */
public class Phone implements IUSB{

    public void start() {
        System.out.println("我是手机，开始工作了。");
    }

    public void stop() {
        System.out.println("我是手机，停止工作了。");
    }
}
