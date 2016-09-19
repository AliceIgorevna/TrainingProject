package streamCreation;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Alisa_Demennikova on 9/19/2016.
 */
public class StreamFromBuilder {
    public static void main(String[] args) {
        Stream.Builder<String> builder = Stream.builder();
        Stream<String> stream = builder.add("qwe").add("wer").add("ert").build();
        System.out.println("StreamFromBuilder = " + stream.collect(Collectors.toList()));
    }
}
