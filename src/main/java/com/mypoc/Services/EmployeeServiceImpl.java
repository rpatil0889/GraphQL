package com.mypoc.Services;

import com.mypoc.entities.Department;
import com.mypoc.entities.Employee;
import com.mypoc.exceptions.EmployeeNotFound;
import com.mypoc.repositories.EmployeeRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepo repo;
    @Override
    public Employee addEmployee(Employee employee) {
        return repo.save(employee);
    }
    @Override
    public Employee getEmployee(Integer id) {
        return repo.findById(id).orElseThrow(()-> new EmployeeNotFound("Employee not found with id: "+id));
    }
    @Override
    public List<Employee> getAllEmployee() {
        return repo.findAll();
    }
    @Override
    public Employee updateEmployee(Integer id, Employee employee) {
        Employee emp = this.getEmployee(id);
        emp.setEmpName(employee.getEmpName());
        emp.setEmpCity(employee.getEmpCity());
        emp.setEmpState(employee.getEmpState());

        Department department = emp.getDepartment();

        department.setDeptId(emp.getDepartment().getDeptId());
        department.setDeptName(employee.getDepartment().getDeptName());
        return repo.save(emp);
    }
    @Override
    public String deleteEmployee(Integer id) {
        repo.delete(this.getEmployee(id));
        return "Employee Deleted Successfully";
    }
}
