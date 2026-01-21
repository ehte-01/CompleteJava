package Multithreading.Methods;

public class Interrupt extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Thread is running....");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Interrupt I= new Interrupt();
        I.start();
        I.interrupt();

    }
}
