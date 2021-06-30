package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExercise {
    public static void main(String[] args) {
        //streamOf
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(x-> System.out.println(x));

        //streamOfArray
        Stream<Integer> streamArr = Stream.of(new Integer[]{1,2,3,4,5,6,7,8,9});
        streamArr.forEach(x-> System.out.println(x));

        //listStream
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<10;i++){
            list.add(i);
        }

        Stream<Integer> intListStream = list.stream();
        intListStream.forEach(x-> System.out.println(x));

        //streamGenerateAndStreamIterate
        Stream<Integer> randomNumbers = Stream.generate(()->(new Random().nextInt(100)));

        randomNumbers.limit(20).forEach(System.out::println);

        //streamChars
        IntStream intStream = "12345_abcde".chars();
        intStream.forEach(x-> System.out.println(x));

        Stream<String> strStream = Stream.of("A$B$C".split("\\$"));
        strStream.forEach(x-> System.out.println(x));

        //streamCollectorsThorughList

        Stream<Integer> intListOfStream = list.stream();
        List<Integer> evenNumberList = intListOfStream.filter(p->p%2==0).collect(Collectors.toList());
        System.out.println(evenNumberList);

        //streamCollectorsThorughArray
        Stream<Integer> intListOfArray = list.stream();
        Integer[] evenNumberArray = intListOfArray.filter(p->p%2==0).toArray(Integer[]::new);
        System.out.println(evenNumberArray[0]);

        //streamOperations
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        memberNames.stream().filter((x)->x.startsWith("A")).forEach(System.out::println);
        memberNames.stream().filter((x)->x.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
        memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);

        memberNames.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(memberNames);

        boolean anyMatchedResult = memberNames.stream().anyMatch((x)-> x.startsWith("A"));
        System.out.println(anyMatchedResult);
        boolean allMatchedResult = memberNames.stream().allMatch((x)-> x.startsWith("A"));
        System.out.println(allMatchedResult);
        boolean noneMatchedResult = memberNames.stream().noneMatch((x)-> x.startsWith("A"));
        System.out.println(noneMatchedResult);

        long totalMatched = memberNames.stream().filter((x)-> x.startsWith("A")).count();
        System.out.println(totalMatched);

        Optional<String> reduced = memberNames.stream().reduce((x,y)->x+"#"+y);
        reduced.ifPresent(System.out::println);

        String findFirstName = memberNames.stream().filter((x)->x.startsWith("L")).findFirst().get();
        System.out.println(findFirstName);

        Stream<Integer> streamOfParalel = list.parallelStream();
        evenNumberArray = streamOfParalel.filter((p)->p%2==0).toArray(Integer[]::new);
        System.out.println(evenNumberArray[0]);



    }
}
