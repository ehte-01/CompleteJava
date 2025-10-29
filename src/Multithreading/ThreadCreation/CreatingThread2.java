package Multithreading.ThreadCreation;

public class CreatingThread2 implements Runnable {


    @Override
    public void run() {
        for(; ;){
            System.out.println("World");
        }
    }
}
