package CollectionFramework.Set;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {
        // Thread-Safe
        // Copy-On-Write Mechanism
        // No Duplicate Elements
        // Iterators Do not reflect modifications

        CopyOnWriteArraySet<Integer> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

        for(int i=0;i<5;i++){
            copyOnWriteArraySet.add(i);
            concurrentSkipListSet.add(i);
        }

        System.out.println("Initial CopyOnWriteArraySet: " + copyOnWriteArraySet);
        System.out.println("Initial ConcurrentSkipListSet: " +concurrentSkipListSet);

        System.out.println("\nIterating and modifying concurrentSkipListSet: ");
        for(Integer num: concurrentSkipListSet){
            System.out.println("Reading from concurrentSkipListSet: " + num);
            // Attempting to modify the set during iteration
            if (num == 5){
                concurrentSkipListSet.add(6);
            }
        }

    }
}
