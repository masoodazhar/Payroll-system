/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.controller;

import com.payroll.payrollsystem.command.AttendanceCommand;
import com.payroll.payrollsystem.command.DepartmentCommand;
import com.payroll.payrollsystem.command.EmployeeCommand;
import com.payroll.payrollsystem.command.LeaveCommand;
import com.payroll.payrollsystem.command.PaymentSettingCommand;
import com.payroll.payrollsystem.command.SalaryCommand;
import com.payroll.payrollsystem.command.ShiftCommand;
import com.payroll.payrollsystem.domain.Attendance;
import com.payroll.payrollsystem.domain.Department;
import com.payroll.payrollsystem.domain.Employee;
import com.payroll.payrollsystem.domain.Leave;
import com.payroll.payrollsystem.domain.PaymentSetting;
import com.payroll.payrollsystem.domain.Salary;
import com.payroll.payrollsystem.domain.Shift;
import com.payroll.payrollsystem.services.AttendanceService;
import com.payroll.payrollsystem.services.DepartmentService;
import com.payroll.payrollsystem.services.EmployeeService;
import com.payroll.payrollsystem.ie.FileUploadService;
import com.payroll.payrollsystem.services.LeaveService;
import com.payroll.payrollsystem.services.PaymentSettingService;
import com.payroll.payrollsystem.services.SalaryService;
import com.payroll.payrollsystem.services.ShiftService;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author azhar baloch
 */
@Controller
public class BasicController {
     Random r = new Random();
    @Autowired
    EmployeeService employeeService;
    
    @Autowired
    AttendanceService attendanceService;
    
    @Autowired
    LeaveService LeaveService;
    
    @Autowired
    DepartmentService departmentService;
    
    @Autowired
    ServletContext context; 
    
    @Autowired
    FileUploadService uploadService;
    
    @Autowired
    PaymentSettingService paymentSettingService; 
    
    @Autowired
    ShiftService ShiftService; 
    
    @Autowired
    SalaryService salaryService; 
    
    @RequestMapping(value={"/","index","home"}, method=RequestMethod.GET)
    public String index(){
    return "payroll/index";
    }
    
    
    
     //========== EMPLOYEE PAGE LOAD METHOD ==========//
    @RequestMapping(value={"/employee"})
    public String employeePage(EmployeeCommand cmd,Model model){
    model.addAttribute("command",cmd);
    model.addAttribute("allDepartment",departmentService.findAllDepartment());
    model.addAttribute("allEmployee",employeeService.findAll());
    model.addAttribute("allShift",ShiftService.findAllShift());
    return "payroll/emp-all";
    }
    
     //========== EMPLOYEE DATA SAVE TO DATABASE ADD METHOD ==========//
    @RequestMapping(value={"/addEmployee"})
    public String addemployee(@ModelAttribute("command") @Validated EmployeeCommand cmd,Model model,BindingResult result){
    try{Employee emp = cmd.getEmployee();
    model.addAttribute("command",cmd);
    int rand = r.nextInt();
    MultipartFile multipartFile = cmd.getEmpImage();
    String uploadPath = context.getRealPath("") + File.separator + "static" + File.separator + "uploaded" + File.separator ;
    FileCopyUtils.copy(cmd.getEmpImage().getBytes(), new File(uploadPath+rand+cmd.getEmpImage().getOriginalFilename()));
    String fileName = rand+multipartFile.getOriginalFilename();
    emp.setEmpImage(fileName);
    employeeService.addEmployee(emp);
    
    model.addAttribute("allEmployee",employeeService.findAll());
    return "redirect:employee?act=success";
    }catch(Exception e){
    return "redirect:employee?act=wrong"+e.getMessage(); 
    }
    }
 
    
    //========== EDIT EMPLOYEE PAGE LOAD METHOD WITH GET URL ID ==========//
    @RequestMapping(value={"/editEmployee"})
    public String editEmployeePage(@RequestParam("id")int id,EmployeeCommand cmd,Model model){
    model.addAttribute("employeeRow",employeeService.findById(id));
    model.addAttribute("allDepartment",departmentService.findAllDepartment());
    model.addAttribute("allShift",ShiftService.findAllShift());
    model.addAttribute("command",cmd);
    return "payroll/edit-employee";
    }
    
