package Codes;

public class Thread02Test {
    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(3000);
        Mythread1 thread1 = new Mythread1();
        Mythread2 thread2 = new Mythread2();
        thread1.start();
        thread2.start();
        System.out.println(Thread.currentThread().getName());

        thread1.join();
        thread2.join();
    }
}

class Mythread1 extends Thread{
    @Override
    public void run() {
        System.out.println("My thread1: " + Thread.currentThread().getName());
    }
}

class Mythread2 extends Thread{
    @Override
    public void run() {
        System.out.println("My thread2: " + Thread.currentThread().getName());
    }
}