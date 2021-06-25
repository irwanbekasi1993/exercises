package exercises;

import java.util.Optional;

public class optionalExercise {
    public static void main(String[] args) {
        //optionalObjects
        Optional<Integer> possible1 = Optional.empty();
        Optional<Integer> possible2 = Optional.of(100);

        //ifOptional
        possible2.ifPresent(System.out::println);


    }
}
