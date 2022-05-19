package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.modal.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService{
    List<EmployeePayrollData> employeePayrollList = new ArrayList<>();
    public List<EmployeePayrollData> getEmployeePayrollData() {

        return employeePayrollList;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollData(int empId) {
        return null;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
       return employeePayrollList.get(empId-1);
    }

    @Override
    public EmployeePayrollData createEmployeePyrollData(EmployeePayrollData empPayrollDTO) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(employeePayrollList.size()+1,empPayrollDTO);
        employeePayrollList.add(empData);
        return empData;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int empPayrollDTO) {
        return null;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollData empPayrollDTO) {
        EmployeePayrollData empData = this.updateEmployeePayrollData(empId);
        empData.setName(empPayrollDTO.getName());
        empData.setSalary(empPayrollDTO.getSalary());
        employeePayrollList.add(empData);
        empData = new EmployeePayrollData(1,empPayrollDTO);
        return empData;
    }

    @Override
    public void deleteEmployeePayrollData(int empId) {

    }
}
