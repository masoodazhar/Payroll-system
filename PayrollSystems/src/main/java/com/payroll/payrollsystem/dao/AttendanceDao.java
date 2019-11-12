/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.dao;

import com.payroll.payrollsystem.domain.Attendance;
import java.util.List;

/**
 *
 * @author azhar baloch
 */
public interface AttendanceDao {
    
    public void save(Attendance atd);
    public void update(Attendance atd);
    public void delete(Attendance atd);
    public void delete(Integer atdId);
    public Attendance findById(Integer atdId);
    public List<Attendance> findAll();
    public Attendance findByPropRow(String propName, Object propValue);
    public List<Attendance> findByMultiProp(String propName, String propName2,String propName3,  Object propValue , Object propValue2,Object propValue3);
   
    public List<Attendance> findByMultiProp2(String monthNumber, String year,String AccountNumber,String shifts,  Object monthNumberVal , Object yearVal,Object accountNumberVal,Object shiftsVal);
    public List<Attendance> findByProp(String propName, Object propValue);
    public int addMonthYear();
    
}
