/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.rm;

import com.payroll.payrollsystem.dao.BaseDao;
import com.payroll.payrollsystem.domain.Salary;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author azhar baloch
 */
public class SalaryRowMapper extends BaseDao implements RowMapper<Salary> {

    @Override
    public Salary mapRow(ResultSet rs, int i) throws SQLException {
      Salary sal = new Salary();
      
      sal.setSalId(rs.getInt("salId"));
      sal.setSalPaymentSettingId(rs.getInt("salPaymentSettingId"));
      sal.setSalShiftId(rs.getInt("salShiftId"));
      sal.setSalEmpId(rs.getInt("salEmpId"));
      sal.setSalName(rs.getString("salName"));
      sal.setSalEmpName(rs.getString("empName"));
      sal.setSalStartingSalary(rs.getFloat("salStartingSalary"));
      sal.setSalPaymentName(rs.getString("payName"));
      sal.setSalNextReview(rs.getString("salNextReview"));
      sal.setSalShiftName(rs.getString("shiftName"));
      sal.setSalStatus(rs.getInt("salStatus"));
      return sal;
    }
    
}
