package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.dto.ResponseDTO;
import com.bridgelabz.employeepayrollapp.modal.EmployeePayrollData;
import com.bridgelabz.employeepayrollapp.service.EmployeePayrollService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {
    private EmployeePayrollController employeePayrollService;
    private EmployeePayrollDTO empPayrollDTO;
    private int empId;

    @RequestMapping(value = {"","/","/get"})
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(){
        EmployeePayrollData empdata =null;
        empdata = new EmployeePayrollData(1,new EmployeePayrollDTO("pankaj",30000));
        ResponseDTO respDTO = new ResponseDTO("Get Call Success", empdata);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{empID}")
    public ResponseEntity<ResponseDTO>getEmployeePayrollData(@PathVariable("empID") int empID){
        EmployeePayrollData empdata =null;
        empdata = new EmployeePayrollData(1,new EmployeePayrollDTO("pankaj",30000));
        ResponseDTO respDTO = new ResponseDTO("Get Call For Id Successfull", empdata);
        return new ResponseEntity<ResponseDTO>( respDTO, HttpStatus.OK);
    }

    @PostMapping("/Create")
    public ResponseEntity<ResponseDTO>addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO){
        EmployeePayrollData empdata =null;
        empdata = new EmployeePayrollData(1,employeePayrollDTO);
        ResponseDTO respDTO = new ResponseDTO("Create EmployeePayroll Data Successfull: ", empdata);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @PutMapping("/update/{empId}")
    public ResponseEntity<ResponseDTO>updateEmployeePayrollData(@PathVariable("empId") int Id, @RequestBody EmployeePayrollDTO employeePayrollDTO){
        ResponseEntity<ResponseDTO> empData =null;
        empData = employeePayrollService.updateEmployeePayrollData(empId, empPayrollDTO);
        ResponseDTO respDTO = new ResponseDTO("Update EmployeePayroll data successfully  ", empData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{empID=d}")
    public ResponseEntity<ResponseDTO>deleteEmployeePayrollData(@PathVariable("empID") int empID){
        ResponseDTO respDTO = new ResponseDTO("Delete Id Successfully ", +empID);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
}
