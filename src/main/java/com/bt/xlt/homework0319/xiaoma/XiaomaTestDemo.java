package com.bt.xlt.homework0319.xiaoma;

/**
 * Reviewer: beigui
 * Review Date: 2016/3/21
 */
public class XiaomaTestDemo {

	public static void main(String[] args) {
		
		XiaomaSquare sq = new XiaomaSquare(2, 4.3);
		sq.setLonge(5);
		sq.getArea();
		
		XiaomaCircle c =new XiaomaCircle(2);
		c.getArea();
		
		XiaomaTriangle t =new XiaomaTriangle(2, 4);
		t.getArea();

	}

}
