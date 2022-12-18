package Days.Day05.Codes;

public class OperatorTest {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        System.out.println("+:" + a + b);
        System.out.println("%:"+ a % b);
        double d = 2;
        double e = 1.5;
        System.out.println("/:" + d / e); // / 1.5
        System.out.println("// :" + (int)(d / e)); //  // 1.5
        System.out.println("%:" + d % e);
        System.out.println();

        // a++
        int a2 = 10;
        System.out.println("a2: "+ a2);
        int b2 = a2++;
        System.out.println("a2: " + a2 + " b2: "+b2);

        // ++a
        int a3 = 10;
        System.out.println("a3:" + a3);
        int b3 = ++a3;
        System.out.println("a3: " + a3 + " b3: "+b3);


    }
}
