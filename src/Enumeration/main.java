package Enumeration;

public class main {
    public static void main(String[] args) {
        Day monday=Day.MONDAY;
        int ordinal=monday.ordinal();
        System.out.println(ordinal);
        System.out.println(monday.name());
        Day enumDay= Day.valueOf("MONDAY");
        System.out.println(enumDay);
        System.out.println(monday.getLower());
        System.out.println(monday.getHindi());

    }
}
