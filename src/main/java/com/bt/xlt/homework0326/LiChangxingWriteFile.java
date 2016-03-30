package com.bt.xlt.homework0326;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by LiChangxing on 2016/3/28.
 * Reviewer: beigui
 * Review Date: 2016/3/30
 * Comments: 代码规范呢？
 */
public class LiChangxingWriteFile {
    public static void main( String[] args ) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("first", "你好");
        map.put("second", "hello");
        map.put("third", "早上好");
        map.put("fouth", "晚上好");


        File file = new File("d:/", "testfile.txt");;
        FileOutputStream out = null;
        StringBuffer str = new StringBuffer("");

        if ( file.exists() == false )
        {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

            for (Map.Entry item : map.entrySet()) {

                str.append(item).append(" "); //将Map中的key和value拼成string
            }

            try {
                out = new FileOutputStream(file);
                byte [] content = str.toString().getBytes();
                out.write(content);

            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }


