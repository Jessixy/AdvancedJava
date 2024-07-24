package concurrencyUtils;

import java.util.concurrent.*;

public class FutureDemo {

    public void  demonstrateFuture () {
        ExecutorService executorService = null;
        Future<String> future = null;
        executorService = Executors.newSingleThreadExecutor();

        try {


            future = executorService.submit(() -> {
                Thread.sleep(10000);
                return "Completed";
            });

            while (!future.isDone()) {
                System.out.println("Task still in progress...wait");
                Thread.sleep(500);
            }

            System.out.println("Task completed");
            String result = future.get(3000, TimeUnit.MICROSECONDS);
            System.out.println(result);
        } catch (InterruptedException | TimeoutException  | ExecutionException exception ) {

            future.cancel(true);
            future.isDone();
            future.isCancelled();
        }


    }
}
