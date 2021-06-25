package exercises.streamAPIExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CustomerDTOTest {
    public static void main(String[] args) {
        Set<Customer> customers = new HashSet<>();
        customers.add(new Customer(100,"c1","c1"));
        customers.add(new Customer(200,"c2","c2"));
        customers.add(new Customer(300,"c3","c3"));
        customers.add(new Customer(400,"c4","c4"));

        Set<CustomerDTO> customerDTOS = customers.stream().map(c->{
            CustomerDTO cDTO = new CustomerDTO(c.getId(),c.getFirstName(),c.getLastName());
            return cDTO;
        }).collect(Collectors.toSet());

        customerDTOS.forEach(c-> System.out.println("set: "+c.getId()));

        List<Customer> list = new ArrayList<>();
        list.add(new Customer(100,"cc1","cc1"));
        list.add(new Customer(200,"cc2","cc2"));
        list.add(new Customer(300,"cc3","cc3"));
        list.add(new Customer(400,"cc4","cc4"));

        List<CustomerDTO> cDTOS = list.stream().map(c->{
            CustomerDTO cDTO = new CustomerDTO(c.getId(),c.getFirstName(),c.getLastName());
            return cDTO;
        }).collect(Collectors.toList());

        cDTOS.forEach(c-> System.out.println("list: "+c.getFirstName()));



    }
}
