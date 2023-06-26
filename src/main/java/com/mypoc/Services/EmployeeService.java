package com.mypoc.Services;

import com.mypoc.entities.Employee;

import java.util.List;

public interface EmployeeService {

    Employee addEmployee(Employee employee);
    Employee getEmployee(Integer id);
    List<Employee>getAllEmployee();
    Employee updateEmployee(Integer id, Employee employee);
    String deleteEmployee(Integer id);
}
