package exercises.predicates;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeePredicates {

    public static Predicate<Employee> isAdultMale(){
        return x->x.getAge()>21 && x.getGender().equalsIgnoreCase("M");
    }

    public static Predicate<Employee> isAdultFemale(){
        return x->x.getAge()>21 && x.getGender().equalsIgnoreCase("F");
    }

    public static Predicate<Employee> isAgeMoreThan(Integer age){
        return x->x.getAge()>age;
    }

    public static List<Employee> filterEmployees(List<Employee> employees, Predicate<Employee> predicate){
        return employees.stream().filter(predicate).collect(Collectors.<Employee>toList());
    }

}
