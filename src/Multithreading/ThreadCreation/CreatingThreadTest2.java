package Multithreading.ThreadCreation;

public class CreatingThreadTest2 {

    public static void main(String[] args) {

        CreatingThread2 w = new CreatingThread2();
        Thread t1 = new Thread(w);
        t1.start();

        for (; ; ) {
            System.out.println("Thread.currentThread().getName()");
        }

    }
}
