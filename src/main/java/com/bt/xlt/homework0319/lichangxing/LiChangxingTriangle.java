package com.bt.xlt.homework0319.lichangxing;

/**
 * Created by LiChangxing on 2016/3/20.
 */
public class LiChangxingTriangle extends LiChangxingAbstractShape {
    @Override
    public double getArea( double... r ) {
        double area =1 ;
        for (double arr : r) {
            area *= arr ;
        }
        return area/2;
    }
}
