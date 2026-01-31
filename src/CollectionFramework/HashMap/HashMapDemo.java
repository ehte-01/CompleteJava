package CollectionFramework.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer , String> map = new HashMap<>();
        map.put(1,"Akshit");
        map.put(2,"Neha");
        map.put(3,"Shubham");
        System.out.println(map);

        String student = map.get(3);
        System.out.println(student);
        String s = map.get(67);
        System.out.println(s);

        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Shubham"));

        for(int i : map.keySet()) {
            System.out.println(map.get(i));
        }

        Set<Map.Entry<Integer , String >> entries = map.entrySet();

        for(Map.Entry<Integer , String> entry : entries){
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(map);

        map.remove(2);
        System.out.println(map);
    }
}
