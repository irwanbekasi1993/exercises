package exercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ForeachExercise {

    public static void main(String[] args) {

        List<String> names= Arrays.asList("Alex","Brian","Charles");

        //iterateOverList
        names.forEach(System.out::println);

        //iterateOverConsumer
        Consumer<String> makeUpperCase = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.toUpperCase());
            }
        };

        names.forEach(makeUpperCase);

        //iterateOverMap

        Map<String,String> map = new HashMap<>();

        map.put("A","Alex");
        map.put("B","Brian");
        map.put("C","Charles");

        map.forEach((k,v)-> System.out.println("key="+k+","+"value="+v));

        //iterateBiConsumer

        BiConsumer<String,Integer> action = (a,b)->{
            System.out.println("key is: "+a);
            System.out.println("value is: "+b);
        };

        Map<String,Integer> intMap = new HashMap<>();

        intMap.put("A",1);
        intMap.put("B",2);
        intMap.put("C",3);

        intMap.forEach(action);

        // iterateForeachAndForeachOrdered

        List<Integer> numberList = Arrays.asList(1,2,3,4,5);

        Consumer<Integer> intCustomer = System.out::println;

        numberList.stream().filter(x->x%2==0).forEach(intCustomer);

        numberList.stream().filter(x->x%2==0).parallel().forEachOrdered(intCustomer);

    }
}
