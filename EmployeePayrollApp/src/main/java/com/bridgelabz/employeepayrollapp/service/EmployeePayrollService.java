package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.exceptions.EmpolyeePayrollException;
import com.bridgelabz.employeepayrollapp.modal.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService{

    private List<EmployeePayrollData>employeePayrollDataList = new ArrayList<>();
    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        List<EmployeePayrollData> empDataList = new ArrayList<>();
        empDataList.add(new EmployeePayrollData(1,new EmployeePayrollDTO("pankaj",30000)));
        return empDataList;
    }

    public EmployeePayrollData getEmployeePayrollById(int empId){
        return employeePayrollDataList.stream()
                .filter(empdata -> empdata.getEmployeeId()==empId)
                .findAny().orElseThrow(() -> new EmpolyeePayrollException("Employee Not Found"));

    }

    @Override
    public EmployeePayrollData getEmployeePayrollData(int empId) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1,new EmployeePayrollDTO("pankaj",30000));
        return empData;
    }

    @Override
    public EmployeePayrollData createEmployeePyrollData(EmployeePayrollData empPayrollDTO) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1,empPayrollDTO);
        return empData;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(EmployeePayrollData empPayrollDTO) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1,empPayrollDTO);
        return empData;
    }

    @Override
    public void deleteEmployeePayrollData(int empId) {

    }
}
