package com.bridgelabz.Employee.Payroll.App.Controller;

import com.bridgelabz.Employee.Payroll.App.DTO.PayrollDTO;
import com.bridgelabz.Employee.Payroll.App.DTO.ResponseDTO;
import com.bridgelabz.Employee.Payroll.App.Model.Payroll;
import com.bridgelabz.Employee.Payroll.App.Repository.PayrollRepo;
import com.bridgelabz.Employee.Payroll.App.Service.PayrollService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PayrollController {

    @Autowired
    private PayrollService payrollService;

    @PostMapping("/add")
    public ResponseEntity<ResponseDTO> addMessage(@Valid @RequestBody PayrollDTO payrollDTO) {
        ResponseDTO responseDTO = new ResponseDTO("Data Added Successfully", payrollService.addMessage(payrollDTO));
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }


    @GetMapping("/getAll")
    public ResponseEntity<ResponseDTO> getAllMessage() {
        ResponseDTO responseDTO = new ResponseDTO(" All Data Retrieve Successfully",payrollService.findAll());
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }


    @GetMapping("/getbyId/{id}")
    public ResponseEntity<ResponseDTO> getbyid(@PathVariable long id) {
        ResponseDTO responseDTO = new ResponseDTO("Data Fetched Successfully", payrollService.getById(id));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }


    @PutMapping("/update/{id}")
    public ResponseEntity updateMessage(@PathVariable long id, @RequestBody PayrollDTO payrollDTO) {
        ResponseDTO responseDTO = new ResponseDTO("Data Updated Successfully", payrollService.updateMessage(id, payrollDTO));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }


    @DeleteMapping("/DeleteById/{id}")
    public ResponseEntity<ResponseDTO> deleteMessage(@PathVariable long id) {
        boolean deleted = payrollService.deleteMessage(id);
        if (deleted) {
            ResponseDTO responseDTO = new ResponseDTO("Data Deleted Successfully", id);
            return new ResponseEntity<>(responseDTO, HttpStatus.OK);
        } else {
            ResponseDTO responseDTO = new ResponseDTO("Data Not Found", id);
            return new ResponseEntity<>(responseDTO, HttpStatus.NOT_FOUND);
        }
    }

}
