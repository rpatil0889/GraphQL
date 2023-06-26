package com.mypoc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
    public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int deptId;
    String deptName;
}