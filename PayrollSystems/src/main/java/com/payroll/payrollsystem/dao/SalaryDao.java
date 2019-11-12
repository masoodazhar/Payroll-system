/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.dao;

import com.payroll.payrollsystem.domain.Salary;
import java.util.List;

/**
 *
 * @author azhar baloch
 */
public interface SalaryDao {
 
    public void addSalary(Salary sal);
    public void updateSalary(Salary sal);
    public void deleteSalary(Integer salId);
    public Salary findSalaryById(Integer salId);
    public List<Salary> findAllSalary();
    public List<Salary> findAllSalaryJoined();

}
