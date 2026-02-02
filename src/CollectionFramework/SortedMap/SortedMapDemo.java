package CollectionFramework.SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {

    public static void main(String[] args) {

        SortedMap<Integer,String> map = new TreeMap<>((a,b) -> b - a);
        map.put(91,"Vivek");
        map.put(99, "Shubham");
        map.put(78,"Mohit");
        map.put(77, "Vipul");
        System.out.println(map);
        map.get(77);
        map.containsKey(78);
        map.containsValue(77);

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap(91));
        System.out.println(map.tailMap(91));
        System.out.println(map.subMap(99,78));

    }

}
