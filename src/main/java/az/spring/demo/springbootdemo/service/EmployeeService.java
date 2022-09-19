package az.spring.demo.springbootdemo.service;

import az.spring.demo.springbootdemo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    public List<Employee> getEmployees() {
        return List.of(Employee.builder()
                        .name("Sebzali")
                        .surname("Abdurrahimli")
                        .build(),
                Employee.builder()
                        .name("Shamil")
                        .surname("Abdurrahimli")
                        .build()
        );


    }
}
