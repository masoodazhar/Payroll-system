/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.services;

import com.payroll.payrollsystem.dao.BaseDao;
import com.payroll.payrollsystem.dao.DepartmentDao;
import com.payroll.payrollsystem.domain.Department;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author azhar baloch
 */

@Service
public class DepartmentServiceImpl extends BaseDao implements DepartmentService {

    @Autowired
    DepartmentDao departmentDao;
    
    
    @Override
    public void addDepartment(Department dep) {
        departmentDao.addDepartment(dep);
    }

    @Override
    public void deleteDepartment(Integer depID) {
        departmentDao.deleteDepartment(depID);
    }

    @Override
    public Department findDepartmentByID(Integer depid) {
        return departmentDao.findDepartmentByID(depid);
    }

    @Override
    public List<Department> findDepartmentByProp(String prop, String proName) {
        
       return departmentDao.findDepartmentByProp(prop, proName);
    }

    @Override
    public List<Department> findAllDepartment() {
      return departmentDao.findAllDepartment();
    }

    @Override
    public void editDepartment(Department dep) {
        departmentDao.editDepartment(dep);
    }
    
}
