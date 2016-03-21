package com.bt.xlt.homework0319.xiaoma;

public class XiaomaTriangle extends XiaomaShape{

	private double height;
	private double bottom;

	public XiaomaTriangle(double height,double bottom){
		
		this.height = height;
		this.bottom = bottom;
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBottom() {
		return bottom;
	}

	public void setBottom(double bottom) {
		this.bottom = bottom;
	}

	@Override
	public void getArea() {
		if(this.height<=0||this.bottom<=0){
			System.out.println("无法构成三角形，请重新构建");		
		}else{
			System.out.println("三角形的面积为："+(this.height * this.bottom)/2);
		}
		
	}

}
