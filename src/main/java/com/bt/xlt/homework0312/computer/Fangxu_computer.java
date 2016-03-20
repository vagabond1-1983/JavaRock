package com.bt.xlt.homework0312.computer;

/**
 * Created by fx on 2016/3/17.
 */
class Fangxu_computer {
    String brand;
    String color;
    String cpu;
    String memory;
    int price;


    public void open() {
        System.out.println(brand +"\n" +color +"\n" +cpu +"\n" +memory +"\n"+price +"元" +"\n"+"状态：正常");
    }
    public void off(){
        System.out.println("状态：关机");
    }
    public void sleep() {
        System.out.println("状态：休眠");
    }

}
