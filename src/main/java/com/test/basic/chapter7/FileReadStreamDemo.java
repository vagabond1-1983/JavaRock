package com.test.basic.chapter7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by beigui on 2016/4/2.
 * 文件内容的读取 -- FileInputStream
 *      读取d:/test/work.txt中的字符流
 *
 * 1. new String()
 * 2. while 循环读固定长度
 * 3. 文件编码格式的问题   改文件格式
 */
public class FileReadStreamDemo {
    public static void main(String[] args) {
        FileInputStream in = null;
        File file = new File("d:/test/sdfsdf.txt");
        if (!file.exists()) {
            throw new RuntimeException("文件不存在");
        }

        try {
            byte[] content = new byte[1024];
            in = new FileInputStream(file);
            int length = 0;
            while ((length = in.read(content)) != -1) {
                System.out.println(new String(content, 0, length));
            }
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
