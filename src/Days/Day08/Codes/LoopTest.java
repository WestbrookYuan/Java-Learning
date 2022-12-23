package Days.Day08.Codes;

import java.util.Scanner;

public class LoopTest {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while(true){
//            if(!scanner.hasNextInt()){
//                break;
//            }
//            int temp = scanner.nextInt();
//            System.out.println(temp);
//        }

        for (int i=0; i < 5; i++){
            for(int j=0; j< 5; j++){
                System.out.println(i*j);
            }
        }

        for (int i=0; i < 5;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1;i <= 100;i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }

    }

    public static boolean isPrime(int num){
        boolean isPrime = true;
        for(int j = 2;j < num; j++){
            if(num % j == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