    //========== EDIT EMPLOYEE FROM DATABASE EDIT EMPLOYEE METHOD ==========//
    @RequestMapping(value={"/EditEmployeeRecord"})
    public String editEmployeeRecord(@ModelAttribute("command") @Validated EmployeeCommand cmd,Model model,BindingResult result){
    try{
    Employee emp = cmd.getEmployee();
    //int rand = r.nextInt();
    //MultipartFile multipartFile = cmd.getEmpImage();
    //String uploadPath = context.getRealPath("") + File.separator + "static" + File.separator + "uploaded" + File.separator ;
    //FileCopyUtils.copy(cmd.getEmpImage().getBytes(), new File(uploadPath+rand+cmd.getEmpImage().getOriginalFilename()));
    //String fileName = multipartFile.getOriginalFilename();
    //emp.setEmpImage(rand+fileName);
    employeeService.update(emp);
    return "redirect:employee?act=success";
    }catch(Exception e){
    return "redirect:employee?act=wrong"+e.getMessage(); 
    }
    }
    
    //========== DELETE EMPLOYEE FROM DATABASE DELETE EMPLOYEE METHOD ==========//
    @RequestMapping(value={"/deleteEmployee"})
    public String editEmployeeRecord(@RequestParam("id") int id){
    try{
    employeeService.delete(id);
    return "redirect:employee?act=success";
    }catch(Exception e){
    return "redirect:employee?act=wrong"; 
    }
    }
    
   
    
    //========== LEAVE PAGE LOAD METHOD ==========//
    @RequestMapping(value={"/leave"})
    public String leavePage(LeaveCommand cmd,Model model){
    model.addAttribute("command",cmd);
    model.addAttribute("allEmployee",employeeService.findAll());
    model.addAttribute("allLeave",LeaveService.FindAllLeave());
    return "payroll/emp-leave";
    }
    
    
    //========== EDIT LEAVE PAGE LOAD METHOD ==========//
    @RequestMapping(value={"/editleave"})
    public String editLeavePage(@RequestParam("id")int id,LeaveCommand cmd,Model model){
    model.addAttribute("command",cmd);
    model.addAttribute("allEmployee",employeeService.findAll());
    model.addAttribute("leaveRow",LeaveService.FindLeaveById(id));
    return "payroll/edit-leave"; 
    }
    
    //========== ADD DATA TO DATABASE, ADD LEAVE METHOD ==========//
    @RequestMapping(value={"/addLeave"})
    public String addLeave(@ModelAttribute("command")LeaveCommand cmd,Model model){
    try{
    Leave leave = cmd.getLeave();
    model.addAttribute("command",cmd);
    LeaveService.addLeave(leave);
    model.addAttribute("allEmployee",employeeService.findAll());
    model.addAttribute("leaveRow",LeaveService.FindAllLeave());
    return "redirect:leave?act=success";
    }catch(Exception e){
       return "redirect:leave?act=wrong";
    }
    }
    
    //========== EDIT DATA TO DATABASE, EDIT LEAVE METHOD ==========//
    @RequestMapping(value={"/editLeave"})
    public String editLeave(@ModelAttribute("command")LeaveCommand cmd,Model model){
    try{
    Leave leave = cmd.getLeave();
    model.addAttribute("command",cmd);
    LeaveService.EditLeave(leave);
    return "redirect:leave?act=success";
    }catch(Exception e){
       return "redirect:leave?act=wrong";
    }
    }
    
    //========== DELETE DATA FROM DATABASE, DELETE LEAVE METHOD ==========//
    @RequestMapping(value={"/deleteLeave"})
    public String deleteLeave(@RequestParam("id") int id){
    try{
    LeaveService.deleteLeave(id);
    return "redirect:leave?act=success";
    }catch(Exception e){
       return "redirect:leave?act=wrong";
    }
    }
    
    //========== DEPARTMENT PAGE LOAD METHOD ==========//
    @RequestMapping(value={"/department"})
    public String departmentPage(DepartmentCommand cmd,Model model){
    model.addAttribute("command",cmd);
    model.addAttribute("allDepartment",departmentService.findAllDepartment());
    return "payroll/emp-departments";
    }
    
    //==========EDIT DEPARTMENT PAGE LOAD METHOD ==========//
    @RequestMapping(value={"/editDepartmentPage"})
    public String editDepartmentPage(@RequestParam("id")int id,DepartmentCommand cmd,Model model){
    model.addAttribute("command",cmd);
    model.addAttribute("departmentRow",departmentService.findDepartmentByID(id));
    return "payroll/edit-department";
    }
    
