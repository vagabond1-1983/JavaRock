package com.bt.xlt.homework0326;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wen.li on 16/3/26.
 * 作业：将下面一段文字写入文件，(并从文件读出)，请用map转存即记录数据
 * first=你好,second=hello,third=早上好,fourth=晚上好
 * Reviewer: beigui
 * Review Date: 2016/3/30
 */
public class LiWenFileRWDemo {
    public static void main(String[] args) {
        //map存储内容
        Map<String, String> cMap = new HashMap<String, String>();
        cMap.put("first","你好");
        cMap.put("second","hello");
        cMap.put("third","早上好");
        cMap.put("fourth", "晚上好");

        StringBuffer content = new StringBuffer();

        for (String item : cMap.keySet()) {
            content.append(item).append("=").append(cMap.get(item)).append(" ");
        }

        File file = new File("src/main/java/com/day4/LiWenFileRWDemo","map.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //文件写入
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(file);
            out.write(content.toString().getBytes("utf-8"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        //文件读取
        FileInputStream input = null;
        try {
            System.out.println("文件大小：" + file.length());
            byte[] contentReader = new byte[1024];
            input = new FileInputStream(file);
            int length = input.read(contentReader);
            input.read();
            System.out.println("文件内容为：" + new String(contentReader,0,length));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
