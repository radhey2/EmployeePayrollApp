package com.bridgelabz.employeepayrollapp.dto;

import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.List;

public @ToString() class EmployeePayrollDTO {
    public String Name;
    public long salary;
    public String Gender;
    public String startDate;
    public String note;
    public String profilePic;
    public List<String> Department;
    
    @Pattern(regexp = "^[A-Z]{1}{a-zA-Z\\s}{2,}$",message = "Employee Name Invalid")

    @NotEmpty(message = "Employee Name cannot be null")

    @Min(value = 500, message = "Min wage Should more than 500")

    public EmployeePayrollDTO(String name, long salary){
        this.Name = name;
        this.salary = salary;

    }

    public String toSting(){

        return "name=" +Name + ":salary=" +salary;
    }

}
