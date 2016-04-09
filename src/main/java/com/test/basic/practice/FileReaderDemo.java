package com.test.basic.practice;

import java.io.*;

/**
 * Created by beigui on 2016/4/9.
 * @author liwen
 */
public class FileReaderDemo {
    public static void main(String[] args) {
        File file = new File("d:\\test\\work.txt");

        if (file.exists()) {
            FileReader in = null;
            BufferedReader buff = null;
            try {
                in = new FileReader(file);
                buff = new BufferedReader(in);

                String conline = "";
                while ((conline = buff.readLine()) != null) {
                    System.out.println(conline);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (buff != null) {
                    try {
                        buff.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
