/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.domain;

/**
 *
 * @author DM Solution
 */
public class ImportEmployee {
private String empEmail;
private String empJoindate;
private String empName;
private String empPhone;
private String empRole;
private String empImage;
private String empDateofbirth;
private String empDepartment;
private String empGender;
private String empJobtitle;
private String empJobtype;
private String empShift;

    public ImportEmployee() {
    }

    public ImportEmployee(String empEmail, String empJoindate, String empName, String empPhone, String empRole, String empImage, String empDateofbirth, String empDepartment, String empGender, String empJobtitle, String empJobtype, String empShift) {
        this.empEmail = empEmail;
        this.empJoindate = empJoindate;
        this.empName = empName;
        this.empPhone = empPhone;
        this.empRole = empRole;
        this.empImage = empImage;
        this.empDateofbirth = empDateofbirth;
        this.empDepartment = empDepartment;
        this.empGender = empGender;
        this.empJobtitle = empJobtitle;
        this.empJobtype = empJobtype;
        this.empShift = empShift;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpJoindate() {
        return empJoindate;
    }

    public void setEmpJoindate(String empJoindate) {
        this.empJoindate = empJoindate;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    public String getEmpRole() {
        return empRole;
    }

    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }

    public String getEmpImage() {
        return empImage;
    }

    public void setEmpImage(String empImage) {
        this.empImage = empImage;
    }

    public String getEmpDateofbirth() {
        return empDateofbirth;
    }

    public void setEmpDateofbirth(String empDateofbirth) {
        this.empDateofbirth = empDateofbirth;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    public String getEmpGender() {
        return empGender;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }

    public String getEmpJobtitle() {
        return empJobtitle;
    }

    public void setEmpJobtitle(String empJobtitle) {
        this.empJobtitle = empJobtitle;
    }

    public String getEmpJobtype() {
        return empJobtype;
    }

    public void setEmpJobtype(String empJobtype) {
        this.empJobtype = empJobtype;
    }

    public String getEmpShift() {
        return empShift;
    }

    public void setEmpShift(String empShift) {
        this.empShift = empShift;
    }

   
}
