package streamCreation;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Alisa_Demennikova on 9/19/2016.
 */
public class StreamFromCollection {
    public static void main(String[] args) {
        Stream<String> stream = Arrays.asList("qwe", "wer", "ert", "rty").stream();
        System.out.println("StreamFromCollection = " + stream.collect(Collectors.toList()));
    }
}
