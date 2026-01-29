package CollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListFunctions {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        System.out.println(list.getClass().getName());

        List<String> list1 = Arrays.asList("Monday", "Tuesday");
        System.out.println(list1.getClass().getName());
        list1.set(1,"Wednesday");
        System.out.println(list1.get(1));

        String[] array = {"Apple","Banana","Cherry"};
        List<String> list2 = Arrays.asList(array);
        System.out.println(list2.getClass().getName());

        List<String> list4 = new ArrayList<>(list2);
        list4.add("Mango");
        System.out.println(list4);

        List<Integer> list5 = new ArrayList<>();
        list5.add(4);
        list5.add(1);
        list5.add(2);
        list5.add(3);
        List<Integer> list3 = List.of(4,5,6,7,8);
        list5.addAll(list3);
        Collections.sort(list5);
        System.out.println(list5);

        List<String> words = Arrays.asList("banana","apple","date");
        words.sort(null);
        System.out.println(words);

    }
}
