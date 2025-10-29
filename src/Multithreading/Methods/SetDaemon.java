package Multithreading.Methods;

public class SetDaemon extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("Hello World!!");
        }
    }

    public static void main(String[] args) {
        SetDaemon SD=new SetDaemon();
        SD.setDaemon(true);
        SetDaemon S=new SetDaemon();
        SD.start();
        System.out.println("Main done");
    }
}
