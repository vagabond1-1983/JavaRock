package com.bt.xlt.homework0312.computer;

/**
 * Created by xueguiyang on 16-3-14.
 */
public class XueGuiYangComputer {
    String Brand;
    String Color;
    String CPU;
    String Memory;
    double price;

    public XueGuiYangComputer(String Brand,String Color,String CPU, String Memory,double price){
        this.Brand = Brand;
        this.Color = Color;
        this.CPU = CPU;
        this.Memory = Memory;
        this.price = price;
        XueGuiYangComputer.this.start();
        System.out.println("品牌 "+this.Brand);
        System.out.println("颜色: "+this.Color);
        System.out.println("CPU: "+this.CPU);
        System.out.println("内存: "+this.Memory);
        System.out.println("价格: "+this.price);
    }
    public void start(){
        System.out.println("电脑工作状态为正常状态");
    }

    public void shutdown(){
        System.out.println("电脑工作状态为关闭状态");
    }

    public void sleep(){
        System.out.println("电脑工作状态为休眠状态");
    }
}
