package com.test.basic.chapter7;

import java.io.*;

/**
 * Created by beigui on 2016/2/20.
 * 功能：文件内容的写入 -- FileWriter
 *      文件内容的读取 -- FileReader
 */
public class FileReaderWriterDemo {
    public static void main(String[] args) {
        File file = new File("d:/test", "work.txt");
        FileWriter writer = null;
        String content = "Java 学习 File Writer";
        //文件不存在则创建
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            file.delete();
        }
        //文件写入逻辑
        try {
            writer = new FileWriter(file);
            writer.write(content);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流的操作在finally代码段中做，为了即使出异常，打开的流也会被关闭
            if (null != writer) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        //文件读取操作
        FileReader in = null;
        try {
            char[] contentReader = new char[1024];
            in = new FileReader(file);
            int length = in.read(contentReader);
            System.out.println("文件中的信息是：" + new String(contentReader, 0, length));
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
