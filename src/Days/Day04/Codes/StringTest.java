package Days.Day04.Codes;

public class StringTest {
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(str);
        int number = 1001;
        String numberstr = "id: ";
        String info = numberstr + number;
        System.out.println(info); // id: 1001
        boolean ye = true;
        System.out.println(info + ye);


        //practise1:
        char c = 'a';
        int num = 10;
        String s = "hello";
        System.out.println(c+num+s); //97 + 10 + 'hello'
        System.out.println(c+s+num);// a + 'hello' + 10
        System.out.println(c+num+s); //10 + 97 + 'hello'

        //practise2:
        System.out.println("*\t*");
        System.out.println('*' + '\t' + '*');
        System.out.println('*' + "\t" + '*');
        System.out.println('*' + '\t' + "*");
        System.out.println('*' + ('\t' + "*"));


        // try:
        System.out.println(123+"");
    }
}
