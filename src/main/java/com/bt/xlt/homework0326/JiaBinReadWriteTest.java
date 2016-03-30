package com.bt.xlt.homework0326;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by jiabin on 2016/3/28.
 * Reviewer: beigui
 * Review Date: 2016/3/30
 * Comments: 善用TreeMap保持输入顺序
 */
public class JiaBinReadWriteTest {
    public static void main(String[] args) {

        TreeMap<String, String> map = new TreeMap<String, String>();
        map.put("first", "你好");
        map.put("second", "hello");
        map.put("third", "早上好");
        map.put("fourth", "晚上好");

        File file = new File("D:", "jiabin.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //文件写入
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(file);
            for (Map.Entry<String, String> item : map.entrySet()) {
                byte[] content = (item.getKey() + " = " + item.getValue() + "\r\n").getBytes();
                try {
                    out.write(content);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (null != out) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        //文件读取
        FileReader in = null;
        char[] content = new char[1024];
        try {
            in = new FileReader(file);
            int length = in.read(content);
            System.out.println("jiabin.txt中信息是：" + "\n" + new String(content, 0, length));
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