package com.bt.xlt.homework0312.computer;

/**
 * Created by lidongkun on 2016/3/14.
 * Reviewer: beigui
 * Review Date: 2016/3/13
 * Comments: 考虑下带参数的构造函数
 */
public class LiDongKunComputerState {
    public static void main(String[] args) {
        LiDongKunComputer cp=new LiDongKunComputer();
        cp.open();

        cp.work = "停止";
        cp.close();

        cp.work = "休眠";
        cp.sleep();
    }
}
