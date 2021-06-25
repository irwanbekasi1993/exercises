package exercises.predicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestEmployeePredicates {

    public static void main(String[] args) {
        Employee e1 = new Employee(1,23,"M","Rick","Beethoven");
        Employee e2 = new Employee(2,23,"F","Martina","Hengis");
        Employee e3 = new Employee(3,23,"M","Ricky","Martin");
        Employee e4 = new Employee(4,23,"M","Jon","Lowman");
        Employee e5 = new Employee(5,23,"F","Christine","Maria");
        Employee e6 = new Employee(6,23,"M","David","Freezor");
        Employee e7 = new Employee(7,23,"F","Melissa","Roy");
        Employee e8 = new Employee(8,23,"M","Alex","Gussin");
        Employee e9 = new Employee(9,23,"F","Neetu","Singh");
        Employee e10 = new Employee(10,23,"M","Naveen","Jain");

        List<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(new Employee[]{e1,e2,e3,e4,e5,e6,e7,e8,e9,e10}));

        System.out.println(EmployeePredicates.filterEmployees(employees, EmployeePredicates.isAdultMale()));
        System.out.println(EmployeePredicates.filterEmployees(employees, EmployeePredicates.isAdultFemale()));
        System.out.println(EmployeePredicates.filterEmployees(employees, EmployeePredicates.isAgeMoreThan(35)));
        System.out.println(EmployeePredicates.filterEmployees(employees, EmployeePredicates.isAgeMoreThan(35).negate()));

        employees.sort(Comparator.comparing(x->x.getFirstName()));
        employees.sort(Comparator.comparing(Employee::getFirstName));
        System.out.println(employees);

        Comparator<Employee> comparator = Comparator.comparing(x->x.getFirstName());
        employees.sort(comparator.reversed());
        System.out.println(employees);

        employees.sort(Comparator.comparing(x->x.getLastName()));
        employees.sort(Comparator.comparing(Employee::getLastName));
        System.out.println(employees);

        Comparator<Employee> groupByComparator = Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName);
        employees.sort(groupByComparator);
        System.out.println(employees);

        Employee[]empArr = employees.toArray(new Employee[employees.size()]);
        Arrays.parallelSort(empArr,groupByComparator);
        System.out.println(empArr[0]);

    }

}
