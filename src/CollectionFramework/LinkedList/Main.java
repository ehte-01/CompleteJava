package CollectionFramework.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);
        linkedlist.addLast(4);
        linkedlist.addFirst(0);
        System.out.println(linkedlist);
        linkedlist.get(4);
        System.out.println(linkedlist);
        linkedlist.getFirst();
        System.out.println(linkedlist);
        linkedlist.getLast();
        System.out.println(linkedlist);
        linkedlist.removeIf(x -> x % 2 == 0);
        System.out.println(linkedlist);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat","Dog","Elephant"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog","Elephant"));
        animals.removeAll(animalsToRemove);
        System.out.println(animals);

    }
}
