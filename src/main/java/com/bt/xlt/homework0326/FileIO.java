package com.bt.xlt.homework0326;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lidongkun on 2016/3/29.
 * Reviewer: beigui
 * Review Date: 2016/3/30
 * Comments: 流的关闭需要在finally里面
 */
public class FileIO {
    Map<String,String> map = new HashMap<String,String>();
    public void addMap() {
        map.put("first","你好");
        map.put("second","Hello");
        map.put("third","早上好");
        map.put("fourth","晚上好");
    }

    public void fileWriter() {
        try {
            FileWriter filewriter = new FileWriter("D:/ldk.txt");
            BufferedWriter bufferewriter = new BufferedWriter(filewriter);
            for(String item:map.values()) {
                bufferewriter.write(item);
            }
            bufferewriter.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
    public void fileReader() {
        try {
            FileReader filereader = new FileReader("D:/ldk.txt");
            BufferedReader bufferedreader = new BufferedReader(filereader);
            System.out.println(bufferedreader.readLine());
            bufferedreader.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
