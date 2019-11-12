/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.services;

/**
 *
 * @author azhar baloch
 */

public class ExcelTemplateVO {
	
	private Integer employeeId;
	private String employeeName;
	private String address;
	private String country;

    public ExcelTemplateVO() {
    }

    public ExcelTemplateVO(Integer employeeId, String employeeName, String address, String country) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.address = address;
        this.country = country;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
	
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
