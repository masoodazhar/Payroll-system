/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.services;

import com.payroll.payrollsystem.dao.BaseDao;
import com.payroll.payrollsystem.dao.SalaryDao;
import com.payroll.payrollsystem.domain.Salary;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author azhar baloch
 */
@Service
public class SalaryServiceImpl extends BaseDao implements SalaryService {
    @Autowired
    SalaryDao salaryDao;
    
    @Override
    public void addSalary(Salary sal) {
       salaryDao.addSalary(sal);
    }

    @Override
    public void updateSalary(Salary sal) {
        salaryDao.updateSalary(sal);
    }

    @Override
    public void deleteSalary(Integer salId) {
       salaryDao.deleteSalary(salId);
    }

    @Override
    public Salary findSalaryById(Integer salId) {
        return salaryDao.findSalaryById(salId);
    }

    @Override
    public List<Salary> findAllSalary() {
      return salaryDao.findAllSalary();
    }

    @Override
    public List<Salary> findAllSalaryJoined() {
        return salaryDao.findAllSalaryJoined();
    }
    
}
