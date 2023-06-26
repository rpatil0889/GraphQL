package com.mypoc.Controller;

import com.mypoc.Services.EmployeeService;
import com.mypoc.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService service;
    public Employee addEmployee(@RequestBody Employee employee){
        return service.addEmployee(employee);
    }

    public Employee updateEmployee(@PathVariable Integer id,@RequestBody Employee employee){
        return service.updateEmployee(id,employee);
    }

    @QueryMapping("getEmployee")
    public Employee getEmployee(@Argument int id){
        return service.getEmployee(id);
    }

    @QueryMapping("getAllEmployee")
    public List<Employee> getAllEmployee(){
        return service.getAllEmployee();
    }

    public String deleteEmployee(@PathVariable int id){
        return service.deleteEmployee(id);
    }

}
