package CollectionFramework.Queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // part of the queue interface
        // orders elements based on their natural ordering ( for primitives lowest first)
        // custom comparator for customized ordering
        // does not allow null elements
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(15);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        System.out.println(pq);
        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }
        System.out.println(pq.peek());

        // internal working
        // PriorityQueue is impemented as a min-heap by default (for natural ordering)

    }
}
