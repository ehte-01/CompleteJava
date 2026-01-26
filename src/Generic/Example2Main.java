package Generic;

public class Example2Main {
    public static void main(String[] args) {
        Example2<String , Integer> pair =new Example2<>("Age" , 30);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }
}
