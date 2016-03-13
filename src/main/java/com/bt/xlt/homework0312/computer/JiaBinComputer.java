package com.bt.xlt.homework0312.computer;

/**
 * Created by jiabin on 2016/3/12.
 */
public class JiaBinComputer {
    String brand = "acer";   //品牌
    String color = "black";   //颜色
    String cpu = "Core i5";     //cpu
    int memory = 4;  //内存
    int price = 3500;      //价格
    String status;     //工作状态

    public JiaBinComputer(String brand , String color , String cpu  , int memory , int price){
        this.brand = brand;
        this.color = color;
        this.cpu = cpu;
        this.memory = memory;
        this.price = price;
    }

    public void start(){
        status = "开机";
        System.out.printf("调用computer start()开机方法。品牌：" + brand + "  颜色：" + color + "  cpu：" + cpu + " 内存：" + memory + "  价格：" + price + "  工作状态：" + status);
    }
    public void shutdown(){
        status = "关机";
        System.out.println("调用computer shutdown()关机方法。工作状态：" + status);
    }
    public void sleep(){
        status = "休眠";
        System.out.println("调用computer sleep()休眠方法。工作状态：" + status);
    }
}
