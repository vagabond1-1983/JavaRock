package com.bt.xlt.homework0326;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by weiyuxin on 2016/3/28.
 * 功能：将下面一段文字写入文件，(并从文件读出)，用map转存即记录数据
 * Reviewer: beigui
 * Review Date: 2016/3/30
 */
public class WeiYuXinInputAndOutputFile {
    public static void main(String[] args) {
        File file = new File("F:/", "file.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Map<String, String> map = new HashMap<String, String>();
        map.put("first=", "你好");
        map.put("second=", "hello");
        map.put("third=", "早上好");
        map.put("fourth=", "晚上好");
        String str = "";
        for (Map.Entry<String,String> item : map.entrySet()) {
            str = str +  item.getKey() + item.getValue() + "\r\n";
        }
        FileOutputStream out = null;
        byte[] contentWrite = str.getBytes();
        try {
            out = new FileOutputStream(file);
            out.write(contentWrite);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (null != out){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        FileInputStream in = null;
        try {
            byte[] contentReader = new byte[1024];
            in = new FileInputStream(file);
            int length = in.read(contentReader);
            System.out.print( new String(contentReader, 0, length));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != in) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
