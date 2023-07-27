package com.bridgelabz.Employee.Payroll.App.DTO;

import com.bridgelabz.Employee.Payroll.App.Model.Payroll;

public class ResponseDTO {
    public String payroll;
    public Object data;
    public ResponseDTO(String payroll,Object data) {
        this.payroll = payroll;
        this.data = data;
    }
}
