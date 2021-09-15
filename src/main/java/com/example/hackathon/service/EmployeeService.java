package com.example.hackathon.service;

import java.util.List;
import com.example.hackathon.model.Employee;

public interface EmployeeService{
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}