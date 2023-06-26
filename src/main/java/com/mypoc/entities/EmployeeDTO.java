package com.mypoc.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToOne;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class EmployeeDTO {
    String empName;
    String empCity;
    String empState;
    Department department;
}
