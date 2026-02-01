package CollectionFramework.LRUCache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheDemo <K,V> extends LinkedHashMap<K,V> {

    private int capacity;

    public LRUCacheDemo(int capacity){
        super(capacity,0.75f, true);
        this.capacity = capacity;
    }


    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCacheDemo<String, Integer> studentMap = new LRUCacheDemo<>(3);
        studentMap.put("Bob",99);
        studentMap.put("Alice",80);
        studentMap.put("Ram",91);
        studentMap.get("Bob");
        studentMap.put("Vipul",89);

        System.out.println(studentMap);

    }
}
