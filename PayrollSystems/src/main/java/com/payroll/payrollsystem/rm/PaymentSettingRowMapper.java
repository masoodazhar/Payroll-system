/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.rm;

import com.payroll.payrollsystem.dao.BaseDao;
import com.payroll.payrollsystem.domain.PaymentSetting;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author azhar baloch
 */
public class PaymentSettingRowMapper extends BaseDao implements RowMapper<PaymentSetting>{

    @Override
    public PaymentSetting mapRow(ResultSet rs, int i) throws SQLException {
       
        PaymentSetting payment = new PaymentSetting();
        payment.setPayId(rs.getInt("payId"));
        payment.setPayName(rs.getString("payName"));
        payment.setPayOvertimerate(rs.getInt("payOvertimerate"));
        payment.setPayPaid(rs.getString("payPaid"));
        payment.setPayPaymentmethod(rs.getString("payPaymentmethod"));
        payment.setPayStatus(rs.getInt("payStatus"));
        return payment;
    }
    
}
