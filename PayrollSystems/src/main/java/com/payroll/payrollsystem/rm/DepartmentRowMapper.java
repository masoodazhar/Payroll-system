/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.rm;

import com.payroll.payrollsystem.domain.Department;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author azhar baloch
 */
public class DepartmentRowMapper implements RowMapper<Department>{

    @Override
    public Department mapRow(ResultSet rs, int i) throws SQLException {
       Department dep = new Department();
       dep.setDepId(rs.getInt("depId"));
       dep.setDepName(rs.getString("depName"));
       dep.setDepHead(rs.getString("depHead"));
       dep.setDepNumberofEmployee(rs.getString("depNumberofEmployee"));
       dep.setDepStatus(rs.getInt("depStatus"));
       
       return dep;
    }
    
}
