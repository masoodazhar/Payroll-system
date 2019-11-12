/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.controller;

import com.google.gson.Gson;
import com.payroll.payrollsystem.command.AttendanceCommand;
import com.payroll.payrollsystem.command.EmployeeCommand;
import com.payroll.payrollsystem.domain.Attendance;
import com.payroll.payrollsystem.domain.Employee;
import com.payroll.payrollsystem.domain.Shift;
import com.payroll.payrollsystem.services.AttendanceService;
import com.payroll.payrollsystem.services.DepartmentService;
import com.payroll.payrollsystem.services.EmployeeService;
import com.payroll.payrollsystem.ie.FileUploadService;
import com.payroll.payrollsystem.services.ShiftService;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import javax.servlet.ServletContext;
import javax.ws.rs.client.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author azhar baloch
 */
@Controller
public class AttendanceController {
    @Autowired
    AttendanceService attendanceService;
    @Autowired
    EmployeeService employeeService;
    
    @Autowired
    ServletContext context; 
    
    @Autowired
    DepartmentService departmentService;
    @Autowired
    ShiftService shiftService;
    
    @Autowired
    FileUploadService uploadService;
    
     Random r = new Random();
     
    Date cal = new Date();
    Calendar calendar = Calendar.getInstance();
    
     String  MonthOfName = "";
     int number_Of_DaysInMonth = 0;
    
    
    //========== ATTENDANCE PAGE LOAD METHOD ==========//
    @RequestMapping(value={"/attendance"})
    public String attendancePage(AttendanceCommand cmd,EmployeeCommand cmd2,Model model) throws ParseException{
    model.addAttribute("command",cmd);
    model.addAttribute("fileUpload",cmd2);
    Integer shiftId = shiftService.findAllShift().get(0).getShiftId();
    model.addAttribute("allEmployee",employeeService.findByProp("empShift", shiftId));
    model.addAttribute("allDepartment",departmentService.findAllDepartment());
    model.addAttribute("currentMonth",new SimpleDateFormat("M").format(cal.getTime())); // searching currrent monthly attendance from jstl SQL from jsp page
    model.addAttribute("currentDate",new SimpleDateFormat("dd").format(cal.getTime())); // searching currrent monthly attendance from jstl SQL from jsp page
    model.addAttribute("currentYear",new SimpleDateFormat("MMM-YYYY").format(cal.getTime()));  //Showing searched date on main page date and year before search
    model.addAttribute("currentMonthAndYear",new SimpleDateFormat("YYYY-MM").format(cal.getTime())); // keeping the default value of intp type month before search
    model.addAttribute("allShifts",shiftService.findAllShift());
    
    numberOfMonth(Integer.parseInt(new SimpleDateFormat("YYYY").format(cal.getTime())),Integer.parseInt(new SimpleDateFormat("M").format(cal.getTime())));
    String  holidays[]= shiftService.findShiftById(shiftId).getShiftHolidays().split(",");
    Map <Integer,String> maping = new HashMap();
    for(int day=0; day<=number_Of_DaysInMonth; day++){
   
    String dateString = String.format("%d-%d-%d", Integer.parseInt(new SimpleDateFormat("YYYY").format(cal.getTime())), Integer.parseInt(new SimpleDateFormat("M").format(cal.getTime())), day);
    Date date = new SimpleDateFormat("yyyy-M-d").parse(dateString);
    String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
    
    if(Arrays.asList(holidays).contains(dayOfWeek)){
        maping.put(day, "off");
    }else{
        maping.put(day, "on");
    }
  
}
     model.addAttribute("holidaysStatus",maping); //Sending for <TH> TAG number of month with off and on days
    cal.setTime(cal.getTime());
    calendar.setTime(cal);
    int numDays = calendar.getActualMaximum(Calendar.DATE);
    model.addAttribute("numberOfDays",numDays);
    
    
    List <Employee> allEmployee = employeeService.findByProp("empShift", shiftId);
    Map<String,List> map = new HashMap();
    Map<String,String> holyMapping = new HashMap();
    for (Employee employeeId : allEmployee){
    List <Attendance> allAttendanceRow = attendanceService.findByMultiProp2("atdMonthNumber" ,"atdYear","atdAcnumber","shiftId",new SimpleDateFormat("MM").format(cal.getTime()),new SimpleDateFormat("YY").format(cal.getTime()),employeeId.getEmpId(),shiftId);
    
    //List <Attendance> allAttendanceRow = attendanceService.findByProp("atdAcnumber", employeeId.getEmpId());
    map.put(employeeId.getEmpName(), allAttendanceRow);
    
    }
   
    model.addAttribute("keyAndValue",map);
    model.addAttribute("holyDays",holyMapping);
    return "payroll/emp-attendance";
    }
   
    
    
