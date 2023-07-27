package com.bridgelabz.Employee.Payroll.App.Exception;

public class CustomException extends RuntimeException{
    public CustomException(String payroll){
        super(payroll);
    }

}
