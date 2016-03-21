package com.bt.xlt.homework0319.xiaoma;

public class XiaomaSquare extends XiaomaShape{
	
	private double Longe;
	private double wide;

	public XiaomaSquare(double Longe,double wide){
		this.Longe = Longe;
		this.wide = wide;
	}

	public double getLonge() {
		return Longe;
	}

	public void setLonge(double longe) {
		Longe = longe;
	}

	public double getWide() {
		return wide;
	}

	public void setWide(double wide) {
		this.wide = wide;
	}

	@Override
	public void getArea() {	
		if( this.Longe<=0||this.wide<=0){
			System.out.println("无法构成矩形，请核对后重新构建！");
		}else{
			System.out.println("矩形的面积为："+this.Longe * this.wide);
		}
	
	}
	

}
