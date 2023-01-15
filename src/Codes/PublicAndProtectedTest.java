package Codes;

public class PublicAndProtectedTest extends rightspackage.RightTest {
    public static void main(String[] args) {
        rightspackage.RightTest publicTest = new rightspackage.RightTest();
        publicTest.age = 1;
//        publicTest.sex = true; error
        PublicAndProtectedTest publicAndProtectedTest = new PublicAndProtectedTest();
        publicAndProtectedTest.sex = true;

    }
}
