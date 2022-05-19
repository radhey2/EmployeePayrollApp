package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.modal.EmployeePayrollData;

import java.util.List;

public interface IEmployeePayrollService {
    List<EmployeePayrollData>getEmployeePayrollData();

    EmployeePayrollData getEmployeePayrollData(int empId);

    EmployeePayrollData createEmployeePyrollData(EmployeePayrollData empPayrollDTO);

    EmployeePayrollData updateEmployeePayrollData(EmployeePayrollData empPayrollDTO);

    void deleteEmployeePayrollData(int empId);



}
