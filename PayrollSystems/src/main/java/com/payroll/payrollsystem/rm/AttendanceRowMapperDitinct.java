/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.rm;

import com.payroll.payrollsystem.domain.Attendance;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author azhar baloch
 */
public class AttendanceRowMapperDitinct implements RowMapper<Attendance>{

    @Override
    public Attendance mapRow(ResultSet rs, int i) throws SQLException {
        Attendance atd= new Attendance();
         atd.setAtdId(rs.getInt("atdId"));
    atd.setAtdAcnumber(rs.getString("atdAcnumber"));
    atd.setAtdDepartment(rs.getString("atdDepartment"));
    atd.setAtdDate(rs.getString("atdDate"));
    atd.setAtdTime(rs.getString("atdTime"));
    atd.setAtdName(rs.getString("atdName"));
    atd.setAtdStatus(rs.getInt("atdStatus"));
    atd.setEmpId(rs.getInt("empId"));
    atd.setEmpName(rs.getString("empName"));
        return atd;
    }
    
}
