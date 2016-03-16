package com.bt.xlt.homework0312.computer;

/**
 * Created by wen.li on 16/3/15.
 * 计算机类 设计一个计算机类，要求如下： -- 属性：品 牌、颜色、cpu、内存容量、价格、工作状态
 * 方法：打开、关闭、休眠 -- 创建一个计算机对象，调用打开、关闭方法。
 * 打开时显示品牌、颜色、cpu、内存容量、价格、工作状态为正常;
 * 关闭时，显示工作状态为停止； -- 休眠时，显示工作状态为睡眠。
 * Reviewer: beigui
 * Review Date: 2016/3/16
 * Comments: 考虑下容量和价格的类型，字符串是万能的，但是在进行比较时，会比较弱
 */
public class LiWenComputer {
    String brand;
    String color;
    String cpu;
    String memory;
    String price;
    String state;

    public LiWenComputer(String brand, String color, String cpu, String memory, String price) {
        this.brand = brand;
        this.color = color;
        this.cpu = cpu;
        this.memory = memory;
        this.price = price;

    }

    public void open(){
        state = "工作状态正常";
        System.out.println("显示信息为：" + brand + "," + color + "," + cpu + "," + memory + "," + price + "," + state );
    }

    public void close(){
        state = "关机";
        System.out.println("工作状态为：" + state);
    }

    public void sleep(){
        state = "睡眠";
        System.out.println("工作状态为：" + state);
    }
}
