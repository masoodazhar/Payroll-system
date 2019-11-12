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
public class AttendanceImport {
private String atdEid;
private String atdAcnumber;
private String atdDate;
private String atdDepartment;
private String atdStatus;
private String atdTime;
private String atdName;

private String atdMonth;
private String atdMonthNumber;
private String atdYear;
private String atdDay;
private String atdDayNumber;
private String atdCheckin;
private String atdCheckout;

    public AttendanceImport() {
    }

    public AttendanceImport(String atdEid, String atdAcnumber, String atdDate, String atdDepartment, String atdStatus, String atdTime, String atdName, String atdMonth, String atdMonthNumber, String atdYear, String atdDay, String atdDayNumber, String atdCheckin, String atdCheckout) {
        this.atdEid = atdEid;
        this.atdAcnumber = atdAcnumber;
        this.atdDate = atdDate;
        this.atdDepartment = atdDepartment;
        this.atdStatus = atdStatus;
        this.atdTime = atdTime;
        this.atdName = atdName;
        this.atdMonth = atdMonth;
        this.atdMonthNumber = atdMonthNumber;
        this.atdYear = atdYear;
        this.atdDay = atdDay;
        this.atdDayNumber = atdDayNumber;
        this.atdCheckin = atdCheckin;
        this.atdCheckout = atdCheckout;
    }

    public String getAtdMonthNumber() {
        return atdMonthNumber;
    }

    public void setAtdMonthNumber(String atdMonthNumber) {
        this.atdMonthNumber = atdMonthNumber;
    }

    public String getAtdDay() {
        return atdDay;
    }

    public void setAtdDay(String atdDay) {
        this.atdDay = atdDay;
    }

    public String getAtdDayNumber() {
        return atdDayNumber;
    }

    public void setAtdDayNumber(String atdDayNumber) {
        this.atdDayNumber = atdDayNumber;
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


    
    
    
    public String getAtdMonth() {
        return atdMonth;
    }

    public void setAtdMonth(String atdMonth) {
        this.atdMonth = atdMonth;
    }

    public String getAtdYear() {
        return atdYear;
    }

    public void setAtdYear(String atdYear) {
        this.atdYear = atdYear;
    }

   

    public String getAtdEid() {
        return atdEid;
    }

    public void setAtdEid(String atdEid) {
        this.atdEid = atdEid;
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

    public String getAtdStatus() {
        return atdStatus;
    }

    public void setAtdStatus(String atdStatus) {
        this.atdStatus = atdStatus;
    }

    public String getAtdTime() {
        return atdTime;
    }

    public void setAtdTime(String atdTime) {
        this.atdTime = atdTime;
    }

    public String getAtdName() {
        return atdName;
    }

    public void setAtdName(String atdName) {
        this.atdName = atdName;
    }

  


}
