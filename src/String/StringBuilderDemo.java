package String;

public class StringBuilderDemo {

    public static void main(String[] args) throws InterruptedException {

        StringBuilder sb = new StringBuilder(); // not thread safe
        Task t1 = new Task(sb);
        Task t2 = new Task(sb);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final length: " + sb.length());
    }
}

        class Task extends Thread{
            private StringBuilder sb;

            public Task(StringBuilder sb) {
                this.sb = sb;
            }

            @Override
            public void run() {
                for(int i = 0; i < 1000; i++){
                    sb.append("a");
                }
            }
        }


        // sb.append("Hello");
        // sb.insert(1, "Java");
//        sb.replace(1, 3, "World");
//        sb.delete(1, 4);
//        sb.reverse();
//        sb.charAt(0);
//        sb.length();
//        sb.substring(1, 4);

        // char array (16) capacity
        // mutable
        // method chaining

        // System.out.println(sb.append("2").replace(1, 2, "ok").reverse());
