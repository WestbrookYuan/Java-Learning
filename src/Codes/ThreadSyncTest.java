package Codes;

public class ThreadSyncTest {
    public static void main(String[] args) {
        Num num = new Num();
        User1 user1 = new User1(num);
        user1.start();

        Bank bank = new Bank(num);
        bank.start();
    }

}
class Num {

}
class User1 extends Thread{
    private Num num;
    public User1(Num num){
        this.num = num;
    }
    @Override
    public void run() {
        synchronized (num){
            System.out.println("num1, bank is close");
            try {
                num.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("my turn");
        }

    }
}


class Bank extends Thread{
    private Num num;
    public Bank(Num num){
        this.num = num;
    }

    @Override
    public void run() {
        synchronized (num){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("9.kaimen");
            num.notifyAll();
        }
    }


}