    //==========ADD DEPARTMENT TO DATABASE, ADD DEPARTMENT METHOD ==========//
    @RequestMapping(value={"/addDepartment"})
    public String addDepartment(DepartmentCommand cmd,Model model){
    try{
    Department dep = cmd.getDepartment();
    departmentService.addDepartment(dep);
    return "redirect:department?act=success";
    }catch(Exception e){
    return "redirect:department?act=wrong";
    }
    }
    
    //==========EDIT DEPARTMENT FROM DATABASE, EDIT DEPARTMENT METHOD ==========//
    @RequestMapping(value={"/editDepartment"})
    public String editDepartment(DepartmentCommand cmd,Model model){
    try{
    Department dep = cmd.getDepartment();
    departmentService.editDepartment(dep);
    return "redirect:department?act=success";
    }catch(Exception e){
    return "redirect:department?act=wrong";
    }
    }
    
    //==========DELETE DEPARTMENT FROM DATABASE, DELETE DEPARTMENT METHOD ==========//
    @RequestMapping(value={"/deleteDepartment"})
    public String deleteDepartment(@RequestParam("id") int id){
    try{
    departmentService.deleteDepartment(id);
    return "redirect:department?act=success";
    }catch(Exception e){
    return "redirect:department?act=wrong";
    }
    }
    
    //==========Trying to Load PaymentSetting Page Load Method==========//
    @RequestMapping(value={"/paymentsetting"})
    public String paymentsettingPage(Model model,PaymentSettingCommand cmd){
    model.addAttribute("command",cmd);
    model.addAttribute("allPatment",paymentSettingService.findAllPayment());
    return "payroll/payment-setting";
    }
    
    //==========Trying to Load EDIT PaymentSetting Page Load Method==========//
    @RequestMapping(value={"/editpaymentsetting"})
    public String editpaymentsettingPage(@RequestParam("id")int id,Model model,PaymentSettingCommand cmd){
    model.addAttribute("command",cmd);
    model.addAttribute("paymentRow",paymentSettingService.findPaymentById(id));
    return "payroll/edit-payment-setting";
    }
    
    //==========ADD paymentSetting ADD PAYMENT Method==========//
    @RequestMapping(value={"/addPaymentsetting"})
    public String addPaymentsetting(Model model,PaymentSettingCommand cmd){
    try{
    PaymentSetting payment = cmd.getPaymentSetting();
    paymentSettingService.addPayment(payment);
    model.addAttribute("command",cmd);
    model.addAttribute("allPatment",paymentSettingService.findAllPayment());
    return "redirect:paymentsetting?act=success";
    }catch(Exception e){
    return "redirect:paymentsetting?act=wrong";
    } 
    }
    
    
    //==========Update paymentSetting Update PAYMENT Method==========//
    @RequestMapping(value={"/updatePaymentsetting"})
    public String updatePaymentsetting(Model model,PaymentSettingCommand cmd){
    try{
    PaymentSetting payment = cmd.getPaymentSetting();
    paymentSettingService.updatePayment(payment);
    model.addAttribute("command",cmd);
    model.addAttribute("allPatment",paymentSettingService.findAllPayment());
    return "redirect:paymentsetting?act=success";
    }catch(Exception e){
    return "redirect:paymentsetting?act=wrong";
    } 
    }
    
    //==========Update paymentSetting Update PAYMENT Method==========//
    @RequestMapping(value={"/deletePaymentsetting"})
    public String deletePaymentsetting(@RequestParam("id")int id,Model model,PaymentSettingCommand cmd){
    try{
    paymentSettingService.deletePayment(id);
    model.addAttribute("command",cmd);
    model.addAttribute("allPatment",paymentSettingService.findAllPayment());
    return "redirect:paymentsetting?act=success";
    }catch(Exception e){
    return "redirect:paymentsetting?act=wrong";
    } 
    }
    
    
    //==========Trying to Load shift Page Load Method==================================================//
    @RequestMapping(value={"/shift"})
    public String shiftPage(Model model,ShiftCommand cmd){
    model.addAttribute("command",cmd);
    model.addAttribute("allShift",ShiftService.findAllShift());
    return "payroll/shift-page";
    }
    
