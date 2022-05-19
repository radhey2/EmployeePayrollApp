package com.bridgelabz.employeepayrollapp.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class EmployeePayrollDTO {
    public String Name;
    public long salary;

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
