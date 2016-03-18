package com.bt.xlt.homework0312.computer;

/**
 * Created by Administrator on 2016/3/16.
 * 设计一个计算机类，要求如下：
 * 属性：品牌、颜色、cpu、内存容量、价格、工作状态
 * 方法：打开、关闭、休眠
 * 创建一个计算机对象，调用打开、关闭、休眠方法
 * 打开时，显示品牌、颜色、cpu、内存容量、价格、工作状态为正常；
 * 关闭时，显示工作状态为停止；
 * 休眠时，显示工作状态为睡眠。
 * Reviewer: beigui
 * Review Date: 2016/3/18
 */
public class ZhaoJieComputer {

    public static void main(String[] args) {

        // 声明变量i
        int i;
        i = 1;
        choose(i);
        i = 2;
        choose(i);
        i = 3;
        choose(i);
    }

    // choose方法：switch语句
    public static void choose(int i) {
        ZhaoJieComputer computer = new ZhaoJieComputer();// 创建一个计算机类
        Computer1 computer1 = computer.new Computer1();// 创建一个内部类

        switch (i) {
            case 1:
                computer1.open();
                break;
            case 2:
                computer1.close();
                break;
            case 3:
                computer1.sleep();
                break;
            default:
                System.out.println();
        }
    }

    class Computer1 {
        String brand = "MacBook";
        String color = "香槟金";
        String cpu = "酷睿";
        String memory = "16GB";
        int price = 11999;
        String[] work = { "正常", "停止", "睡眠" };

        // 打开open
        void open() {
            System.out.println(
                    "电脑打开：" + brand + "  " + color + "  " + cpu + "  " + memory + "  " + price + "  " + work[0]);
        }

        // 关闭close
        public void close() {
            System.out.println("电脑关闭：" + work[1]);
        }

        // 休眠sleep
        public void sleep() {
            System.out.println("电脑休眠：" + work[2]);
        }
    }
}