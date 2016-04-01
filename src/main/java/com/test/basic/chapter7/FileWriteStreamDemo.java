package com.test.basic.chapter7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by beigui on 2016/3/26.
 * 功能：文件内容的写入 -- FileOutputStream
 *      写入“Java 学习”到文件 d:/test/work.txt中
 */
public class FileWriteStreamDemo {
    public static void main(String[] args) {
        File file = new File("d:/test/", "work.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileOutputStream out = null;
        byte[] content = "Java 学习".getBytes();
        try {
            out = new FileOutputStream(file);
            out.write(content);
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
}
