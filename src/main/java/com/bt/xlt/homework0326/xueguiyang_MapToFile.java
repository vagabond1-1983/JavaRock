package com.bt.xlt.homework0326;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * Created by xueguiyang on 16-3-29.
 * 作业：将下面一段文字写入文件，(并从文件读出)，请用map转存即记录数据
   first=你好
   second=hello
   third=早上好
   fourth=晚上好
 * Reviewer: beigui
 * Review Date: 2016/3/30
 */
public class xueguiyang_MapToFile {
    private static String path = "/Users/xueguiyang/Desktop/workspace";
    private static String name = "test.txt";

    public static void main(String[] args) {
        //创建文件
        File file = new File(path, name);
        if (file.exists()) {
            file.delete();
            System.out.println("文件已删除");
        } else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //插入数据
        Map<String, String> map = new HashMap<String, String>();
        map.put("first", "你好");
        map.put("second", "hello");
        map.put("third", "早上好");
        map.put("fourth", "晚上好");

        //向文件里写数据
        FileWriter writer = null;
        try {
            writer = new FileWriter(file, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        StringBuffer buffer = new StringBuffer();
        Set<String> keys = map.keySet();
        for (String key : keys) {
            buffer.append(key);
            buffer.append(map.get(key));
            buffer.append("\n");
        }
        try {
            writer.write(buffer.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        //从文件读数据
        FileReader fr= null;
        try {
            fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        BufferedReader br = new BufferedReader(fr);

        String str = "";
        try {
            while((str = br.readLine()) != null)
            {
                System.out.println(str);
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}





