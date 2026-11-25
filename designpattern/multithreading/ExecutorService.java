package multithreading;

import java.util.concurrent.Executors;

public class ExecutorService {

    public static void main(String[] args) {
        var executorService = Executors.newFixedThreadPool(10);
        for (int i = 1; i <= 5; i++) {
            executorService.submit(() -> {
                System.out.println(
                        Thread.currentThread().getName()
                );
            });
        }
        executorService.shutdown();

    }
}
