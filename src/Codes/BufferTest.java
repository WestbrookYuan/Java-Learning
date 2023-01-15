package Codes;

import java.io.*;

public class BufferTest {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("/Users/yuantengyan/IdeaProjects/Java-Learning/src/Codes/helloworld.txt");
        File desFile = new File("/Users/yuantengyan/IdeaProjects/Java-Learning/src/Codes/helloworld.txt.copy");

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        BufferedInputStream bufferin = null;
        BufferedOutputStream bufferout = null;
        byte[] cache = new byte[1024];
        try {
            fileInputStream = new FileInputStream(srcFile);
            fileOutputStream = new FileOutputStream(desFile);

            bufferin = new BufferedInputStream(fileInputStream);
            bufferout = new BufferedOutputStream(fileOutputStream);
            int data;
            while ((data = bufferin.read(cache)) != -1){
                bufferout.write(cache, 0, data);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (bufferin != null){
                bufferin.close();
            }
            if (bufferin != null){
                bufferout.close();
            }

        }
    }
}
