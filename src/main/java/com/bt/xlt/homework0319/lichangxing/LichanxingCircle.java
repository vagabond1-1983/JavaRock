package com.bt.xlt.homework0319.lichangxing;

/**
 * Created by LiChangxing on 2016/3/20.
 */
import static java.lang.Math.*;
public class LichanxingCircle extends LiChangxingAbstractShape {

    @Override
    public double getArea(double ... arr) {
        double r = arr[0];
        return 2 * PI * r;
    }
}
