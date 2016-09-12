package lambda;

import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Alisa_Demennikova on 9/12/2016.
 */
public class LambdasExamples {
    public static void main(String[] args) {
        List<String> nonSortedItems = Arrays.asList("Aaaaa", "Lllll", "Zzzzz", "Mmmm");

        //without lambdas
        Collections.sort(nonSortedItems, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

        //with lambdas
        Collections.sort(nonSortedItems, (String a, String b) -> b.compareTo(a));
        //or
        Collections.sort(nonSortedItems, (a, b) -> b.compareTo(a));

        //get sum of all odd numbers
        List<Integer> collection = new ArrayList<>();
        collection.add(12);
        collection.add(12);
        collection.add(12);
        collection.add(11);
        collection.add(2);
        collection.add(3);
        collection.add(8);
        Integer sumOdd = collection.parallelStream().filter(o -> o % 2 != 0).reduce((s1, s2) -> s1 + s2).orElse(0);
        Integer sumNumGraterThanTen = collection.stream().filter(f -> f>10).distinct().reduce((a1, a2) -> a1+a2).orElse(0);
        System.out.println(sumOdd);
        System.out.println(sumNumGraterThanTen);

        System.out.println(ZoneId.getAvailableZoneIds());
}
}
