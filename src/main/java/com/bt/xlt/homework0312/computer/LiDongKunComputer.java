package com.bt.xlt.homework0312.computer;

/**
 * Created by lidongkun on 2016/3/14.
 */
public class LiDongKunComputer {
    String brand = "联想";
    String color = "黑色";
    String cpu = "英特尔";
    String ram = "金士顿";
    String work = "正常";

    public void open() {
        System.out.println("我买了一个电脑品牌是：" + brand + "、颜色是：" + color + "、cpu是：" + cpu
        + "、内存是：" + ram + "已经" + work + "工作了！");
    }

    public void close() {
        System.out.println("我的电脑关机了所以" + work + "工作了！");
    }

    public void sleep() {
        System.out.println("我的电脑一段时间不用就" + work + "了！");
    }
}
