package com.bt.xlt.homework0312.computer;

/**
 * Reviewer: beigui
 * Review Date: 2016/3/14
 * Comments:总体不错，提前预习了下一章的内容
 *          改进点：文件名没有按格式，类上没有作者和日期，if语句规范写法
 *                初始值实例化，预防空指针
 *                封装：内部调用时不要太麻烦，直接访问属性，不要再写方法访问。外部调用需要方法访问属性，这个想法不错。
 */
public class XiaoMaComputer {

	private  String  brand;
	private  String  color;
	private  String CPU;
	private  String memory;
	private double Price;
	private String working;
	
	public String getWorking(int state) {
		if(state == 1)
		return "电脑正常工作";
		else if (state==2)
			return "电脑关闭";
		else 
			return "电脑休眠";
	}

	public String getBrand() {
		return "品牌:Dell";
	}

	public String getColor() {
		return "颜色:Black";
	}

	public String getCPU() {
		return "CPU:Intel";
	}

	public String getMemory() {
		return "内存:Kingston";
	}

	public double getPrice() {
		return 2999;
	}

	public void openComputer(){
		System.out.println(this.getWorking(1));
		System.out.println("显示电脑信息："+this.getBrand()+"\n"+this.getColor()+"\n"+this.getCPU()+"\n"+this.getMemory()+"\n"+this.getPrice());
	}
	
	public void closeComputer(){
		System.out.println(getWorking(2));
	}
	
	public void sleepComputer(){
		System.out.println(getWorking(3));
	}
}
