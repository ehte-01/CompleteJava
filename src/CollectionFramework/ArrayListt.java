package CollectionFramework;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayListt {

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>(11);
        list.add(1);
        list.add(5);
        list.add(80);
        list.add(80);
        list.add(80);
        list.add(80);
        list.add(80);
        list.add(80);
        list.add(80);
        list.add(80);
        list.add(80);
        list.set(2,50);
        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);list.remove(2);
        list.remove(2);


        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0));



        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        Object[] elementData = (Object[]) field.get(list);
        System.out.println("ArrayList capacity: " + elementData.length);

        list.add(1);


        elementData = (Object[]) field.get(list);
        System.out.println("ArrayList capacity: " + elementData.length);

        list.trimToSize();

        elementData = (Object[]) field.get(list);
        System.out.println("ArrayList capacity: " + elementData.length);

    }
}
