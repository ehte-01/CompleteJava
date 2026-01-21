package Multithreading.Methods;

public class Yield extends Thread{

    public Yield(String name){
        super(name);
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println(Thread.currentThread().getName()+ " is running");
            Thread.yield();
        }
    }

    public static void main(String[] args)  {
        Yield Y1=new Yield("Y1");
        Yield Y2=new Yield("Y2");
        Y1.start();
        Y2.start();
    }
}
