package com.mypoc.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer empId;
    String empName;
    String empCity;
    String empState;
    @OneToOne(cascade = CascadeType.ALL)
    Department department;
}
