package Codes;

import java.io.*;

public class StreamTest {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("/Users/yuantengyan/IdeaProjects/Java-Learning/src/Codes/helloworld.txt");
        File desFile = new File("/Users/yuantengyan/IdeaProjects/Java-Learning/src/Codes/helloworld.txt.copy");

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(srcFile);
            fileOutputStream = new FileOutputStream(desFile);
            int data;
            while ((data = fileInputStream.read()) != -1){
                fileOutputStream.write(data);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (fileInputStream != null){
                fileInputStream.close();
            }
            if (fileOutputStream != null){
                fileOutputStream.close();
            }

        }
    }
}
