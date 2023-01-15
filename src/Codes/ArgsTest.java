package Codes;

public class ArgsTest {
    public static void main(String[] args) {
        new ArgsTest().show(1, "syb","liuyuan");
    }
    public void show(int i, String ... strs){
        System.out.println(strs.length);
    }
}
