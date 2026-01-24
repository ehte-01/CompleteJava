package Multithreading.CyclicBarrier;

import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierr {

    public static void main(String[] args) {

        int numberofServices = 3;
        ExecutorService executorservice = Executors.newFixedThreadPool(numberofServices);
        CyclicBarrier barrier = new CyclicBarrier(numberofServices);
        executorservice.submit(new DependentService(barrier));
        executorservice.submit(new DependentService(barrier));
        executorservice.submit(new DependentService(barrier));
        System.out.println("Main");
        executorservice.shutdown();

    }
}

class DependentService implements Callable<String> {

    private final CyclicBarrier barrier;

    public DependentService(CyclicBarrier barrier) {
        this.barrier = barrier ;
    }

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " service started.");
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " is waiting at the barrier.");
        barrier.await();
        return "ok";
    }
}
