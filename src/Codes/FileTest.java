package Codes;

import java.io.File;
import java.util.List;

public class FileTest {
    public static void main(String[] args) {
        String filePath = "/Users/yuantengyan/IdeaProjects/Java-Learning/src/Codes/";
        File file = new File(filePath);
        System.out.println(file);
        System.out.println(file.isFile());
        if (file.exists()){
            String[] files = file.list();
            for (String file1: files) {
                System.out.println(file1);
            }
            File[] filess = file.listFiles();
            for (File file1: filess) {
                System.out.println(file1);
            }
        }
        else {
            System.out.println("non");
        }
    }
}
