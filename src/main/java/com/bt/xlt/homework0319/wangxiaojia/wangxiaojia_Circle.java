package com.bt.xlt.homework0319.wangxiaojia;

/**
 * Created by 王小佳 on 2016/3/21.
 */
public class wangxiaojia_Circle extends wangxiaojia_Area {
    float PI =3.14159f;
    private float r;
    public wangxiaojia_Circle(float r){   //获得圆形的半径
        this.r=r;
    }
    @Override
    public float getArea() {
        float area = PI*r*r;
        return area;
    }

}
