package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListVsAsList {

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

        List<Integer> list3 = List.of(1,2,3,4);
        list3.set(1,33);
    }
}
