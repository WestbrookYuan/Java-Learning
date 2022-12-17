package Days.Day04.Codes;

public class VariableTypeTest {
    public static void main(String[] args) {
        byte b1 = 2;
        int i1 = 12;
        // java: incompatible types: possible lossy conversion from int to byte
        // i1 + b1's type is int
        // byte res1 = i1 + b1;
        int res2 = i1 + b1;

        // float range larger than long
        float res3 = i1 + b1;

        short s1 = 133;
        double d1 = s1;
        System.out.println(d1);

        char c1 = 'a';
        int i3 = 10;
        int i4  = c1 + i3;

        System.out.println(i4);

        short s2 = 10;

        // all int case
        short s3 = 10 + c1;
        char s = c1 + b1;

        byte b2 = 10;
        byte b3 = b1 + b2;
    }
}
