/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.services;

import com.payroll.payrollsystem.domain.Salary;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author azhar baloch
 */

public interface SalaryService {
    public void addSalary(Salary sal);
    public void updateSalary(Salary sal);
    public void deleteSalary(Integer salId);
    public Salary findSalaryById(Integer salId);
    public List<Salary> findAllSalary();
    public List<Salary> findAllSalaryJoined();
}
