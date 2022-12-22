package Days.Day06.Codes;

public class ProcessControlTest {
    public static void main(String[] args) {
        int m = 1;
        if (m > 0){
            System.out.println(1);
        }
        else if(m < 0){
            System.out.println(2);
        }
        else {
            System.out.println(3);
        }

        switch (m){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println(0);
                break;
        }
            // init    condition alter
        int res = 0;
        for (int i =1; i <= 100; i++){
            // body
            if (i % 2 == 0){
                System.out.println(i);
                res += i;
            }
        }
        System.out.println(res);

        int i = 0;
        while(i< 1000){
            System.out.println(i++);
        }
    }


}
