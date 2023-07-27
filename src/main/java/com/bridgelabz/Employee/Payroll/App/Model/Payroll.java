package com.bridgelabz.Employee.Payroll.App.Model;

import com.bridgelabz.Employee.Payroll.App.DTO.PayrollDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Employee Payroll Table")
@Data    //Instead of @Getter and @Setter
@NoArgsConstructor
public class Payroll {

    @Id
    @GeneratedValue

    private Long id;
    private String fName;
    private String lName;
    private String email;
    private String phone;
    private String address;
    @Column(name = "Emp_Salary")
    private double salary;
    private String gender;
    private String profilePic;
    private LocalDate startDate;

    private String notes;
    @ElementCollection
    @CollectionTable(name="Employee_Department", joinColumns = @JoinColumn (name="employee_id"))
    @Column (name="department")
    private List<String> department;

    public Payroll(PayrollDTO payrollDTO){
        this.updateMessage(payrollDTO);
    }

    public void updateMessage(PayrollDTO payrollDTO) {
        this.fName = payrollDTO.fName;
        this.lName = payrollDTO.lName;
        this.email = payrollDTO.email;
        this.phone = payrollDTO.phone;
        this.address = payrollDTO.address;
        this.salary = payrollDTO.salary;
        this.gender = payrollDTO.gender;
        this.profilePic = payrollDTO.profilePic;
        this.startDate = payrollDTO.startDate;
        this.department = payrollDTO.department;
        this.notes = payrollDTO.notes;
    }


}