    //@@@@@@@@@@@@@@@@@@@@@@@@ ATTENDANCE PAGE LOAD METHOD @@@@@@@@@@@@@@@@@@@@//
    @RequestMapping(value={"/searchByName"})
    public String searchByName(@RequestParam("shiftid")int shiftid,@RequestParam("id") int id,@RequestParam("date") String month,AttendanceCommand cmd,EmployeeCommand cmd2,Model model) throws ParseException{
    Attendance atd = new Attendance();
    String dateSplit[] = month.split("-");
    
    //geting number of days from a amonth, calling a method 
    numberOfMonth(Integer.parseInt(dateSplit[0]),Integer.parseInt(dateSplit[1]));
    model.addAttribute("numberOfDays",number_Of_DaysInMonth);
    
    model.addAttribute("command",cmd);
    model.addAttribute("fileUpload",cmd2);
    model.addAttribute("allEmployee",employeeService.findByProp("empShift", shiftid));
    model.addAttribute("allDepartment",departmentService.findAllDepartment());
    model.addAttribute("allShifts",shiftService.findAllShift());
    Map<String,List> map = new HashMap();
    Map <Integer,String> maping = new HashMap();
    if(!month.equals("")){//=========================START searching by DATE IF ITS NOT NULL ELSE IT WILL SHOW ERROR DATE IS MUST=======================//
   
    //START getting number of days with off and on for <TH> TAGS
    numberOfMonth(Integer.parseInt(dateSplit[0]),Integer.parseInt(dateSplit[1]));
    String  holidays[]= shiftService.findShiftById(shiftid).getShiftHolidays().split(",");
    
    for(int day=0; day<=number_Of_DaysInMonth; day++){

            String dateString = String.format("%d-%d-%d", Integer.parseInt(dateSplit[0]),Integer.parseInt(dateSplit[1]), day);
            Date date = new SimpleDateFormat("yyyy-M-d").parse(dateString);
            String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);

            if(Arrays.asList(holidays).contains(dayOfWeek)){
                maping.put(day, "off");
            }else{
                maping.put(day, "on");
            }
    }
    //END getting number of days with off and on for <TH> TAGS
    if(id==0){//=========================START searching by employee id=======================//
   
    List <Employee> allEmployee = employeeService.findByProp("empShift", shiftid);
    for (Employee employeeId : allEmployee){
    List <Attendance> allAttendanceRow = attendanceService.findByMultiProp2("atdMonthNumber" ,"atdYear","atdAcnumber","shiftId",dateSplit[1],removeChar(dateSplit[0]),employeeId.getEmpId(),shiftid);
    map.put(employeeId.getEmpName(), allAttendanceRow);
    model.addAttribute("shiftRow",shiftService.findShiftById(shiftid));
    }
    model.addAttribute("currentYear", this.dateConvert(dateSplit[1])+"-"+dateSplit[0]); // Showing searched date on main page date and year after search
    model.addAttribute("currentMonthAndYear",month);  // keeping the default value of intp type month after search
    }else{
    Employee emp = employeeService.findById(id);
    List <Attendance> allAttendanceRow = attendanceService.findByMultiProp2("atdMonthNumber" ,"atdYear","atdAcnumber","shiftId",dateSplit[1],removeChar(dateSplit[0]),id,shiftid);
    map.put(emp.getEmpName(), allAttendanceRow);
    model.addAttribute("employeeRow",employeeService.findByPropRow("empId", id));
    model.addAttribute("allAttendance",attendanceService.findAll());
    model.addAttribute("shiftRow",shiftService.findShiftById(shiftid));
    model.addAttribute("currentMonthAndYear",month);  // keeping the default value of intp type month after search
    model.addAttribute("currentYear", this.dateConvert(dateSplit[1])+"-"+dateSplit[0]); // Showing searched date on main page date and year after search
    }
    }else{
    model.addAttribute("currentYear", "DATE IS NOT DEFINED!"); // Showing searched date on main page date and year after search
    }
    //=========================ENDING searching by DATE IF ITS NOT NULL=======================//
    model.addAttribute("holidaysStatus",maping); //Sending for <TH> TAG number of month with off and on days
    model.addAttribute("keyAndValue",map);
    
