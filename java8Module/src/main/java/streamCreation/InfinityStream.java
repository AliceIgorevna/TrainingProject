package streamCreation;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Alisa_Demennikova on 9/19/2016.
 */
public class InfinityStream {
    public static void main(String[] args) {
        Stream<Integer> iterateStream = Stream.iterate(1, n -> n + 2);
        Stream<String> generateStream = Stream.generate(() -> "_a1");
        System.out.println("IterateStream = " + iterateStream.limit(5).collect(Collectors.toList()));
        System.out.println("GemerateStream = " + generateStream.limit(5).collect(Collectors.toList()));
    }
}
