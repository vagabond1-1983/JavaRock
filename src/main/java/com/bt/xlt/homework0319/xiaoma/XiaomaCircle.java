package com.bt.xlt.homework0319.xiaoma;

public class XiaomaCircle extends XiaomaShape{

	private double Pai=3.14;
	private double r;
	
	public XiaomaCircle(double r){
		this.r = r;
	}
	
	public double getPai() {
		return Pai;
	}

	public void setPai(double pai) {
		Pai = pai;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public void getArea() {	
		if(this.r<=0){
			System.out.println("半径不能小于等于0，请重新构建！");
		}else{
			System.out.println("圆形的面积为："+Pai * Math.pow(r, 2));
		}
	}

}
