package com.test.basic.chapter7;

import java.io.*;

/**
 * Created by beigui on 2016/2/20.
 * 功能：文件内容的写入 -- BufferedWriter
 *      文件内容的读取 -- BufferedReader
 * 缓冲区，把流先写入/读取到缓冲区内存，再从缓冲区写入/读取。
 */
public class BufferedReaderWriterDemo {
    public static void main(String[] args) {
        File file = new File("d:/test", "work.txt");
        FileWriter writer = null;
        BufferedWriter buffWriter = null;
        String content = "Java 学习 File Writer";
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
            writer = new FileWriter(file);
            buffWriter = new BufferedWriter(writer);
            int line = 5;
            while (line-- > 0) {
                buffWriter.write(line + " " + content);
                buffWriter.newLine();
            }
            buffWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != buffWriter) {
                try {
                    buffWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
        BufferedReader buffReader = null;
        try {
            in = new FileReader(file);
            buffReader = new BufferedReader(in);
            String lineContent = "";
            System.out.println("文件中的信息是：");
            /*do {
                lineContent = buffReader.readLine();
                System.out.println(lineContent);
            } while (lineContent != null);*/

            while ((lineContent = buffReader.readLine()) != null) {
                System.out.println(lineContent);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != buffReader) {
                try {
                    buffReader.close();
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
