package streamCreation;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Alisa_Demennikova on 9/19/2016.
 */
public class StreamFromValues {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("qwerty", "wertyu", "ertyui", "rtyuio");
        System.out.println("streamFromValues = " + stream.collect(Collectors.toList()));
    }
}
