/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.services;

import com.payroll.payrollsystem.domain.Attendance;
import java.util.List;

/**
 *
 * @author azhar baloch
 */
public interface AttendanceService {
   public void save(Attendance atd);
  
  
    public void update(Attendance atd);
    public void delete(Attendance atd);
    public void delete(Integer empId);
    public Attendance findById(Integer empId);
    public List<Attendance> findAll();
    public List<Attendance> findByProp(String propName, Object propValue);
    public List<Attendance> findByMultiProp2(String monthNumber, String year,String AccountNumber,String shifts,  Object monthNumberVal , Object yearVal,Object accountNumberVal,Object shiftsVal);
    
    public List<Attendance> findByMultiProp(String propName, String propName2,String propName3,  Object propValue , Object propValue2,Object propValue3);
    public Attendance findByPropRow(String propName, Object propValue);
}
