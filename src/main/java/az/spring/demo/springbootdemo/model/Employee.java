package az.spring.demo.springbootdemo.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {

    private String name;
    private String surname;
}
