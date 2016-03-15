package com.bt.xlt.homework0312.computer;

/**
 * Created by Xiaoyu on 2016/3/14.
 * Reviewer: beigui
 * Review Date: 2016/3/15
 * Comments: 考虑下容量和价格的类型，字符串是万能的，但是在进行比较时，会比较弱
 *           方法名第一个字母小写
 */
public class MaXiaoYuComputer {

    /** 定义类属性 */
    String grand;
    String color;
    String cpu;
    String memory;
    String price;
    String state;

    /** 定义构造函数 */
    MaXiaoYuComputer( String grand1, String color1, String cpu1, String memory1, String price1 ) {
        grand = grand1;
        color = color1;
        cpu = cpu1;
        memory = memory1;
        price = price1;
    }

    /** 定义类方法：打开 */
    void Open() {
        state = "正常";
        System.out.println ( "品牌：" + grand + "，颜色：" + color + "，cpu：" + cpu + "，内存："
                + memory + "，价格：" + price + "| " + "电脑工作状态：" + state );
    }

    /** 定义类方法：关闭 */
    void Close() {
        state = "停止";
        System.out.println( "电脑工作状态：" + state );
    }

    /** 定义类方法：休眠 */
    void Sleep() {
        state = "睡眠";
        System.out.println( "电脑工作状态：" + state );
    }

}
