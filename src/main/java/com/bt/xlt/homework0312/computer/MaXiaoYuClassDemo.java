package com.bt.xlt.homework0312.computer;

/**
 * Created by Xiaoyu on 2016/3/14.
 */
public class MaXiaoYuClassDemo {
    public static void main( String[] args ) {

        /** 创建对象 */
        MaXiaoYuComputer computer1 = new MaXiaoYuComputer( "联想", "黑色", "i5", "8G", "CNY4500" );

        /** 对象调用打开方法 */
        System.out.print( "打开电脑| " );
        computer1.Open();


        /** 对象调用关闭方法 */
        System.out.print( "关闭电脑| " );
        computer1.Close();

        /** 对象调用休眠方法 */
        System.out.print( "休眠电脑| " );
        computer1.Sleep();

    }
}
