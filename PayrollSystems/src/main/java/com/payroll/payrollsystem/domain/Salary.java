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
public class Salary {
    private Integer salEmpId;
private Integer salId;
private String salNextReview;
private String salName;
private Integer salPaymentSettingId;
private Integer salShiftId;
private Float salStartingSalary;
private Integer salStatus;

private String salEmpName;
private String salPaymentName;
private String salShiftName;

    public Salary() {
    }

    public String getSalEmpName() {
        return salEmpName;
    }

    public void setSalEmpName(String salEmpName) {
        this.salEmpName = salEmpName;
    }

    public String getSalPaymentName() {
        return salPaymentName;
    }

    public void setSalPaymentName(String salPaymentName) {
        this.salPaymentName = salPaymentName;
    }

    public String getSalShiftName() {
        return salShiftName;
    }

    public void setSalShiftName(String salShiftName) {
        this.salShiftName = salShiftName;
    }

    public String getSalName() {
        return salName;
    }

    public void setSalName(String salName) {
        this.salName = salName;
    }

    public Integer getSalEmpId() {
        return salEmpId;
    }

    public void setSalEmpId(Integer salEmpId) {
        this.salEmpId = salEmpId;
    }

    public Integer getSalId() {
        return salId;
    }

    public void setSalId(Integer salId) {
        this.salId = salId;
    }

    public String getSalNextReview() {
        return salNextReview;
    }

    public void setSalNextReview(String salNextReview) {
        this.salNextReview = salNextReview;
    }

    public Integer getSalPaymentSettingId() {
        return salPaymentSettingId;
    }

    public void setSalPaymentSettingId(Integer salPaymentSettingId) {
        this.salPaymentSettingId = salPaymentSettingId;
    }

    public Integer getSalShiftId() {
        return salShiftId;
    }

    public void setSalShiftId(Integer salShiftId) {
        this.salShiftId = salShiftId;
    }

    public Float getSalStartingSalary() {
        return salStartingSalary;
    }

    public void setSalStartingSalary(Float salStartingSalary) {
        this.salStartingSalary = salStartingSalary;
    }

    public Integer getSalStatus() {
        return salStatus;
    }

    public void setSalStatus(Integer salStatus) {
        this.salStatus = salStatus;
    }



}
