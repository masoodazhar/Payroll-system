/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author azhar baloch
 */
@Configuration
@ComponentScan(basePackages = {"com.payroll.payrollsystem.dao","com.payroll.payrollsystem.services","com.payroll.payrollsystem.ie"})
public class SpringRootConfig {
    
    @Bean
    public BasicDataSource getDataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/payrollsystem");
        ds.setUsername("root");
        ds.setPassword("123456");
        return ds;
    }
    
}
