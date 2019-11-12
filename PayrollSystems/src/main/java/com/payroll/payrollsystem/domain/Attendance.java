/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.domain;

/**
 *
 * @author azhar baloch
 */
public class Attendance {
    
    
private String atdAcnumber;
private String atdDate;
private String atdDepartment;
private String atdName;
private Integer atdId;
private Integer atdStatus;
private String atdTime;
private Integer empId;
private String empName;

private String atdDay;
private String holiDays;
private String atdCheckin;
private String atdCheckout;

private String atdYear;
private String atdMonth;
private String atdMonthNumber;

private String shiftHoursd;
private String shiftLate;
private String shiftHalp;
private String shiftName;
private String shiftId;

    public String getShiftId() {
        return shiftId;
    }

    public void setShiftId(String shiftId) {
        this.shiftId = shiftId;
    }

    public String getAtdMonthNumber() {
        return atdMonthNumber;
    }

    public void setAtdMonthNumber(String atdMonthNumber) {
        this.atdMonthNumber = atdMonthNumber;
    }

    public String getShiftName() {
        return shiftName;
    }

    public void setShiftName(String shiftName) {
        this.shiftName = shiftName;
    }

private String salStartingSalary;

    public String getSalStartingSalary() {
        return salStartingSalary;
    }

    public void setSalStartingSalary(String salStartingSalary) {
        this.salStartingSalary = salStartingSalary;
    }

    public String getShiftLate() {
        return shiftLate;
    }

    public void setShiftLate(String shiftLate) {
        this.shiftLate = shiftLate;
    }

    public String getShiftHalp() {
        return shiftHalp;
    }

    public void setShiftHalp(String shiftHalp) {
        this.shiftHalp = shiftHalp;
    }

    public String getShiftHoursd() {
        return shiftHoursd;
    }

    public void setShiftHoursd(String shiftHoursd) {
        this.shiftHoursd = shiftHoursd;
    }

  

    public String getAtdCheckin() {
        return atdCheckin;
    }

    public void setAtdCheckin(String atdCheckin) {
        this.atdCheckin = atdCheckin;
    }

    public String getAtdCheckout() {
        return atdCheckout;
    }

    public void setAtdCheckout(String atdCheckout) {
        this.atdCheckout = atdCheckout;
    }



    public String getHoliDays() {
        return holiDays;
    }

    public void setHoliDays(String holiDays) {
        this.holiDays = holiDays;
    }

    public String getAtdYear() {
        return atdYear;
    }

    public String getAtdDay() {
        return atdDay;
    }

    public void setAtdDay(String atdDay) {
        this.atdDay = atdDay;
    }

    public void setAtdYear(String atdYear) {
        this.atdYear = atdYear;
    }

    public String getAtdMonth() {
        return atdMonth;
    }

    public void setAtdMonth(String atdMonth) {
        this.atdMonth = atdMonth;
    }

    public String getAtdName() {
        return atdName;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setAtdName(String atdName) {
        this.atdName = atdName;
    }






//private String fileUpload;
//
//    public String getFileUpload() {
//        return fileUpload;
//    }
//
//    public void setFileUpload(String fileUpload) {
//        this.fileUpload = fileUpload;
//    }

    public Attendance() {
    }

    public Attendance(String atdAcnumber, String atdDate, String atdDepartment, Integer atdId, Integer atdStatus, String atdTime) {
       
        this.atdAcnumber = atdAcnumber;
        this.atdDate = atdDate;
        this.atdDepartment = atdDepartment;
        this.atdId = atdId;
        this.atdStatus = atdStatus;
        this.atdTime = atdTime;
    }




    public String getAtdAcnumber() {
        return atdAcnumber;
    }

    public void setAtdAcnumber(String atdAcnumber) {
        this.atdAcnumber = atdAcnumber;
    }

    public String getAtdDate() {
        return atdDate;
    }

    public void setAtdDate(String atdDate) {
        this.atdDate = atdDate;
    }

    public String getAtdDepartment() {
        return atdDepartment;
    }

    public void setAtdDepartment(String atdDepartment) {
        this.atdDepartment = atdDepartment;
    }

    public Integer getAtdId() {
        return atdId;
    }

    public void setAtdId(Integer atdId) {
        this.atdId = atdId;
    }

    public Integer getAtdStatus() {
        return atdStatus;
    }

    public void setAtdStatus(Integer atdStatus) {
        this.atdStatus = atdStatus;
    }

    public String getAtdTime() {
        return atdTime;
    }

    public void setAtdTime(String atdTime) {
        this.atdTime = atdTime;
    }



}

