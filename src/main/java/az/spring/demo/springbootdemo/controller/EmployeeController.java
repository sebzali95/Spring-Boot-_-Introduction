package az.spring.demo.springbootdemo.controller;


import az.spring.demo.springbootdemo.dto.EmployeeDto;
import az.spring.demo.springbootdemo.model.Employee;
import az.spring.demo.springbootdemo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping("/employees")
    public List<EmployeeDto> getEmployees() {
        return employeeService.getEmployees();
    }

}
