package Codes;

public class ThreadTest {
    public static void main(String[] args) {


        Mythread thread = new Mythread();
        thread.start();
        System.out.println(Thread.currentThread().getName());
    }
}

class Mythread extends Thread{
    @Override
    public void run() {
        System.out.println("My thread: " + Thread.currentThread().getName());
    }
}