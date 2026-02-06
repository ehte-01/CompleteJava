package CollectionFramework.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Java8Demo {
    public static void main(String[] args) {
        // Streams

        // Java 8 --> minimal code , functional programming
        // Java 8 --> lambda expression, Streams, Date and Time API

        // lambda expression
        // lambda expression is an anonymous function ( no name, no return type, no access modifier )

        Thread t1 = new Thread(() -> {
            System.out.println("Hello");
        });

        MathOperaration sumOperation = (a,b) -> a+b;
        MathOperaration subOperation = (a,b) -> a-b;
        int res = sumOperation.operate(1,2);
        System.out.println(res);

        // Predicate --> Functional interface ( Boolean valued function )
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4));
        Predicate<String> isWordStartingWithA = x -> x.toLowerCase().startsWith("a");
        Predicate<String> isWordEndingWithT = x -> x.toLowerCase().endsWith("t");
        Predicate<String> and = isWordStartingWithA.and(isWordEndingWithT);
        System.out.println(and.test("Ankit"));

        // Function --> work for you
        Function<Integer, Integer> doubleIt = x -> 2 * x;
        Function<Integer, Integer> tripleIt = x -> 3 * x;
        System.out.println(doubleIt.andThen(tripleIt).apply(20));
        System.out.println(tripleIt.andThen(doubleIt).apply(20));
        System.out.println(doubleIt.compose(tripleIt).apply(20));
        System.out.println(doubleIt.apply(100));

        Function<Integer, Integer> identity = Function.identity();
        Integer res2 = identity.apply(10);
        System.out.println(res2);

        // Consumer
        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(51);
        List<Integer> list = Arrays.asList(1,2,3);
        Consumer<List<Integer>> printList = x -> {
            for( int i : x ){
                System.out.println(i);
            }
        };
        printList.accept(list);

        // Supplier
        Supplier<String> giveHelloWorld = () -> "Hello World!";
        System.out.println(giveHelloWorld.get());
    }
}

interface MathOperaration {
    int operate(int a, int b);
}