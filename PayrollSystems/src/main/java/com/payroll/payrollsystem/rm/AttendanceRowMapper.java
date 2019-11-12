/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.rm;

import com.payroll.payrollsystem.domain.Attendance;
import com.payroll.payrollsystem.services.EmployeeService;
import com.payroll.payrollsystem.services.ShiftService;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author azhar baloch
 */
public class AttendanceRowMapper implements RowMapper<Attendance>{

    @Autowired
    ShiftService shiftService;
    @Autowired
    EmployeeService employeeService;
    @Override
    public Attendance mapRow(ResultSet rs, int i) throws SQLException {
    Attendance atd = new Attendance();
    atd.setAtdId(rs.getInt("atdId"));
    atd.setAtdAcnumber(rs.getString("atdAcnumber"));
    atd.setAtdDepartment(rs.getString("atdDepartment"));
    atd.setAtdDate(rs.getString("atdDate"));
    atd.setAtdTime(rs.getString("atdTime"));
    atd.setAtdName(rs.getString("atdName"));
    atd.setAtdStatus(rs.getInt("atdStatus"));
    atd.setAtdDay(rs.getString("atdDay"));
    atd.setAtdCheckin(rs.getString("atdCheckin"));
    atd.setAtdCheckout(rs.getString("atdCheckout"));
    atd.setShiftHoursd(rs.getString("shiftHoursd"));
    atd.setShiftLate(rs.getString("shiftLate"));
    atd.setShiftHalp(rs.getString("shiftHalp"));
    atd.setSalStartingSalary(rs.getString("salStartingSalary"));
    atd.setShiftName(rs.getString("shiftName"));
    atd.setAtdMonthNumber(rs.getString("atdMonthNumber"));
    atd.setAtdYear(rs.getString("atdYear"));
    atd.setShiftId(rs.getString("shiftId"));
    
    //String shiftId = employeeService.findById(Integer.parseInt(rs.getString("atdAcnumber"))).getEmpShift();
    //String holidays[]= shiftService.findShiftById(1).getShiftHolidays().split(",");
    String  holidays[]= rs.getString("shiftHolidays").split(",");
    if(Arrays.asList(holidays).contains(rs.getString("atdDay"))){
    atd.setHoliDays("off"); 
    }else{
    atd.setHoliDays("on");
    }
    return atd;   
    }
    
}
