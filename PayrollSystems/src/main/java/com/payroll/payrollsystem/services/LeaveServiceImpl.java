/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.services;

import com.payroll.payrollsystem.dao.BaseDao;
import com.payroll.payrollsystem.dao.LeaveDao;
import com.payroll.payrollsystem.domain.Leave;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author azhar baloch
 */
@Service
public class LeaveServiceImpl extends BaseDao implements LeaveService{

    @Autowired
    private LeaveDao leaveDao;
    
    @Override
    public void addLeave(Leave leave) {
       leaveDao.addLeave(leave);
    }

    @Override
    public void EditLeave(Leave leave) {
       leaveDao.EditLeave(leave);
    }

    @Override
    public void deleteLeave(Integer leaveId) {
       leaveDao.deleteLeave(leaveId);
    }

    @Override
    public Leave FindLeaveById(Integer leaveId) {
        return leaveDao.FindLeaveById(leaveId);
    }

    @Override
    public List<Leave> findLeaveByProp(String propName, String PropValue) {
        return leaveDao.findLeaveByProp(propName, PropValue);
    }

    @Override
    public List<Leave> FindAllLeave() {
       return leaveDao.FindAllLeave();
    }
    
}
