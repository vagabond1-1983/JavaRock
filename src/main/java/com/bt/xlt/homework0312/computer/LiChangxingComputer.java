package com.bt.xlt.homework0312.computer;

/**
 * Created by LiChangxing on 2016/3/14.
 */
public class LiChangxingComputer {

    String Brand;
    String Colour;
    String Cpu;
    String Mem;
    double Price;
    String WorkingStatus;

    public LiChangxingComputer(String CBrand, String CColour, String CCpu, String CMem, double CPrice, String CWorkingStatus ){
        Brand = CBrand;
        Colour = CColour;
        Cpu = CCpu;
        Mem = CMem;
        Price = CPrice;
        WorkingStatus = CWorkingStatus;

    }

    public String StarUp(){

        return "目前该电脑为"+ Brand + "," + "颜色为" + Colour + "," + "cpu 为" + Cpu +"," + "内存为" + Mem + "," + "价格为" + "," + Price + "," + "工作状态" + WorkingStatus;

    }

    public void ShutDown(String CWorkingStatus){

        WorkingStatus = CWorkingStatus;

        System.out.println("该电脑已经" + WorkingStatus + "了");

    }

    public void Sleep() {

        System.out.println("该电脑已经睡眠了");

    }
}
