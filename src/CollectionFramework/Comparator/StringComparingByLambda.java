package CollectionFramework.Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringComparingByLambda {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("banana","apple","date");
        words.sort((a,b)->a.length() - b.length() );
        System.out.println(words);

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);

        list.sort((a,b) -> a-b);
        System.out.println(list);



    }
}
