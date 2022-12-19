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
        System.out.println();
        // %
        int n = 135;
        while(n!=0){
            System.out.println(n % 10);
            // /=
            n /= 10;
        }
        System.out.println();
        // =
        int j1;
        int j2;
        j1 = j2 = 10;
        j2 = 20;

        j1 += (j1++) + (++j1);
        System.out.println(j1);

        System.out.println();
        // ==
        int i = 10;
        int j = 20;
        System.out.println(i == j);
        System.out.println(i = j);



        // && &
        boolean b1 = false;
        int nums1 = 10;
        System.out.println(b1 & nums1 > 0);
        System.out.println(b1 && nums1 > 0);
        System.out.println();

        // >> << >>>
        System.out.println(3 << 2);
        System.out.println(3 >> 1);
        System.out.println(3 >>> 1);
        System.out.println(21 << 27);
        System.out.println(6 & 3);
        System.out.println(6 | 3);
        System.out.println(6 ^ 5);
        System.out.println(~6);

        int num3 = 10;
        int num4 = 20;
        // 1
        int temp = num3;
        num3 = num4;
        num4 = temp;
        System.out.println(num3);
        System.out.println(num4);
        System.out.println();
        // 2
        // no temp
        // overflow and limited(only integers)
        num3 = num4 + num3;
        num4 = num3 - num4;
        num3 = num3 - num4;
        System.out.println(num3);
        System.out.println(num4);
        System.out.println();
        // 3
        // Bitwise Operators
        num3 = (num3 ^ num4);
        num4 = num3 ^ num4;
        num3 = num3 ^ num4;
        System.out.println(num3);
        System.out.println(num4);


        String sb = 1<0? "yty":"syb";
        System.out.println(sb);
    }
}
