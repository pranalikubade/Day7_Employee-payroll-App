package com.bridgelabz.Employee.Payroll.App.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Employee Department")
public class Dept {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    private String dept;
    private String sector;
}
