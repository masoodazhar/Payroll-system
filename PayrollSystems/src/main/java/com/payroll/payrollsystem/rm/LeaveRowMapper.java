/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.rm;

import com.payroll.payrollsystem.domain.Leave;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author azhar baloch
 */
public class LeaveRowMapper implements RowMapper<Leave> {

    @Override
    public Leave mapRow(ResultSet rs, int i) throws SQLException {
        Leave leave = new Leave();
        
        leave.setLeaveId(rs.getInt("leaveId"));
        leave.setLeaveEmpid(rs.getInt("leaveEmpid"));
        leave.setLeaveFrom(rs.getString("leaveFrom"));
        leave.setLeaveTo(rs.getString("leaveTo"));
        leave.setLeaveType(rs.getString("leaveType"));
        leave.setLeaveReason(rs.getString("leaveReason"));
        leave.setLeaveStatus(rs.getInt("leaveStatus"));
    
        return leave;
    }
    
}
