package com.bt.xlt.homework0319.maxiaoyu;

/**
 * Created by maxy on 2016/3/23.
 * Reviewer: beigui
 * Review Date: 2016/3/23
 */
public class ClassDemo {
    public static void main( String[] args ) {

        Show s1 = new Show();
        s1.showArea( new Triangle( 1.233, 3.222 ) );
        s1.showArea( new Circle( 1 ) );
        s1.showArea( new Square( 1.5, 2 ) );
    }
}
