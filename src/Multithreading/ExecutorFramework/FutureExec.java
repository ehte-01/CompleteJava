package Multithreading.ExecutorFramework;

import java.util.concurrent.*;

public class FutureExec {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<?> future = executorService.submit( () -> System.out.println("Hello"));
        future.get();
        executorService.shutdown();
    }
}
