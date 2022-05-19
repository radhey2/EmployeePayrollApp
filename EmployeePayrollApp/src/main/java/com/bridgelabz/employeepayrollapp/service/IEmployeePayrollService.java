package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.modal.EmployeePayrollData;

import java.util.List;

public interface IEmployeePayrollService {
    List<EmployeePayrollData>getEmployeePayrollData();

    EmployeePayrollData getEmployeePayrollData(int empId);

    EmployeePayrollData getEmployeePayrollDataById(int empId);

    EmployeePayrollData createEmployeePyrollData(EmployeePayrollData empPayrollDTO);

    EmployeePayrollData updateEmployeePayrollData(int empPayrollDTO);

    EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollData empPayrollDTO);

    void deleteEmployeePayrollData(int empId);



}
