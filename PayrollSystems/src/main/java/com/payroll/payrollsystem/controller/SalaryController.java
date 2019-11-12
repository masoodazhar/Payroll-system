/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.controller;

import com.payroll.payrollsystem.domain.Attendance;
import com.payroll.payrollsystem.domain.Employee;
import com.payroll.payrollsystem.services.AttendanceService;
import com.payroll.payrollsystem.services.EmployeeService;
import com.payroll.payrollsystem.services.ShiftService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author DM Solution
 */

@Controller
public class SalaryController {
     @Autowired
    ShiftService shiftService;
     
    @Autowired
    AttendanceService attendanceService;
    
    @Autowired
    EmployeeService employeeService;
    
    Date cal = new Date();
    Calendar calendar = Calendar.getInstance();
   
    
    @RequestMapping(value="manageSalary")
    public String salary(Model model){
    model.addAttribute("allShifts",shiftService.findAllShift());
    Integer shiftId = shiftService.findAllShift().get(0).getShiftId();
    model.addAttribute("allEmployee",employeeService.findByProp("empShift", shiftId));
    model.addAttribute("currentMonthAndYear",new SimpleDateFormat("YYYY-MM").format(cal.getTime())); // keeping the default value of intp type month before search
    List <Employee> allEmployee = employeeService.findByProp("empShift", shiftId);
    Map<String,List> map = new HashMap();
    for (Employee employeeId : allEmployee){
    List <Attendance> allAttendanceRow = attendanceService.findByMultiProp2("atdMonthNumber" ,"atdYear","atdAcnumber","shiftId",new SimpleDateFormat("MM").format(cal.getTime()),new SimpleDateFormat("YY").format(cal.getTime()),employeeId.getEmpId(),shiftId);
    map.put(employeeId.getEmpName(), allAttendanceRow);
    }
    model.addAttribute("keyAndValue",map);
    model.addAttribute("shiftId",shiftId);
    model.addAttribute("currentDate",new SimpleDateFormat("M-YYYY").format(cal.getTime()));
        return "payroll/manage-salary";
    }
   
    
    
    @RequestMapping(value="manageSalarySearch")
    public String manageSalarySearch(Model model, @RequestParam("date")String searchDate,@RequestParam("shiftid")int shiftId, @RequestParam("id")int empId) throws ParseException{
    model.addAttribute("allShifts",shiftService.findAllShift());
    model.addAttribute("allEmployee",employeeService.findByProp("empShift", shiftId));
    model.addAttribute("currentMonthAndYear",searchDate); // keeping the default value of intp type month before search
    Map<String,List> map = new HashMap();
    String[] monthANDyear = searchDate.split("-");
    if(empId<=0){
    List <Employee> allEmployee = employeeService.findByProp("empShift", shiftId);
    for (Employee employeeId : allEmployee){
    List <Attendance> allAttendanceRow = attendanceService.findByMultiProp2("atdMonthNumber" ,"atdYear","atdAcnumber","shiftId",monthANDyear[1],removeChar(monthANDyear[0]),employeeId.getEmpId(),shiftId);
    map.put(employeeId.getEmpName(), allAttendanceRow);
    }
    }else{
    Employee allEmployee = employeeService.findById(empId);
    List <Attendance> allAttendanceRow = attendanceService.findByMultiProp2("atdMonthNumber" ,"atdYear","atdAcnumber","shiftId",monthANDyear[1],removeChar(monthANDyear[0]),empId,shiftId);
    map.put(allEmployee.getEmpName(), allAttendanceRow); 
    }
    model.addAttribute("keyAndValue",map);
    model.addAttribute("shiftId",shiftId);
    model.addAttribute("empId",empId);
    model.addAttribute("currentDate",searchDate);
    return "payroll/manage-salary";
    }
    
    
    
    @RequestMapping(value="salaryPayment")
    public String salaryPayment(Model model, @RequestParam("id")int empId,@RequestParam("date")String searchDate,@RequestParam("shiftid")int shiftId) throws ParseException{
    model.addAttribute("allShifts",shiftService.findAllShift());
    model.addAttribute("allEmployee",employeeService.findByProp("empShift", shiftId));
    Map<String,List> map = new HashMap();
    String[] monthANDyear = searchDate.split("-");
    Employee allEmployee = employeeService.findById(empId);
    List <Attendance> allAttendanceRow = attendanceService.findByMultiProp2("atdMonthNumber" ,"atdYear","atdAcnumber","shiftId",monthANDyear[1],ifDateisFull(monthANDyear[0]),empId,shiftId);
    map.put(allEmployee.getEmpName(), allAttendanceRow); 
    model.addAttribute("currentMonthAndYear","20"+ifDateisFull(searchDate)); // keeping the default value of intp type month before search
    model.addAttribute("keyAndValue",map);
    model.addAttribute("shiftId",shiftId);
    model.addAttribute("empId",empId);
    model.addAttribute("currentDate","20"+ifDateisFull(searchDate));
    return "payroll/salaryPayment";
    }
    
    
     public String removeChar(String str) {
     String strNew = str.replaceFirst("20", "");
     return strNew;
     }
     public String ifDateisFull(String str) {
     String strNew ;
     if(str.length()>2){
     strNew = str.replaceFirst("20", "");
     }else{
     strNew = str;
     }
     return strNew;
     }
}