    return "payroll/emp-attendance";
    }
    
    //========== ADD ATTENDANCE TO DATABASE MANUALLY ADD ATTENDANCE METHOD ==========//
    @RequestMapping(value={"/addAttendance"})
    public String addAttendance(@ModelAttribute("command")AttendanceCommand cmd,Model model){
    try{
    model.addAttribute("command",cmd);
    Attendance atd = cmd.getAttendance();
    attendanceService.save(atd);
    return "redirect:attendance?act=success";
    }catch(Exception e){
    return "redirect:attendance?act=wrong"+e.getMessage();
    }
    }
    
    //========== IMPORT ATTENDANCE FROM XLS FILE TO DATABASE MANUALLY IMPORT ATTENDANCE METHOD ==========//
    @RequestMapping(value={"/importAttendance"})
    public String imports(@ModelAttribute("command") @Validated EmployeeCommand cmd,Model model,BindingResult result){
    try{ 
    model.addAttribute("command",cmd);
    int rand = r.nextInt();
    MultipartFile multipartFile = cmd.getEmpImage();
    String uploadPath = context.getRealPath("") + "static" + File.separator + "uploaded" + File.separator ;
    FileCopyUtils.copy(cmd.getEmpImage().getBytes(), new File(uploadPath+rand+cmd.getEmpImage().getOriginalFilename()));
    String fileName = multipartFile.getOriginalFilename();
    File file = new File("C:\\Users\\azhar baloch\\Documents\\NetBeansProjects\\PayrollSystem\\target\\PayrollSystem-1.0-SNAPSHOT\\static\\uploaded\\attendance.xls");
    String a = uploadService.uploadFileData(uploadPath+rand+fileName);
    return "redirect:attendance?act=success"+a;
    }catch(IOException e){
    return "redirect:attendance?act=wrong"; 
    }
    }
    
   
    	
    public String dateConvert(String month){
        switch (month) {
            case "01":
                return "Jan";
            case "02":
                return "Feb";
            case "03":
                return "Mar";
            case "04":
                return "Apr";
            case "05":
                return "May";
            case "06":
                return "Jun";
            case "07":
                return "Jul";
            case "08":
                return "Aug";
            case "09":
                return "Sep";
            case "10":
                return "Oct";
            case "11":
                return "Nov";
            default:
                return "Dec";
        }
    }
    public String removeChar(String str) {
       String strNew = str.replaceFirst("20", "");
       return strNew;
    }
    
    
   @RequestMapping(value = "/getEmployeeByShift")
   @ResponseBody 
   public Object findEmployeeByShiftOnIjax(@RequestParam("shiftid")int shiftid) {
       Map <Integer,String> employees =new HashMap();
       
      List <Employee> allEmployee = employeeService.findByProp("empShift", shiftid);
           
       for(Employee emp: allEmployee){
           employees.put(emp.getEmpId(), emp.getEmpName());
       } 
        Gson gson = new Gson();
        String json = gson.toJson(employees);
      // System.out.println(employees.values());
       return json;
    //return ;
   }
   
   
   
   public void numberOfMonth(int year, int month){
    switch (month) {
            case 1:
                MonthOfName = "January";
                number_Of_DaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_Of_DaysInMonth = 29;
                } else {
                    number_Of_DaysInMonth = 28;
                }
                break;
            case 3:
                MonthOfName = "March";
                number_Of_DaysInMonth = 31;
                break;
            case 4:
                MonthOfName = "April";
                number_Of_DaysInMonth = 30;
                break;
            case 5:
                MonthOfName = "May";
                number_Of_DaysInMonth = 31;
                break;
            case 6:
                MonthOfName = "June";
                number_Of_DaysInMonth = 30;
                break;
            case 7:
                MonthOfName = "July";
                number_Of_DaysInMonth = 31;
                break;
            case 8:
                MonthOfName = "August";
                number_Of_DaysInMonth = 31;
                break;
            case 9:
                MonthOfName = "September";
                number_Of_DaysInMonth = 30;
                break;
            case 10:
                MonthOfName = "October";
                number_Of_DaysInMonth = 31;
                break;
            case 11:
                MonthOfName = "November";
                number_Of_DaysInMonth = 30;
                break;
            case 12:
                MonthOfName = "December";
                number_Of_DaysInMonth = 31;
        }
}
    
}
