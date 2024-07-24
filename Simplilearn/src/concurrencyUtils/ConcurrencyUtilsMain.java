package concurrencyUtils;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrencyUtilsMain {

    // Doing multiple things at the same time
    public static void main(String[] args) {

        System.out.println("Concurrency Introduction");
        executorInvoke();
        executorServiceInvoke();

        // Future Example
        FutureDemo futureDemo = new FutureDemo();
        futureDemo.demonstrateFuture();


    }

    private static void executorInvoke() {
        Executor executor = new Caller();
        executor.execute(() -> {
            System.out.println("Executor Invoke Example");
        });
    }

    private static void executorServiceInvoke() {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(() -> {
            System.out.println("Executor Service Example");
        });

    }
}
