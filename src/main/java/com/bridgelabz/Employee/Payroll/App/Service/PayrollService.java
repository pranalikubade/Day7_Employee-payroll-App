package com.bridgelabz.Employee.Payroll.App.Service;

import com.bridgelabz.Employee.Payroll.App.DTO.PayrollDTO;
import com.bridgelabz.Employee.Payroll.App.Exception.CustomException;
import com.bridgelabz.Employee.Payroll.App.Model.Payroll;
import com.bridgelabz.Employee.Payroll.App.Repository.PayrollRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayrollService {
    @Autowired
    private PayrollRepo payrollRepo;

    public Payroll addMessage(PayrollDTO payrollDTO) {
        Payroll payrollData = new Payroll(payrollDTO);
        return payrollRepo.save(payrollData);
    }
    public Payroll getById(long id) {
        return payrollRepo.findById(id).orElseThrow(() -> new CustomException("Message With Id:"+id + " Not Present"));
    }
    public Payroll updateMessage(long id, PayrollDTO payrollDTO) {
        Payroll payrollData = getById(id);
        if (payrollData != null){
            payrollData.updateMessage(payrollDTO);
            return payrollRepo.save(payrollData);
        }
        return null;
    }

    public List<Payroll> findAll() {
        return payrollRepo.findAll();
    }
    public boolean deleteMessage(long id) {
        if (payrollRepo.existsById(id)) {
            payrollRepo.deleteById(id);
            return true; // Deletion successful
        }
        return false; // Message not found
    }

}
