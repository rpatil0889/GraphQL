package com.mypoc.Controller;

import com.mypoc.Converter.Converter;
import com.mypoc.Services.EmployeeService;
import com.mypoc.entities.Employee;
import com.mypoc.entities.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService service;
    @MutationMapping("addEmployee")
    public Employee addEmployee(@Argument EmployeeDTO employee){
        return service.addEmployee(Converter.DTOToEntity(employee));
    }
    @MutationMapping("updateEmployee")
    public Employee updateEmployee(@Argument int empId,@Argument Employee employee){
        return service.updateEmployee(empId,employee);
    }
    @QueryMapping("getEmployee")
    public Employee getEmployee(@Argument int empId){
        return service.getEmployee(empId);
    }
    @QueryMapping("getAllEmployee")
    public List<Employee> getAllEmployee(){
        return service.getAllEmployee();
    }
    @MutationMapping("deleteEmployee")
    public String deleteEmployee(@Argument int empId){
        return service.deleteEmployee(empId);
    }
}
