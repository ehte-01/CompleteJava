package CollectionFramework.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    static void main(String[] args) {
        // feature introduced in Java 8
        // process collections of data in a functional and declarative manner
        // Simplify Data Processing
        // Embrace Functional Programming
        // Improve Readability and Maintainability
        // Enable Easy Parrallelism

        // What is stream?
        // a sequence of elements supporting functional and declarative programming

        // How to use streams?
        // Source, intermediate operations & terminal operation

       List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        int count = 0;
//        for(int i: numbers){
//            if (i % 2 == 0){
//                count++;
//            }
//        }
//        System.out.println(count);
        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count());

        // Creating Streams
        // 1. From Collections
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = list.stream();
        // 2. From Arrays
        String[] arrays = {"A","B","C"};
        Stream<String> stream1 = Arrays.stream(arrays);
        // 3. Using Stream.of()
        Stream<String> stream2 = Stream.of("A","B");
        // 4. Infinite streams
        Stream<Integer> generate = Stream.generate(() ->1);
        Stream.iterate(1,x -> x+1);
    }
}
