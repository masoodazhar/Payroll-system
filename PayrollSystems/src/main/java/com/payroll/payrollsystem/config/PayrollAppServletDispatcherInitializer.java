/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 package com.payroll.payrollsystem.config;


 import javax.servlet.ServletContext;
 import javax.servlet.ServletException;
 import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

 /**
 *
 * @author azhar baloch
 */

public class PayrollAppServletDispatcherInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
   
 
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringRootConfig.class};
    }
    
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringWebConfig.class};
    }
    
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
    
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
