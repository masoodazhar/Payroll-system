/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.controller;

import com.payroll.payrollsystem.command.EmployeeCommand;
import com.payroll.payrollsystem.ie.EmployeeImportService;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author DM Solution
 */
@Controller
public class EmployeeImport {
    
    
    @Autowired
    EmployeeImportService uploadService;
    
    @Autowired
    ServletContext context; 
    
    Random r =new Random();
    
    @RequestMapping(value={"/importEmployees"})
    public String imports(@ModelAttribute("command") @Validated EmployeeCommand cmd,Model model,BindingResult result){
    try{ 
    model.addAttribute("command",cmd);
    int rand = r.nextInt();
    MultipartFile multipartFile = cmd.getEmpImage();
    String uploadPath = context.getRealPath("") + "static" + File.separator + "uploaded" + File.separator ;
    FileCopyUtils.copy(cmd.getEmpImage().getBytes(), new File(uploadPath+rand+cmd.getEmpImage().getOriginalFilename()));
    String fileName = multipartFile.getOriginalFilename();
    File file = new File("C:\\Users\\DM Solution\\Documents\\NetBeansProjects\\PayrollSystems\\target\\PayrollSystem-1.0-SNAPSHOT\\static\\uploaded\\emps.xls");
    String a = uploadService.uploadFileData(uploadPath+rand+fileName);
    model.addAttribute("error",a);
    return "redirect:employee?act=success&error="+a;
    }catch(IOException e){
    return "redirect:employee?act=wrong"; 
    }
    }
}
