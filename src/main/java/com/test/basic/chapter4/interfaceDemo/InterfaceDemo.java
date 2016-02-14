package com.test.basic.chapter4.interfaceDemo;

/**
 * Created by beigui on 2016/2/14.
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Phone phone = new Phone();
        computer.useUSB(phone);
    }
}
