package Codes;

public class ThreadSafetyTest {
    public static void main(String[] args) throws InterruptedException {
        User7 user = new User7();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                user.name = "sb";
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(user.name);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                user.name = "lisi";
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(user.name);
            }
        });
        thread1.start();
        thread2.start();
        System.out.println("main finished");

    }
}

class User7{
    public String name;

}