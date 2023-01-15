package Codes;

import java.io.*;

public class CharStreamTest {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("/Users/yuantengyan/IdeaProjects/Java-Learning/src/Codes/helloworld.txt");
        File desFile = new File("/Users/yuantengyan/IdeaProjects/Java-Learning/src/Codes/helloworld.txt.copy");

        BufferedReader bufferedReader = null;
        PrintWriter printWriter = null;
        try {
            bufferedReader= new BufferedReader(new FileReader(srcFile));
            printWriter = new PrintWriter(desFile);
            String line = null;
            StringBuilder stringBuilder = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null){
                printWriter.println(line);
            }
            printWriter.flush();
            stringBuilder.append("zhang san");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (bufferedReader != null){
                bufferedReader.close();
            }
            if (printWriter != null){
                printWriter.close();
            }

        }
    }
}
