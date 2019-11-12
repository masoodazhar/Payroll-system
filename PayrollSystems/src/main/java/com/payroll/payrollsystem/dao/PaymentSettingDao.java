/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.dao;

import com.payroll.payrollsystem.domain.PaymentSetting;
import java.util.List;

/**
 *
 * @author azhar baloch
 */
public interface PaymentSettingDao {
    public void addPayment(PaymentSetting payment);
    public void updatePayment(PaymentSetting payment);
    public void deletePayment(Integer paiId);
    public PaymentSetting findPaymentById(Integer paiId);
    public List<PaymentSetting> findAllPayment();
}
