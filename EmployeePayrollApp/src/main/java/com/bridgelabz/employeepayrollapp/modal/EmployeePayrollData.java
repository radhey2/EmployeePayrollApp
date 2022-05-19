package com.bridgelabz.employeepayrollapp.modal;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;

public class EmployeePayrollData {
   private int employeeId;
   private long salary;
   private String name;

   public EmployeePayrollData(){ }

    public EmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO){
       this.employeeId = empId;
       this.salary = employeePayrollDTO.salary;
       this.name = employeePayrollDTO.Name;
    }

    public EmployeePayrollData(int empId, EmployeePayrollData empPayrollDTO) {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public long getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
