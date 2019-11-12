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
public class Shift {
    
private Integer shiftId;
private Integer shiftStatus;
private String shiftEndtime;
private String shiftHalp;
private String shiftLate;
private String shiftName;
private String shiftStarttime;
private Float shiftHoursd;
private Float shiftHoursm;

private String shiftHolidays;
        

    public String getShiftHolidays() {
        return shiftHolidays;
    }

    public void setShiftHolidays(String shiftHolidays) {
        this.shiftHolidays = shiftHolidays;
    }

   

    public Shift() {
        
    }

    public Integer getShiftId() {
        return shiftId;
    }

    public void setShiftId(Integer shiftId) {
        this.shiftId = shiftId;
    }

    public Integer getShiftStatus() {
        return shiftStatus;
    }

    public void setShiftStatus(Integer shiftStatus) {
        this.shiftStatus = shiftStatus;
    }

    public String getShiftEndtime() {
        return shiftEndtime;
    }

    public void setShiftEndtime(String shiftEndtime) {
        this.shiftEndtime = shiftEndtime;
    }

    public String getShiftHalp() {
        return shiftHalp;
    }

    public void setShiftHalp(String shiftHalp) {
        this.shiftHalp = shiftHalp;
    }

    public String getShiftLate() {
        return shiftLate;
    }

    public void setShiftLate(String shiftLate) {
        this.shiftLate = shiftLate;
    }

    public String getShiftName() {
        return shiftName;
    }

    public void setShiftName(String shiftName) {
        this.shiftName = shiftName;
    }

    public String getShiftStarttime() {
        return shiftStarttime;
    }

    public void setShiftStarttime(String shiftStarttime) {
        this.shiftStarttime = shiftStarttime;
    }

    public Float getShiftHoursd() {
        return shiftHoursd;
    }

    public void setShiftHoursd(Float shiftHoursd) {
        this.shiftHoursd = shiftHoursd;
    }

    public Float getShiftHoursm() {
        return shiftHoursm;
    }

    public void setShiftHoursm(Float shiftHoursm) {
        this.shiftHoursm = shiftHoursm;
    }


}
