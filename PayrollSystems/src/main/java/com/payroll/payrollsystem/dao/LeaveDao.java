/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.dao;

import com.payroll.payrollsystem.domain.Leave;
import java.util.List;

/**
 *
 * @author azhar baloch
 */
public interface LeaveDao {
    public void addLeave(Leave leave);
    public void EditLeave(Leave leave);
    public void deleteLeave(Integer leaveId);
    
    public Leave FindLeaveById(Integer leaveId);
    public List<Leave> findLeaveByProp(String propName,String PropValue);
    public List<Leave> FindAllLeave();
}
