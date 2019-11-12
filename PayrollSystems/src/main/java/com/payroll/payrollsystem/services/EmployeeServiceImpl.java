/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.services;

import com.payroll.payrollsystem.dao.BaseDao;
import com.payroll.payrollsystem.dao.EmployeeDao;
import com.payroll.payrollsystem.domain.Employee;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author azhar baloch
 */
@Service
public class EmployeeServiceImpl extends BaseDao implements EmployeeService{

    @Autowired
    private EmployeeDao employeeDAO;

    @Override
    public void addEmployee(Employee emp) {
         employeeDAO.save(emp);
    }

    @Override
    public void update(Employee emp) {
        employeeDAO.update(emp);
    }

    @Override
    public void delete(Employee emp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Integer empId) {
       employeeDAO.delete(empId);
    }

    @Override
    public Employee findById(Integer empId) {
      return employeeDAO.findById(empId);
    
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public List<Employee> findByProp(String propName, Object propValue) {
       return employeeDAO.findByProp(propName, propValue);
    }

    @Override
    public Employee findByPropRow(String propName, Object propValue) {
         return employeeDAO.findByPropRow(propName, propValue);
    }
    
    
}
