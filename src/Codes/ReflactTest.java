package Codes;

import java.lang.reflect.Field;
import java.util.Arrays;

public class ReflactTest {
    public static void main(String[] args) throws NoSuchFieldException {
        User2 user2 = new Child();
        user2.test();
//        user2.test2();
        Class<? extends User2> aClass = user2.getClass();
        System.out.println(aClass.getName());
        System.out.println(aClass.getSimpleName());
        System.out.println(aClass.getPackage());
        System.out.println(aClass.getSuperclass());
        System.out.println(Arrays.toString(aClass.getInterfaces()));
        Field f = aClass.getField("1");
        Field f1 = aClass.getDeclaredField("1");
        Field[] fs = aClass.getFields();
        Field[] f1s = aClass.getDeclaredFields();
    }
}

class User2 {
    public void test(){
        System.out.println("test");
    }
}

class Child extends User2{
    public void test2(){
        System.out.println("test2");
    }
}