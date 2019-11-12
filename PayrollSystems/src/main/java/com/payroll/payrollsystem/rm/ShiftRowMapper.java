/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.rm;

import com.payroll.payrollsystem.dao.BaseDao;
import com.payroll.payrollsystem.domain.Shift;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author azhar baloch
 */
public class ShiftRowMapper extends BaseDao implements RowMapper<Shift>{

    @Override
    public Shift mapRow(ResultSet rs, int i) throws SQLException {
        Shift shift = new Shift();
        shift.setShiftId(rs.getInt("shiftId"));
        shift.setShiftName(rs.getString("shiftName"));
        shift.setShiftHoursd(rs.getFloat("shiftHoursd"));
        shift.setShiftHoursm(rs.getFloat("shiftHoursm"));
        shift.setShiftStarttime(rs.getString("shiftStarttime"));
        shift.setShiftEndtime(rs.getString("shiftEndtime"));
        shift.setShiftLate(rs.getString("shiftLate"));
        shift.setShiftHalp(rs.getString("shiftHalp"));
        shift.setShiftStatus(rs.getInt("shiftStatus"));
        shift.setShiftHolidays(rs.getString("shiftHolidays"));
        
        
       return shift;
    }
    
}
