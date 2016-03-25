package com.bt.xlt.homework0319.maxiaoyu;

/**
 * Created by maxy on 2016/3/23.
 */
public class ClassDemoRef {
    public static void main( String[] args ) {

        int p = Integer.parseInt(args[0]);
        Show s1 = new Show();

        switch ( p ) {
            case 0:
                System.out.println( "请在第一行输入形状：1、圆形 2、矩形 3、三角形" );
                break;

            case 1:
                double r1 = Integer.parseInt(args[1]);
                if ( r1 == 0 ) {
                    System.out.println( "请在第二行输入圆形的半径" );
                }
                else if ( r1 > 0 ) {
                    s1.showArea( new Circle( r1 ) );
                }
                else {
                    System.out.println( "圆形的半径必须是正数，请重新输入" );
                }
                break;

            case 2:
                double a1 = Integer.parseInt(args[1]);
                double b1 = Integer.parseInt(args[2]);
                if ( a1 == 0 || b1 == 0 ) {
                    System.out.println( "请在第二行输入矩形的长，在第三行输入矩形的宽" );
                }
                else if ( a1 > 0 && b1 > 0 ){
                    s1.showArea( new Square( a1, b1 ) );
                }
                else {
                    System.out.println( "矩形的长和宽必须是正数，请重新输入" );
                }
                break;

            case 3:
                double d1 = Integer.parseInt(args[1]);
                double h1 = Integer.parseInt(args[2]);
                if ( d1 == 0 || h1 == 0 ) {
                    System.out.println( "请在第二行输入三角形的底，在第三行输入三角形的高" );
                }
                else if ( d1 > 0 && h1 > 0 ){
                    s1.showArea( new Triangle( d1, h1 ) );
                }
                else {
                    System.out.println( "三角形的底和高必须是正数，请重新输入" );
                }
                break;

            default:
                System.out.println( "无法判断形状，请重新输入！" );
        }
    }
}
