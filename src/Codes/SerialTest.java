package Codes;

import java.io.*;

public class SerialTest {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("/Users/yuantengyan/IdeaProjects/Java-Learning/src/Codes/helloworld.txt");

//        ObjectOutputStream objectOutputStream = null;
//        FileOutputStream out = null;
        ObjectInputStream objectInputStream = null;
        FileInputStream in = null;
        try {
//            out = new FileOutputStream(srcFile);
//            objectOutputStream = new ObjectOutputStream(out);
//            User user = new User();
//            objectOutputStream.writeObject(user);
//            objectOutputStream.flush();
            in = new FileInputStream(srcFile);
            objectInputStream = new ObjectInputStream(in);
            Object user = objectInputStream.readObject();
            System.out.println(user);
        } catch (FileNotFoundException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (objectInputStream != null) {
                objectInputStream.close();
            }

        }
    }
}

class User implements Serializable {

}