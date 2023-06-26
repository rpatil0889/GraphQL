package com.mypoc.Converter;

import com.mypoc.entities.Employee;
import com.mypoc.entities.EmployeeDTO;

public class Converter {
    Converter() {
    }
    public static Employee DTOToEntity(EmployeeDTO employeeDTO){
        return Employee.builder()
                .empName(employeeDTO.getEmpName())
                .empCity(employeeDTO.getEmpCity())
                .empState(employeeDTO.getEmpState())
                .department(employeeDTO.getDepartment())
                .build();
    }
    public static EmployeeDTO EntityToDTO(Employee employee){
        return EmployeeDTO.builder()
                .empName(employee.getEmpName())
                .empCity(employee.getEmpCity())
                .empState(employee.getEmpState())
                .department(employee.getDepartment())
                .build();
    }
}
