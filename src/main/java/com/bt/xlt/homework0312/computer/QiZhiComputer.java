package com.bt.xlt.homework0312.computer;

/**
 * Created by QZ on 2016/3/16.
 * 设计一个计算机类
 * 属性：品牌、颜色、cpu、内存容量、价格、工作状态
 * 方法：
 * 	打开：打开时显示品牌、颜色、cpu、内存容量、价格、工作状态为正常；
 *  关闭：关闭时，显示工作状态为停止；
 *  休眠：休眠时，显示工作状态为睡眠。
 * Reviewer: beigui
 * Review Date: 2016/3/18
 * Comments: super的作用，无参数构造函数需不需要写，StringBuffer的作用及使用场景
 */
public class QiZhiComputer {
    /** 品牌 */
    private String brand;
    /** 颜色 */
    private String color;
    /** cpu */
    private String cpu;
    /** 内存容量 */
    private String memory;
    /** 价格 */
    private double price;
    /** 工作状态 */
    private String status;

    /**
     * 无参数构造方法
     */
    public QiZhiComputer() {
        super();
    }

    /**
     * 有参数构造方法
     * @param brand
     * @param color
     * @param cpu
     * @param memory
     * @param price
     */
    public QiZhiComputer(String brand, String color, String cpu, String memory, double price) {
        super();
        this.brand = brand;
        this.color = color;
        this.cpu = cpu;
        this.memory = memory;
        this.price = price;
    }

    /**
     * 打开计算机
     * @return
     */
    public String open(){
        this.setStatus("正常");
        StringBuffer sb = new StringBuffer();
        sb.append("品牌：");
        sb.append(this.getBrand());
        sb.append(", ");
        sb.append("颜色：");
        sb.append(this.getColor());
        sb.append(", ");
        sb.append("cpu：");
        sb.append(this.getCpu());
        sb.append(", ");
        sb.append("内存：");
        sb.append(this.getMemory());
        sb.append(", ");
        sb.append("价格：");
        sb.append(this.getPrice());
        sb.append(", ");
        sb.append("状态：");
        sb.append(this.getStatus());
        sb.append("。");
        return sb.toString();
    }

    /**
     * 关闭计算机
     * @return
     */
    public String shutdown(){
        this.setStatus("关闭");
        StringBuffer sb = new StringBuffer();
        sb.append("状态：");
        sb.append(this.getStatus());
        sb.append("。");
        return sb.toString();
    }

    /**
     * 休眠计算机
     * @return
     */
    public String sleep(){
        this.setStatus("休眠");
        StringBuffer sb = new StringBuffer();
        sb.append("状态：");
        sb.append(this.getStatus());
        sb.append("。");
        return sb.toString();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
