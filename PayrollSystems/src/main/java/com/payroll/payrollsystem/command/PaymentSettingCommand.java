/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.command;

import com.payroll.payrollsystem.domain.PaymentSetting;

/**
 *
 * @author azhar baloch
 */
public class PaymentSettingCommand {
    PaymentSetting paymentSetting;

    public PaymentSetting getPaymentSetting() {
        return paymentSetting;
    }

    public void setPaymentSetting(PaymentSetting paymentSetting) {
        this.paymentSetting = paymentSetting;
    }
    
    
}
