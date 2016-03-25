package com.bt.xlt.homework0319.wangxiaojia;

/**
 * Created by 王小佳 on 2016/3/21.
 */
public  class wangxiaojia_Square extends wangxiaojia_Area {
    private float l;
    private float m;
    public wangxiaojia_Square(float l, float m){ //获得矩形的长和宽
        this.l=l;
        this.m=m;
    }
    @Override

    public float getArea() {

        float area = l*m;
        return area;
    }
}


