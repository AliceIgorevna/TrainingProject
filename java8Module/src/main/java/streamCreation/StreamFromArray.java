package streamCreation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Alisa_Demennikova on 9/19/2016.
 */
public class StreamFromArray {
    public static void main(String[] args) {
        Stream<Integer> stream = Arrays.stream(new Integer[]{23, 12, 45, 1, 2, 5, 3, 8});
        System.out.println("StreamFromArray = " + stream.collect(Collectors.toList()));
    }
}
