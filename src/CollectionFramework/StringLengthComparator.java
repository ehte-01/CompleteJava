package CollectionFramework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class StringCompare implements Comparator<String> {

    public int compare(String o1, String o2){
        return o1.length()-o2.length();
    }
}

public class StringLengthComparator {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("banana","apple","date");
        words.sort(new StringCompare());
        System.out.println(words);
    }

}
