package org.example.InputStream_;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void FileInputStream01() {
        //定义一个文件路径
        String FilePath = "e:\\hello.txt";
        int readData = 0;
        FileInputStream fileInputStream = null;
        try {
            //创建一个流对象,用于读取文件
            fileInputStream = new FileInputStream(FilePath);
            //如果返回-1,表示读取完毕
            while ((readData = fileInputStream.read()) != -1) {
                System.out.print((char) readData);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Test
    public void FileInputStream02() {
        //定义一个文件路径
        String FilePath = "e:\\hello.txt";
        byte[] buff = new byte[8];
        int readLead = 0;
        FileInputStream fileInputStream = null;
        try {
            //创建一个流对象,用于读取文件
            fileInputStream = new FileInputStream(FilePath);
            //如果返回-1,表示读取完毕
            //如果读取成功,返回的是读取到的字节数
            while ((readLead = fileInputStream.read(buff)) != -1) {
                System.out.print(new String(buff, 0, readLead));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
