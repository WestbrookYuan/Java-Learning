package Codes;

public class Circle {
    public static void main(String[] args) {
        System.out.println(new Circle().sum(100));
        System.out.println(new Circle().fib(5));
    }
    public int sum(int i){
        if(i == 1){
            return 1;
        }
        else {
            return sum(i-1) + i;
        }
    }

    public int fib(int n){
        if(n <=2){
            return 1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }
}
