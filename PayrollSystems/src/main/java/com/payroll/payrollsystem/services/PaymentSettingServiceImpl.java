/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.services;

import com.payroll.payrollsystem.dao.BaseDao;
import com.payroll.payrollsystem.dao.PaymentSettingDao;
import com.payroll.payrollsystem.domain.PaymentSetting;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author azhar baloch
 */
@Service
public class PaymentSettingServiceImpl extends BaseDao implements PaymentSettingService {
     
    @Autowired
    PaymentSettingDao paymentSettingDao;
    @Override
    public void addPayment(PaymentSetting payment) {
        paymentSettingDao.addPayment(payment);
    }

    @Override
    public void updatePayment(PaymentSetting payment) {
        paymentSettingDao.updatePayment(payment);
    }

    @Override
    public void deletePayment(Integer paiId) {
       paymentSettingDao.deletePayment(paiId);
    }

    @Override
    public PaymentSetting findPaymentById(Integer paiId) {
       return paymentSettingDao.findPaymentById(paiId);
    }

    @Override
    public List<PaymentSetting> findAllPayment() {
       return paymentSettingDao.findAllPayment();
    }
    
}
