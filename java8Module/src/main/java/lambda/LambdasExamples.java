package lambda;

import com.sun.corba.se.impl.orbutil.concurrent.Sync;

import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static net.sf.cglib.core.CollectionUtils.transform;

/**
 * Created by Alisa_Demennikova on 9/12/2016.
 */
public class LambdasExamples {
    private String name;
    private int age;

    public LambdasExamples(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

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
        List<Integer> collection = Arrays.asList(12, 11, 14, 10, 11, 6, 7, 8, 5);
        Integer sumOdd = collection.parallelStream().filter(o -> o % 2 != 0).reduce((s1, s2) -> s1 + s2).orElse(0);
        Integer sumNumGraterThanTen = collection.stream().filter(f -> f>10).distinct().reduce((a1, a2) -> a1 + a2).orElse(0);
        System.out.println(sumOdd);
        System.out.println(sumNumGraterThanTen);
        collection.forEach(System.out :: println);
        Integer sumAllElemsFromCollection = collection.stream().reduce((a1, a2) -> a1 + a2).orElse(0);

        List<String> strList = Arrays.asList("qweww", "wer", "ertqwe", "rty", "tyu");
        strList.stream().map(String :: toUpperCase).forEach(System.out :: println);
        List<String> upperList = strList.stream().map(String :: toUpperCase).collect(Collectors.toList());
        List<String> lessThanFourElemList = strList.stream().filter(s -> s.length()<4).collect(Collectors.toList());
        lessThanFourElemList.forEach(System.out :: println);
        System.out.println(ZoneId.getAvailableZoneIds());

        LambdasExamples example1 = new LambdasExamples("qwer", 23);
        LambdasExamples example2 = new LambdasExamples("wert", 45);
        LambdasExamples example3 = new LambdasExamples("erty", 17);
        LambdasExamples example4 = new LambdasExamples("rtyu", 16);
        List<LambdasExamples> lambdaList = Arrays.asList(example1, example2, example3, example4);
        LambdasExamples example = lambdaList.stream().max(Comparator.comparing(LambdasExamples :: getAge)).get();
        List<LambdasExamples> ageLessThan18 = lambdaList.stream().filter(p -> p.getAge()<18).collect(Collectors.toList());
        IntSummaryStatistics avgAge = lambdaList.stream().mapToInt(LambdasExamples :: getAge).summaryStatistics();
        lambdaList.stream().collect(Collectors.partitioningBy(p -> p.getAge() >= 18));
        System.out.println(lambdaList.stream().map(LambdasExamples :: getName).collect(Collectors.joining(", ", "Name: ", ".")));
}
}
