/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.services;

import com.payroll.payrollsystem.dao.AttendanceDao;
import com.payroll.payrollsystem.dao.BaseDao;
import com.payroll.payrollsystem.domain.Attendance;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author azhar baloch
 */
@Service
public class AttendanceServiceImpl extends  BaseDao implements AttendanceService {

    @Autowired
    private AttendanceDao attendanceDAO;
    
    @Override
    public void save(Attendance atd) {
        attendanceDAO.save(atd);
        attendanceDAO.addMonthYear();
    }

    @Override
    public void update(Attendance atd) {
        attendanceDAO.update(atd);
    }

    @Override
    public void delete(Attendance atd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Integer empId) {
       attendanceDAO.delete(empId);
    }

    @Override
    public Attendance findById(Integer empId) {
       return attendanceDAO.findById(empId);
    }

    @Override
    public List<Attendance> findAll() {
        return attendanceDAO.findAll();
    }

    @Override
    public List<Attendance> findByProp(String propName, Object propValue) {
        return attendanceDAO.findByProp(propName, propValue);
    }

    @Override
    public Attendance findByPropRow(String propName, Object propValue) {
        return attendanceDAO.findByPropRow(propName, propValue);
    }


    @Override
    public List<Attendance> findByMultiProp(String propName, String propName2, String propName3, Object propValue, Object propValue2, Object propValue3) {
        return attendanceDAO.findByMultiProp(propName, propName2, propName3, propValue, propValue2, propValue3);
    }

    @Override
    public List<Attendance> findByMultiProp2(String monthNumber, String year, String AccountNumber, String shifts, Object monthNumberVal, Object yearVal, Object accountNumberVal, Object shiftsVal) {
       return attendanceDAO.findByMultiProp2(monthNumber, year, AccountNumber, shifts, monthNumberVal, yearVal, accountNumberVal, shiftsVal);
   }
    
    
    
}
