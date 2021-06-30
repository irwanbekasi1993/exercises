package exercises;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class JoinStreamExercise {
    public static void main(String[] args) {
        convertListToString(Arrays.asList("how","to","do","in","java"));
        convertArrToString(new String[]{"how","to","do","in","java"});
        StringJoiner joiner = new StringJoiner(",","[","]");
        joiner.add("how").add("to").add("do").add("in").add("java");
        collectorsJoining(Arrays.asList("how","to","do","in","java"));
    }
    static void convertListToString(List<String> input){
        String joinedString = String.join(",",input);
        System.out.println(joinedString);
    }
    static void convertArrToString(String[] input){
        String joinedString = String.join(",",input);
        System.out.println(joinedString);
    }
    static void collectorsJoining(List<String> input){
        String joinedString = input.stream().collect(Collectors.joining(",","[","]"));
        System.out.println(joinedString);
    }
}
