package com.design.adapter;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * InputStreamReader，是一个流的适配器；使用BufferedReader可以很方便地操作文本文件里的字符串，但是BufferedReader是操作字符流的对象，
 * 不能直接操作字节流，所以，得把字节流转换成字符流，InputStreamReader就是充当转换的适配器
 */
public class InputStreamReaderAdapterClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:/Users/admin/Downloads/a.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
