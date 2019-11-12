/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.dao;

import com.payroll.payrollsystem.domain.Employee;
import java.util.List;

/**
 *
 * @author azhar baloch
 */
public interface EmployeeDao {
    public void save(Employee emp);
    public void update(Employee emp);
    public void delete(Employee emp);
    public void delete(Integer empId);
    public Employee findById(Integer empId);
    public List<Employee> findAll();
    public List<Employee> findByProp(String propName, Object propValue);
    public Employee findByPropRow(String propName, Object propValue);
}
