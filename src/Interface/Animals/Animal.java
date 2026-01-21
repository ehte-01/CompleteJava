package Interface.Animals;

public interface Animal {

    public static final int MAX_AGE=150;

    public abstract void eat();
    void sleep();
    public static void info(){
        System.out.println("This is an animal interface.");
    }
    public default void run(){
        this.eat();
        System.out.println("Animal is running");
    }
}
