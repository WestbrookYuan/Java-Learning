package Codes;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newScheduledThreadPool(3);
        for (int i=0;i<5;i++){
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }

    }
}
