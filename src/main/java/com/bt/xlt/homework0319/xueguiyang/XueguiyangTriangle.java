package com.bt.xlt.homework0319.xueguiyang;

/**
 * Created by xueguiyang on 16-3-21.
 */
public class XueguiyangTriangle extends XueguiyangShape {
    private double bottom;
    private double high;

    XueguiyangTriangle(double b,double h){
        bottom = b;
        high = h;
    }

    @Override
    public void getArea() {
        System.out.println("三角形面积 "+(bottom + high)/2);
    }
}
