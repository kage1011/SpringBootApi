package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    public class EmployeeRestController {
        @Autowired
        EmployeeServiceImpl employeeService;

        @GetMapping
        public List<Employee> getAll() {
            return employeeService.getAll();
        }

        @PostMapping
        public Employee add(Employee employee) {
            employeeService.addEmployee(employee);
            return employee;
        }

        @PutMapping
        public Employee update(Employee employee) {
            employeeService.updateEmployee(employee);
            return employee;
        }

        @DeleteMapping("/{id}")
        public void delete(@PathVariable int id) {
            employeeService.deleteEmployee(id);
        }
    }
}
