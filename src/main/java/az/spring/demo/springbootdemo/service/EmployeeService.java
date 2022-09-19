package az.spring.demo.springbootdemo.service;

import az.spring.demo.springbootdemo.dto.EmployeeDto;
import az.spring.demo.springbootdemo.model.Employee;
import az.spring.demo.springbootdemo.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public List<EmployeeDto> getEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return  employees.stream()
                .map(employee -> getEmployeeDto(employee))
                .collect(Collectors.toList());

    }

    private EmployeeDto getEmployeeDto(Employee employee) {
        EmployeeDto employeeDto = new EmployeeDto();
        BeanUtils.copyProperties(employee, employeeDto);
        return employeeDto;
    }
}
