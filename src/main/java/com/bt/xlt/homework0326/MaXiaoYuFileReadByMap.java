package com.bt.xlt.homework0326;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by maxy on 2016/3/28.
 * Reviewer: beigui
 * Review Date: 2016/3/30
 * Comments: 能多考虑到输入的map顺序，不错。
 *           改进点：还是有点麻烦，直接用TreeMap是不是更好
 */
public class MaXiaoYuFileReadByMap {
    public static void main ( String[] args ) {

        /** 声名文件 */
        File file1 = new File ( "D:\\", "test.txt" );

        /** 创建文件读取流 */
        FileOutputStream fileOut1 = null;

        /** 创建map */
        Map < String, String > map1 = new HashMap <String, String> ();
        map1.put ( "first", "你好" );
        map1.put ( "second", "Hello" );
        map1.put ( "third", "早上好" );
        map1.put ( "fourth", "晚上好" );

        /** 创建list，记录map的key（因为要求顺序所以用list记录） */
        List < String > list1 = new ArrayList < String > ();
        list1.add ( "first" );
        list1.add ( "second" );
        list1.add ( "third" );
        list1.add ( "fourth" );

        /** 如果已存在同命名的文件，则先删除 */
        if ( file1.exists() ) {
            file1.delete();
        }

        /** 创建文件。从list中读出key，并通过map匹配到value，通过文件依次读取key和value */
        if ( file1.exists() == false)  {
            try {
                file1.createNewFile();
                fileOut1 = new FileOutputStream( file1 );
                for ( int i = 0; i < list1.size(); i++ ) {
                    fileOut1.write( list1.get( i ).getBytes() );
                    fileOut1.write( "=".getBytes() );
                    fileOut1.write( map1.get( list1.get( i ) ).getBytes() );
                    fileOut1.write( "\r\n".getBytes() );
                }
            } catch ( IOException e ) {
                System.out.println ( "异常信息是：" + e.getMessage() );
            } catch ( Exception e ) {
                System.out.println ( "异常信息是：" + e.getMessage() );
            } finally {
                if ( fileOut1 != null ) {
                    try {
                        fileOut1.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}
