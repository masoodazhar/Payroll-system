/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.services;

import com.payroll.payrollsystem.domain.Department;
import java.util.List;

/**
 *
 * @author azhar baloch
 */
public interface DepartmentService {
    public void addDepartment(Department dep);
    public void editDepartment(Department depId);
    public void deleteDepartment(Integer dep);
    public Department findDepartmentByID(Integer dep);
    public List<Department> findDepartmentByProp(String  prop, String proName);
    public List<Department> findAllDepartment();
}
