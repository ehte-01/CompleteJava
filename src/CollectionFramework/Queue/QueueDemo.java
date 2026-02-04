package CollectionFramework.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {

    static void main() {

//        LinkedList<Integer>  list = new LinkedList<>();
//        list.addFirst(3);
//        list.addFirst(2);
//        list.addFirst(25);
//        list.addLast(1);
//        list.removeFirst();
//        System.out.println(list);
//        Integer i = list.removeFirst();
//        System.out.println(list);
//        list.getFirst();
//        System.out.println(list);

        Queue<Integer> list = new LinkedList<>();
        list.add(1); // enqueue
        list.add(2); // enqueue
        list.add(3); // enqueue
        System.out.println(list);
        Integer i = list.remove(); // dequeue
        System.out.println(list);
        list.peek(); // peek
        System.out.println(list);

        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(1);
        queue1.add(2);
        System.out.println(queue1.size());

        System.out.println(queue1.element()); // throws exception if empty
        System.out.println(queue1.peek());

        System.out.println(queue1.remove()); // throws exception if empty
        System.out.println(queue1.poll());

        Queue<Integer> queue2 = new ArrayBlockingQueue<>(2);
        System.out.println(queue2.add(1));
        System.out.println(queue2.offer(2));
        System.out.println(queue2.offer(3));

    }
}
