/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.services;

import com.payroll.payrollsystem.dao.BaseDao;
import com.payroll.payrollsystem.dao.ShiftDao;
import com.payroll.payrollsystem.domain.Shift;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author azhar baloch
 */
@Service
public class ShiftServiceImpl extends BaseDao implements ShiftService{

    @Autowired
    ShiftDao shiftDao;
    
    @Override
    public void addShift(Shift shift) {
        shiftDao.addShift(shift);
    }

    @Override
    public void updateShift(Shift shift) {
        shiftDao.updateShift(shift);
    }

    @Override
    public void deleteShift(Integer shiftId) {
       shiftDao.deleteShift(shiftId);
    }

    @Override
    public Shift findShiftById(Integer shiftId) {
        return shiftDao.findShiftById(shiftId);
    }

    @Override
    public List<Shift> findAllShift() {
        return shiftDao.findAllShift();
    }
    
}
