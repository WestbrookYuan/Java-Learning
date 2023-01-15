package Codes;

public class ReflactClassLoaderTest {
    public static void main(String[] args) {
        Class<Student> studentClass = Student.class;
        ClassLoader classLoader = studentClass.getClassLoader();
        System.out.println(classLoader);


        Class<String> stringClass = String.class;
        ClassLoader classLoader1 = stringClass.getClassLoader();
        System.out.println(classLoader1);
    }


}

class Student{

}