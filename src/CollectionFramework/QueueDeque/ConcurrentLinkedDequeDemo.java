package CollectionFramework.QueueDeque;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeDemo {

    static void main(String[] args) {
        // non-blocking , thread-safe double ended queue
        // compare and swap
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        deque.add("Element1");
        deque.addFirst("Element0");
        deque.add("Element2");
        System.out.println(deque);

        String first = deque.removeFirst();
        System.out.println(first);
        String last = deque.removeLast();
        System.out.println(last);
    }
}