    @RequestMapping(value={"/editshift"})
    public String editshiftPage(@RequestParam("id")int id,Model model,ShiftCommand cmd){
    model.addAttribute("command",cmd);
    model.addAttribute("ShiftRow",ShiftService.findShiftById(id));
    return "payroll/edit-shift";
    }
    
     //==========ADDING Shift ADD Shift Method==========//
    @RequestMapping(value={"/addshift"})
    public String addshift(Model model,ShiftCommand cmd){
    try{
    Shift shift = cmd.getShift();
    ShiftService.addShift(shift);
    model.addAttribute("command",cmd);
    model.addAttribute("allShift",ShiftService.findAllShift());
    return "redirect:shift?act=success";
    }catch(Exception e){
    return "redirect:shift?act=wrong"+e.getMessage();
    } 
    }
    
    
     //==========Update paymentSetting Update PAYMENT Method==========//
    @RequestMapping(value={"/updateshift"})
    public String updateshift(Model model,ShiftCommand cmd){
    try{
    Shift shift = cmd.getShift();
    ShiftService.updateShift(shift);
    model.addAttribute("command",cmd);
    return "redirect:shift?act=success";
    }catch(Exception e){
    return "redirect:shift?act=wrong";
    } 
    }
    
     //==========Update paymentSetting Update PAYMENT Method==========//
    @RequestMapping(value={"/deleteshift"})
    public String deleteshift(@RequestParam("id")int id,Model model,ShiftCommand cmd){
    try{
    ShiftService.deleteShift(id);
    model.addAttribute("command",cmd);
    return "redirect:shift?act=success";
    }catch(Exception e){
    return "redirect:shift?act=wrong";
    } 
    }
    
     //==========Trying to Load shift Page Load Method==================================================//
    @RequestMapping(value={"/salary"})
    public String salaryPage(Model model,SalaryCommand cmd){
    model.addAttribute("command",cmd);
    model.addAttribute("allSalary",salaryService.findAllSalaryJoined());
    model.addAttribute("allPatment",paymentSettingService.findAllPayment());
    model.addAttribute("allShift",ShiftService.findAllShift());
    model.addAttribute("allEmployee",employeeService.findAll());
    return "payroll/salary-page";
    }
    
    @RequestMapping(value={"/editsalary"})
    public String editsalaryPage(@RequestParam("id")int id,Model model,SalaryCommand cmd){
     model.addAttribute("command",cmd);
     model.addAttribute("salaryRow",salaryService.findSalaryById(id));
     model.addAttribute("allPatment",paymentSettingService.findAllPayment());
     model.addAttribute("allShift",ShiftService.findAllShift());
     model.addAttribute("allEmployee",employeeService.findAll());
     return "payroll/edit-salary";
     }
    
     //==========ADDING Salary ADD Salary Method==========//
    @RequestMapping(value={"/addsalary"})
    public String addsalary(Model model,SalaryCommand cmd){
    try{
    Salary sal = cmd.getSalary();
    salaryService.addSalary(sal);
    model.addAttribute("command",cmd);
    model.addAttribute("allSalary",salaryService.findAllSalaryJoined());
    model.addAttribute("allPatment",paymentSettingService.findAllPayment());
    model.addAttribute("allShift",ShiftService.findAllShift());
    model.addAttribute("allEmployee",employeeService.findAll());
    return "redirect:salary?act=success";
    }catch(Exception e){
    return "redirect:salary?act=wrong"+e.getMessage();
    } 
    }
    
    
     //==========Update paymentSetting Update PAYMENT Method==========//
    @RequestMapping(value={"/updatesalary"})
    public String updatesalary(Model model,SalaryCommand cmd){
    try{
    Salary sal = cmd.getSalary();
    salaryService.updateSalary(sal);
    model.addAttribute("command",cmd);
    return "redirect:salary?act=success";
    }catch(Exception e){
    return "redirect:salary?act=wrong";
    } 
    }
    
     //==========Update paymentSetting Update PAYMENT Method==========//
    @RequestMapping(value={"/deletesalary"})
    public String deletesalary(@RequestParam("id")int id,Model model,SalaryCommand cmd){
    try{
    salaryService.deleteSalary(id);
    model.addAttribute("command",cmd);
    return "redirect:salary?act=success";
    }catch(Exception e){
    return "redirect:salary?act=wrong";
    } 
    }
    
    
}
