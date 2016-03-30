package com.bt.xlt.homework0326;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by little_5 on 2016-03-30.
 * 作业：将下面一段文字写入文件，(并从文件读出)，请用map转存即记录数据
    first=你好
    second=hello
    third=早上好
    fourth=晚上好
 * Reviewer: beigui
 * Review Date: 2016/3/30
 */
public class ChenCaiYu_File {
    public static void main (String[] args) {
        File file = new File("D:/chencaiyu/","ccy.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //写入文件
        FileOutputStream out = null;
        String content = "first=你好\r\nsecond=hello\r\nthird=早上好\r\nfourth=晚上好";
        byte[] contentArr = content.getBytes();
        try {
            out = new FileOutputStream(file);
            out.write(contentArr);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //读取文件
        if (file.exists()) {
            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader(file));
                String line = br.readLine();
                Map<String, String> map = new HashMap<String, String>();
                while (line != null) {
                    String[] str = line.split("=");
                    map.put(str[0], str[1]);
                    line = br.readLine();
                }
                System.out.println(map);
                Set<String> keys = map.keySet();
                for (String key : keys) {
                    System.out.println("key为：" + key + " value为：" +  map.get(key));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
