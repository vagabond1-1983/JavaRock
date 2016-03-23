package com.bt.xlt.homework0319.liwen;

/**
 * Created by wen.li on 16/3/21.
 */
public class Square extends Shape {
    private float lenght;
    private float width;

    public Square (float lenght, float width) {
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public void getArea() {
        System.out.println(lenght*width);

    }
}
