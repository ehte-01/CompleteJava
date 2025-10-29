package Multithreading.ThreadCreation;

public class CreatingThread1 extends Thread {
    @Override
    public void run() {
        for( ; ; ) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
