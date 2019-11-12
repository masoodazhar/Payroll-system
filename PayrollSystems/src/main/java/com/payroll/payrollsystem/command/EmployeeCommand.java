/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.command;

import com.payroll.payrollsystem.domain.Employee;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author azhar baloch
 */
public class EmployeeCommand {
   
    Employee employee;
    
   
    private MultipartFile empImage;

    public MultipartFile getEmpImage() {
        return empImage;
    }

    public void setEmpImage(MultipartFile empImage) {
        this.empImage = empImage;
    }

    
    
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
        
        
    }

    
}
