package org.example.fileOutputStream_;

import org.testng.annotations.Test;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutSteam_ {
    public static void main(String[] args) {

    }

    @Test
    public void fileOutPutStream01() {
        String filePath = "e:\\a.txt";
        FileOutputStream fileOutputStream = null;

        try {
             fileOutputStream = new FileOutputStream(filePath,true);
            fileOutputStream.write('y');
            fileOutputStream.write('q');

            String str = "hello,world";
            //str.getBytes() 可以把 字符串-> 字节数组
            fileOutputStream.write(str.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
