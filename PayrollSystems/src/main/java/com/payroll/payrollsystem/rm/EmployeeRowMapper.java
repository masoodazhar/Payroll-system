/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.rm;

import com.payroll.payrollsystem.domain.Employee;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author azhar baloch
 */
public class EmployeeRowMapper implements RowMapper<Employee>{

    @Override
    public Employee mapRow(ResultSet rs, int i) throws SQLException {
        Employee emp = new Employee();
        emp.setEmpId(rs.getInt("empId"));
        emp.setEmpName(rs.getString("empName"));
        emp.setEmpPhone(rs.getString("empPhone"));
        emp.setEmpEmail(rs.getString("empEmail"));
        emp.setEmpImage(rs.getString("empImage"));
        emp.setEmpRole(rs.getString("empRole"));
        emp.setEmpStatus(rs.getString("empStatus"));
        emp.setEmpJoindate(rs.getString("empJoindate"));
        
        emp.setEmpDateofbirth(rs.getString("empDateofbirth"));
        emp.setEmpDepartment(rs.getString("empDepartment"));
        emp.setEmpGender(rs.getString("empGender"));
        emp.setEmpJobtitle(rs.getString("empJobtitle"));
        emp.setEmpJobtype(rs.getString("empJobtype"));
        emp.setEmpShift(rs.getString("empShift"));
        emp.setEmpCnic(rs.getString("empCnic"));
        emp.setEmpSelf(rs.getInt("empSelf"));
        return emp;
    }
    
}
