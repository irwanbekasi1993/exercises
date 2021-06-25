package exercises;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class regexPredicateExercise {
    public static void main(String[] args) {
        //regexPredicate
        Predicate<String> emailFilter = Pattern.compile("^(.+)@example.com").asPredicate();
        List<String> emails = Arrays.asList("alex@example.com","bob@yahoo.com","cat@google.com","david@example.com");
        List<String> desiredEmails = emails.stream().filter(emailFilter).collect(Collectors.<String>toList());
        desiredEmails.forEach(System.out::println);



    }
}
