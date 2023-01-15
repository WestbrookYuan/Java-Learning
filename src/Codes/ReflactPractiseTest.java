package Codes;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflactPractiseTest {
    public static void main(String[] args) throws Exception {
        Class empClass = Emp.class;
        Constructor declaredConstructor = empClass.getDeclaredConstructor();
        Object emp = declaredConstructor.newInstance();
        Field account = empClass.getField("account");
        Field pwd = empClass.getField("pwd");
        account.set(emp, "zhangsan");
        pwd.set(emp, "zhangsan");
        Method isAdmin = empClass.getMethod("isAdmin");
        Object res = isAdmin.invoke(emp);
        System.out.println(res);

    }
}

class Emp{
    public String account;
    public String pwd;
    public boolean isAdmin(){
        if( account.equals("admin") && pwd.equals("admin")){
            return true;
        }
        else {
            return false;
        }

    }
}