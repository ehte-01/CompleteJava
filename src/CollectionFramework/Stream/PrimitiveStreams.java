package CollectionFramework.Stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PrimitiveStreams {
    static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(numbers);

        System.out.println(IntStream.range(1, 5).boxed().collect(Collectors.toList()));
        System.out.println(IntStream.rangeClosed(1, 5).boxed().collect(Collectors.toList()));

        IntStream.of(1, 2, 3);

        DoubleStream doubleStream = new Random().doubles(5);
        // System.out.println(doubleStream.sum());
//        System.out.println(doubleStream.average());
//        System.out.println(doubleStream.max());
//        System.out.println(doubleStream.min());
//        System.out.println(doubleStream.summaryStatistics());
//        System.out.println(doubleStream.boxed().toList());
//        System.out.println(doubleStream.mapToInt(x -> (int) x + 1));
        System.out.println(doubleStream.boxed().toList());

        IntStream intStream1 = new Random().ints(5);
        System.out.println(intStream1.boxed().toList());

    }
}
