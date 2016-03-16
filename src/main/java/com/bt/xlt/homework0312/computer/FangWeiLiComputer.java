package com.bt.xlt.homework0312.computer;

/**
 * Created by FangWeiLi on 2016/3/16.
 * 作业：设计一个计算机类，要求如下：
 属性：品 牌、颜色、cpu、内存容量、价格、工作状态
 方法：打开、关闭、休眠
 创建一个计算机对象，调用打开、关闭方法。 -- 打开时显示品牌、颜色、cpu、内存容量、价格、工作
 状态为正常； -- 关闭时，显示工作状态为停止； -- 休眠时，显示工作状态为睡眠。
 * Reviewer: beigui
 * Review Date: 2016/3/16
 * Comments: open等方法不需要整个对象作为参数。更好的方式是把状态属性开放，通过改变这个属性，检测并使用。而不会以整个对象作为参数
 *           这个也不是一个不变的规则。只是在这里更实用些。慢慢体会。
 */
public class FangWeiLiComputer {
    String brand;
    String colour;
    String cpu;
    double memory;
    double price;
    String state;
    FangWeiLiComputer(){

    }
    FangWeiLiComputer(String brand , String colour , String cpu , double memory , double price , String state){
        this.brand = brand;
        this.colour = colour;
        this.cpu = cpu;
        this.memory = memory;
        this.price = price;
        this.state = state;
    }
    public void Open(FangWeiLiComputer computer){
        System.out.println("该电脑的品牌为:" + computer.brand + ";颜色是:" +computer.colour+
                           ";cpu为:" +computer.cpu +";内存容量为："+computer.memory+
                           ";价格是："+computer.price+ ";工作状态是："+computer.state);
    }

    public void Close(FangWeiLiComputer computer){
        computer.state = "停止";
        System.out.println("该电脑的工作状态是：" + computer.state);

    }

    public void Sleep(FangWeiLiComputer computer){
        computer.state = "休眠,";
        System.out.println("该电脑的工作状态是：" + computer.state);
    }
}
