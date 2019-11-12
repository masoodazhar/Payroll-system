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
public class Department {
    
private Integer depId;
private String depName;
private String depHead;
private String depNumberofEmployee;
private Integer depStatus;

    public Department() {
    }



    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepHead() {
        return depHead;
    }

    public void setDepHead(String depHead) {
        this.depHead = depHead;
    }

    public String getDepNumberofEmployee() {
        return depNumberofEmployee;
    }

    public void setDepNumberofEmployee(String depNumberofEmployee) {
        this.depNumberofEmployee = depNumberofEmployee;
    }

    public Integer getDepStatus() {
        return depStatus;
    }

    public void setDepStatus(Integer depStatus) {
        this.depStatus = depStatus;
    }


   

}
