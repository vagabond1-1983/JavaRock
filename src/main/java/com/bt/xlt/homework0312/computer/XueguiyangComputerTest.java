package com.bt.xlt.homework0312.computer;

/**
 * Created by xueguiyang on 16-3-14.
 * Reviewer: beigui
 * Review Date: 2016/3/14
 * Comments:变量第一个字母小写，题目上的打开方法遗漏了
 */
public class XueGuiYangComputerTest {
    public static void main(String[] args) {
        XueGuiYangComputer xct = new XueGuiYangComputer ("lenovo","red","酷睿i5","128M",6666.66);
        System.out.println("---------------------------");
        xct.shutdown();
        xct.sleep();

    }

}