package Generic;

public class GenericExample1Main {

    public static void main(String[] args) {
        GenericExample1<Integer> box= new GenericExample1<>();
        box.setValue(1);
        int i = box.getValue();
        System.out.println(i);
    }
}
