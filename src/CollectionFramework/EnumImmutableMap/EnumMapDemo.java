package CollectionFramework.EnumImmutableMap;

import java.util.Map;
import java.util.EnumMap;


public class EnumMapDemo {
    public static void main(String[] args) {
        // array of size same as enum
        // [_,"Gym",_,_,_,_,_]
        // no hashing
        // Faster than hashmap
        // memory efficient
        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.TUESDAY,"Gym");
        map.put(Day.MONDAY,"Walk");
        String s = map.get(Day.TUESDAY);
        System.out.println(map);
    }
}

enum Day {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
