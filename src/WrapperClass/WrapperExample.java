package WrapperClass;

public class WrapperExample {
    public static void main(String[] args) {
        Student x=new Student();
        x.id=1;
        fun(x);
        System.out.println(x.id);

    }

    private static void fun(Student a){
        a.id=2;
    }
}
class Student{
    public int id;
}
