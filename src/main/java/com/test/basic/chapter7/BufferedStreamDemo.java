package com.test.basic.chapter7;

import java.io.*;

/**
 * Created by beigui on 2016/2/20.
 * 功能：文件内容的写入 -- BufferedOutputStream
 *      文件内容的读取 -- BufferedInputStream
 * 缓冲区，把流先写入/读取到缓冲区内存，再从缓冲区写入/读取。
 * 本质上是底层InputStream/OutputStream的包装类，最终是通过底层写入。加上了缓冲区，对大文件的读取写入效果会明显些。
 */
public class BufferedStreamDemo {
    public static void main(String[] args) {
        File file = new File("d:/test", "work.txt");
        FileOutputStream out = null;
        BufferedOutputStream buffOut = null;
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
            buffOut = new BufferedOutputStream(out);
            int line = 5;
            while (line-- > 0) {
                buffOut.write(content);
                buffOut.write(("\r\n").getBytes());
            }
            buffOut.flush(); //在缓存区没有满的情况下，也将缓存区的内容强制写入到外设。
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //当调用close方法时，系统在关闭流之前，将缓存区中信息刷新到磁盘文件中。
            if (null != buffOut) {
                try {
                    buffOut.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
        BufferedInputStream buffIn = null;
        try {
            byte[] contentReader = new byte[1024];
            in = new FileInputStream(file);
            buffIn = new BufferedInputStream(in);
            int length = buffIn.read(contentReader);
            System.out.println("文件中的信息是：" + new String(contentReader, 0, length));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != buffIn) {
                try {
                    buffIn.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
