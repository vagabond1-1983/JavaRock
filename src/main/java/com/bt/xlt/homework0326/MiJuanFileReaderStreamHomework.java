package com.bt.xlt.homework0326;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.io.BufferedReader;

/**
 * Created by mijua on 3/26/2016.
 * Reviewer: beigui
 * Review Date: 2016/3/30
 * Comments: 能够用BufferWriter写入字。
 *           改进点：流在finally里面关闭
 */
public class MiJuanFileReaderStreamHomework {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("first", "你好");
        map.put("second", "hello");
        map.put("third", "早上好");
        map.put("fourth", "晚上好");

        File file = new File("c:/", "homework.txt");
        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //以行为单位将字符串写入文件中
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter (file));
            Set<String> keys = map.keySet();
            for (String key : keys) {
                writer.write(key);
                writer.write(map.get(key));
                writer.newLine();
            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //以行为单位读取文件内容，一次读一行
        BufferedReader reader = null;
        System.out.println("以行为单位读取文件内容，一次读一行");
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            while((tempString = reader.readLine()) != null) {
                System.out.println(tempString);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        }
    }
                                                                                                                                             