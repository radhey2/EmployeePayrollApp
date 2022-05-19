package com.bridgelabz.employeepayrollapp.modal;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import lombok.Data;

import java.util.List;

public @Data class EmployeePayrollData {
   private int employeeId;
   private long salary;
   private String name;
   private String startDate;
   private String Gender;
   private String profilePic;
   private String note;
   private List<String> Department;

   public  EmployeePayrollData(){ }

    public EmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO){
       this.employeeId = empId;
       this.salary = employeePayrollDTO.salary;
       this.name = employeePayrollDTO.Name;
       this.Gender = employeePayrollDTO.Gender;
       this.Department = employeePayrollDTO.Department;
       this.note = employeePayrollDTO.note;
       this.startDate = employeePayrollDTO.startDate;
       this.profilePic= employeePayrollDTO.profilePic;
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
