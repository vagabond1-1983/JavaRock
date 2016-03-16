package com.bt.xlt.homework0312.computer;

/**
 * Created by wen.li on 16/3/15.
 */
public class LiWenComputerTest {
    public static void main(String[] args) {
        LiWenComputer myPc = new LiWenComputer("MAC", "blue", "ADM", "8G", "3200");
        myPc.open();
        myPc.close();
        myPc.sleep();
    }
}
