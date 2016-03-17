package com.bt.xlt.homework0312.computer;

/**
 * 作业：设计一个计算机类，要求如下：
 属性：品 牌、颜色、cpu、内存容量、价格、工作状态
 方法：打开、关闭、休眠
 创建一个计算机对象，调用打开、关闭方法。 -- 打开时显示品牌、颜色、cpu、内存容量、价格、工作
 状态为正常； -- 关闭时，显示工作状态为停止； -- 休眠时，显示工作状态为睡眠。
 * Created by 王小佳 on 2016/3/16.
 * Reviewer: beigui
 * Review Date: 2016/3/18
 * Comments: 抄的时候希望把不符合需求的内容删除掉
 */
public class WangXiaoJiaComputer {

        String brand;
        String color;
        String memory ;
        String cpu ;
        double price ;
        String state;
        int count;
        //定义成员变量，是全局变量

        public WangXiaoJiaComputer( String brand,String color,String memory,String cpu,double price){
            this.brand = brand;
            this.color = color;
            this.memory = memory;
            this.cpu = cpu;
            this.price = price;
        }
        //构造方法

    /*public void click() {
        count = count+1;
        switch (count) {
            case 1:state = "早上";break;
            case 2:state = "中午";break;
            case 3:state = "下午";break;
            case 4:state = "晚上";break;
        }
        System.out.println("点击次数："+count);
        System.out.println("状态："+state);
    }*/

    public static void main(String[] args) {
        WangXiaoJiaComputer cp = new WangXiaoJiaComputer("Thinkpad","balck","4.0G","intel",2000.0);
        //创建对象并赋值
        cp.open();
        //调用方法
        //cp.click();
        cp.state="早上";
        //赋值的另外一种方法
        //cp.click();
        //cp.click();
        cp.close();
      }
        //  注意：字符串之间的拼接：用“+”,注意不要出现逗号之类的，如果出现都需要加“”
        //成员方法

        public void open(){
            System.out.println("品牌：" + this.brand +",颜色：" + this.color+",内存："+ this.memory+",CPU:"+this.cpu+",价格："+ this.price);
        }

        public void close(){
            System.out.println("电脑的状态是："+state);
           // System.out.println("点击次数是："+count);
        }

        public  void sleep(){
            System.out.println("电脑状态是："+state);
        }
    }