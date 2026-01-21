package Multithreading.ThreadCreation;

public class CreatingThreadTest1 {
    public static void main(String[] args) {

        CreatingThread1 world=new CreatingThread1();
        world.start();

        for( ; ; ){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
