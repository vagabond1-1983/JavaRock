package com.test.basic.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by beigui on 2016/4/9.
 * @author maxiaoyu & mijuan
 */
public class MapCount {
    //I work at A company. Apply java in test area. I thought test work very good.
    public static void main ( String[] args ) {

        String str = "I work at A company. Apply java in test area. I thought test work very good.";
        String[] arr = str.split( " " );
        Map < String, Integer> map = new HashMap < String, Integer >();
        for ( int j = 0; j < arr.length; j ++ ) {
            String key = arr[j].replace(".", "");
            int value = 1;
            if ( null != map.get(key) ) {
                value = map.get(key) + 1;
            }
            map.put( key, value );
        }

        for ( String c : map.keySet() ) {
            System.out.println( "单词" + c + "出现的次数是：" + map.get( c ) );
        }

    }

}
