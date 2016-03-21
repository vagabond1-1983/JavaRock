package com.bt.xlt.homework0319.xueguiyang;

/**
 * Created by xueguiyang on 16-3-21.
 */
public class XueguiyangSquare extends XueguiyangShape {
    private double length;
    private double width;

    XueguiyangSquare(double l,double w){
        length = l;
        width = w;
    }

    @Override
    public void getArea() {
        System.out.println("长方形的面积:"+ (length + width) * 2);
    }


}
