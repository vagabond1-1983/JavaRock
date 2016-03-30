package com.bt.xlt.homework0326;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by QZ on 2016/3/30.
 */
public class FileOperate {
    /**
     * 创建文件，并将数据写入文件
     * @param fileName
     * @param context
     */
    public void writeDataToFile(String fileName,String context) {
        File file = new File(fileName);
        //创建文件
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //文件内容写入
        FileOutputStream out = null;
        byte[] contextReader = context.getBytes();
        try {
            out = new FileOutputStream(file);
            out.write(contextReader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
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
    }

    /**
     * 文件内容读取
     * @param fileName
     * @return
     */
        public String readDataFromFile(String fileName){
            String context = "";
            FileInputStream in = null;
            try {
                byte[] contentReader = new byte[1024];
                in = new FileInputStream(fileName);
                int length = in.read(contentReader);
                context = new String(contentReader, 0, length);
                System.out.println("1、文件内容：：" + new String(contentReader, 0, length));
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
            return context;
    }

    /**
     * map转存数据
     * @param context
     * @return
     */
    public Map<String,String> putDataToMap(String context){
        String [] arr = context.split(" ");
        Map<String,String> map = new HashMap<String,String>();
        for(String str : arr){
            String key = str.split("=")[0];
            String value = str.split("=")[1];
            map.put(key,value);
        }
        return map;
    }




    }

