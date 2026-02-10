package String;

public class StringBufferDemo {
    public static void main(String[] args) throws InterruptedException {

        StringBuffer sb = new StringBuffer(); // thread safe
        Task1 t1 = new Task1(sb);
        Task1 t2 = new Task1(sb);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final length: " + sb.length());
    }
}

class Task1 extends Thread{
    private StringBuffer sb;

    public Task1(StringBuffer sb) {
        this.sb = sb;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++){
            sb.append("a");
        }
    }
}

