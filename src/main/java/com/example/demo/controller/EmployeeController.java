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
        public List<Employee> getAllEmployee(){
            return employeeService.getAll();
        }
        @GetMapping("/employee")
        public Employee getEmployeeById(@RequestParam("id") int id){
            return employeeService.getEmployeeById(id);
        }

        @PostMapping
        public void addEmployee(@RequestBody Employee e) {
            employeeService.addEmployee(e);
        }
        @PutMapping
        public void updateEmployee(@RequestBody Employee e) {
            employeeService.updateEmployee(e);
            System.out.println("update successfully");
        }
        @DeleteMapping
        public void deleteGv(@RequestParam("id") int id) {
            employeeService.deleteEmployee(id);
        }
    }
}
