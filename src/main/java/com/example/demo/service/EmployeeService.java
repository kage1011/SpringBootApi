package com.example.demo.service;

import com.example.demo.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    public List<Employee> getAll();
    public Employee getEmployeeById(int id);
    public void addEmployee(Employee e);
    public void updateEmployee(Employee e);
    public void deleteEmployee(int id);

}
