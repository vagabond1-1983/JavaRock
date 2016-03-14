package com.bt.xlt.homework0312.computer;

/**
 * Created by yuxinwei on 2016/3/14.
 * 功能：创建一个计算机类，有属性，打开、关闭、睡眠方法，创建一个计算机对象，调用分别打开、关闭、休眠方法
 * Reviewer: beigui
 * Review Date: 2016/3/14
 * Comments: 对this的使用不错
 */
public class WeiYuXinComputerDemo {
    public static void main(String[] args) {
        Computer com = new Computer("联想","银灰色","Intel-I7","8G",8888,"正常");
        com.open();
        com.close("停止");
        com.sleep("睡眠");
    }

    public static class  Computer{
        private String logo;
        private String colour;
        private String cpu;
        private String mem;
        private int price;
        private String status;
        Computer(String logo,String colour,String cpu,String mem,int price,String status){
            this.logo = logo;
            this.colour = colour;
            this.cpu = cpu;
            this.mem = mem;
            this.price = price;
            this.status = status;
        }
        public void open(){
           System.out.println("品牌是"+this.logo+" "+"颜色是"+this.colour+" "+"CPU是"+this.cpu+" "+
                    "内存是"+this.mem+" "+"价格是"+this.price+" "+"工作状态是"+this.status);
        }
        public void close(String status){
            this.status = status;
            System.out.println("工作状态为"+this.status);
        }
        public void sleep( String status){
            this.status = status;
            System.out.println("工作状态为"+this.status);
        }
    }
}
