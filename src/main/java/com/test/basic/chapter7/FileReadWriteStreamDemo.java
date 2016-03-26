package com.test.basic.chapter7;

import java.io.*;

/**
 * Created by beigui on 2016/2/18.
 * 功能：文件内容的写入 -- FileOutputStream
 *      写入“Java 学习”到文件 d:/test/work.txt中
 *      文件内容的读取 -- FileInputStream
 *      读取d:/test/work.txt中的字符流
 */
public class FileReadWriteStreamDemo {
    public static void main(String[] args) {
        File file = new File("d:/test", "work.txt");
        FileOutputStream out = null;
        byte[] content = "Java 学习".getBytes();
        //文件不存在则创建
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //文件写入逻辑
        try {
            out = new FileOutputStream(file);
            out.write(content);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流的操作在finally代码段中做，为了即使出异常，打开的流也会被关闭
            if (null != out) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        //文件读取操作
        FileInputStream in = null;
        try {
            byte[] contentReader = new byte[1024];
            in = new FileInputStream(file);
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
