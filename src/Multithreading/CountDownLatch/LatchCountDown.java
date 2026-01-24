package Multithreading.CountDownLatch;

import java.util.concurrent.*;

public class LatchCountDown {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int numberofServices = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(numberofServices);
        CountDownLatch latch = new CountDownLatch(numberofServices);
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        latch.await();

        System.out.println("Main");
        executorService.shutdown();
    }

    static class DependentService implements Callable<String> {

        private final CountDownLatch latch;

        public DependentService(CountDownLatch latch){
            this.latch = latch;
        }

        @Override
        public String call() throws Exception {
            try{
                System.out.println(Thread.currentThread().getName() + " service started.");
            }finally {
                latch.countDown();
            }
            return "ok";
        }

    }
}
