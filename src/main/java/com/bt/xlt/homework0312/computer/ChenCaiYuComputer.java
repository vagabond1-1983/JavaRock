package com.bt.xlt.homework0312.computer;

/**
 * Created by little_5 on 2016/3/16.
 * 计算机类 设计一个计算机类，要求如下： -- 属性：品牌、颜色、cpu、内存容量、价格、工作状态
 方法：打开、关闭、休眠 -- 创建一个计算机对象，调用打开、关闭方法。
 打开时显示品牌、颜色、cpu、内存容量、价格、工作状态为正常；
 关闭时，显示工作状态为停止； -- 休眠时，显示工作状态为睡眠。
 * Reviewer: beigui
 * Review Date: 2016/3/16
 * Comments: 也可以通过构造函数赋初值，这样更省力。
 */
public class ChenCaiYuComputer {
    String brand;
    String color;
    String cpu;
    String memoryCapacity;
    double price;
    String workCondition;

    public static void main (String[] args) {
        ChenCaiYuComputer c = new ChenCaiYuComputer();
        c.brand = "联想";
        c.color = "黑色";
        c.cpu = "i7-5500U";
        c.memoryCapacity = "8GB";
        c.price = 5199;
        c.boot();
        c.shutdown();
        c.sleep();
    }

    public void boot () {
        workCondition = "正常";
        System.out.println("打开时显示：");
        System.out.println("品牌：" + brand);
        System.out.println("颜色：" + color);
        System.out.println("CPU：" + cpu);
        System.out.println("内存容量：" + memoryCapacity);
        System.out.println("价格：" + price);
        System.out.println("工作状态：" + workCondition);
    }

    public void shutdown () {
        workCondition = "停止";
        System.out.println("关闭时显示：");
        System.out.println("工作状态：" + workCondition);
    }

    public void sleep () {
        workCondition = "睡眠";
        System.out.println("休眠时显示：");
        System.out.println("工作状态：" + workCondition);
    }
}