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
public class PaymentSetting {
   
private  Integer payId;
private  String payName;
private  Integer payOvertimerate;
private  String payPaid;
private  String payPaymentmethod;
private  Integer payStatus;

    public PaymentSetting() {
    }



    public Integer getPayId() {
        return payId;
    }

    public void setPayId(Integer payId) {
        this.payId = payId;
    }

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName;
    }

    public Integer getPayOvertimerate() {
        return payOvertimerate;
    }

    public void setPayOvertimerate(Integer payOvertimerate) {
        this.payOvertimerate = payOvertimerate;
    }

    public String getPayPaid() {
        return payPaid;
    }

    public void setPayPaid(String payPaid) {
        this.payPaid = payPaid;
    }

    public String getPayPaymentmethod() {
        return payPaymentmethod;
    }

    public void setPayPaymentmethod(String payPaymentmethod) {
        this.payPaymentmethod = payPaymentmethod;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }




}
