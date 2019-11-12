/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.dao;

import com.payroll.payrollsystem.domain.Shift;
import java.util.List;

/**
 *
 * @author azhar baloch
 */
public interface ShiftDao {
    public void addShift(Shift shift);
    public void updateShift(Shift shift);
    public void deleteShift(Integer shiftId);
    public Shift findShiftById(Integer shiftId);
    public List<Shift> findAllShift();
}
