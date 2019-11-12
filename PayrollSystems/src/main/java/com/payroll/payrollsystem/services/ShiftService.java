/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.services;

import com.payroll.payrollsystem.domain.Shift;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author azhar baloch
 */
public interface ShiftService {
    
    public void addShift(Shift shift);
    public void updateShift(Shift shift);
    public void deleteShift(Integer shiftId);
    public Shift findShiftById(Integer shiftId);
    public List<Shift> findAllShift();
}
