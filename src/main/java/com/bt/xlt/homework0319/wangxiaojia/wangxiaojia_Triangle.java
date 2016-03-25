package com.bt.xlt.homework0319.wangxiaojia;

/**
 * Created by 王小佳 on 2016/3/21.
 */
public class wangxiaojia_Triangle extends wangxiaojia_Area {
    private float a;
    private float b;
    public wangxiaojia_Triangle(float a, float b){ //获得三角形的长和宽
        this.a=a;
        this.b=b;
    }
    @Override
    public float getArea() {
        float area = a*b/2;
        return area;
    }
}
