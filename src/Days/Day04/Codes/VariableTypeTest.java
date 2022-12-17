package Days.Day04.Codes;

public class VariableTypeTest {
    public static void main(String[] args) {
        byte b1 = 2;
        int i1 = 12;
        // java: incompatible types: possible lossy conversion from int to byte
        // i1 + b1's type is int
        byte res1 = i1 + b1;


        int res2 = i1 + b1;

        // float range larger than long
        float res3 = i1 + b1;

    }
}
