package Codes;

public class ThreadRunTest {
    public static void main(String[] args) {
//        MyThread3 thread3 = new MyThread3();
//        thread3.start();
//
//        MyThread4 thread4 = new MyThread4();
//        thread4.start();
//        MyThread5 thread5 = new MyThread5("t5");
//        MyThread5 thread55 = new MyThread5("t55");
//        thread5.start();
//        thread55.start();

//        Thread thread6 = new Thread(() ->{
//            System.out.println("t 6");
//        });
//        thread6.start();

        Thread thread7 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t7");
            }
        });
        thread7.start();
        System.out.println("main finished");
    }
}

class MyThread3 extends Thread{
    @Override
    public void run() {
        System.out.println("3 finished");
    }
}

class MyThread4 extends Thread{
    @Override
    public void run() {
        System.out.println("4 finished");
    }
}

class MyThread5 extends Thread{
    private String name;
    public MyThread5(){}
    public MyThread5(String name){
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println( name+" finished");
    }
}