package com.bridgelabz.Employee.Payroll.App.DTO;

import jakarta.validation.constraints.*;


import java.time.LocalDate;
import java.util.List;

public class PayrollDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-z,A-Z ]{2,}$",message = "Invalid Firstname")
    @NotEmpty(message = "Firstname Required")
    public String fName;

    @Pattern(regexp = "^[A-Z]{1}[a-z,A-Z ]{2,}$",message = "Invalid Lastname ")
    public String lName;

    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$",message = "Invalid email-ID")
    public String email;

    @Pattern(regexp = "^[\\d{3}-\\d{3}-\\d{4}]$",message = "Invalid Phone Number")
    public String phone;
    public String address;
    @Min(value = 1000, message = "Salary should be greater than 1000")
    public double salary;
    @Pattern(regexp = "Male|Female", message = "Gender need to be male or female")
    public String gender;
    public String profilePic;
    @NotNull(message = "StartDate shouldn't be Empty")
    public LocalDate startDate;
    @NotNull(message = "Department shouldn't be Empty")
    public List<String> department;
    @NotBlank
    public String notes;
}
