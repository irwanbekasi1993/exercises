package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class methodReferenceExercise {
    public static void main(String[] args) {
        //methodReference
        List<Integer> integers = Arrays.asList(1,12,433,5);
        Optional<Integer> max = integers.stream().reduce(Math::max);
        max.ifPresent(x-> System.out.println(x));
        max.ifPresent(System.out::println);

        //compareTo
        List<String> strings = Arrays.asList("how","to","do","in","java","dot","com");
        List<String> sorted = strings.stream().sorted((x,y)->x.compareTo(y)).collect(Collectors.toList());
        System.out.println(sorted);
        List<String> sortedAlt = strings.stream().sorted(String::compareTo).collect(Collectors.toList());
        System.out.println(sortedAlt);

        //classNew
        List<Integer> ints = IntStream.range(1,100).boxed().collect(Collectors.toCollection(ArrayList::new));
        Optional<Integer> maxs = ints.stream().reduce(Math::max);
        maxs.ifPresent(System.out::println);

    }
}
