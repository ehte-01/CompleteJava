package Enumeration;

public class newMain {

    public enum Months{
        JANUARY ,FEBRUARY, MARCH, APRIL, MAY , JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER ,NOVEMBER , DECEMBER ;
    }
    public static void main(String[] args) {

        Day day=Day.WEDNESDAY;

        String res = switch(day){
            case MONDAY -> "M";
            case TUESDAY -> "T";
            default -> "Weekend";
        };
        System.out.println(res);
        System.out.println(Months.AUGUST);
    }
}
