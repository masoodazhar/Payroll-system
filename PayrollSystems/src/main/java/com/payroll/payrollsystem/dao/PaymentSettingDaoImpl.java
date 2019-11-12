/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.dao;

import com.payroll.payrollsystem.domain.PaymentSetting;
import com.payroll.payrollsystem.rm.PaymentSettingRowMapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

/**
 *
 * @author azhar baloch
 */
@Repository
public class PaymentSettingDaoImpl extends BaseDao implements PaymentSettingDao{

    @Override
    public void addPayment(PaymentSetting payment) {
       String sql ="INSERT INTO paymentsetting (payName, payOvertimerate, payPaid, payPaymentmethod, payStatus) "
               + "VALUES (:payName, :payOvertimerate,:payPaid ,:payPaymentmethod ,:payStatus )";
       Map m=new HashMap();
       m.put("payName", payment.getPayName());
       m.put("payOvertimerate", payment.getPayOvertimerate());
       m.put("payPaid", payment.getPayPaid());
       m.put("payPaymentmethod", payment.getPayPaymentmethod());
       m.put("payStatus", payment.getPayStatus());
       KeyHolder kh = new GeneratedKeyHolder();
        SqlParameterSource ps = new MapSqlParameterSource(m);
        super.getNamedParameterJdbcTemplate().update(sql, ps,kh);
        Integer payId = kh.getKey().intValue();
        payment.setPayId(payId);
    }

    @Override
    public void updatePayment(PaymentSetting payment) {
        String sql ="UPDATE paymentsetting SET payName=:payName, payOvertimerate=:payOvertimerate, "
                + "payPaid=:payPaid, payPaymentmethod=:payPaymentmethod, payStatus=:payStatus WHERE payId=:payId";
       Map m=new HashMap();
       m.put("payName", payment.getPayName());
       m.put("payOvertimerate", payment.getPayOvertimerate());
       m.put("payPaid", payment.getPayPaid());
       m.put("payPaymentmethod", payment.getPayPaymentmethod());
       m.put("payStatus", payment.getPayStatus());
       m.put("payId", payment.getPayId());
       
       super.getNamedParameterJdbcTemplate().update(sql, m);
    }

    @Override
    public void deletePayment(Integer paiId) {
        String sql= "DELETE FROM paymentsetting WHERE payId=?";
        getJdbcTemplate().update(sql,paiId);
    }

    @Override
    public PaymentSetting findPaymentById(Integer paiId) {
        String sql = "SELECT * FROM paymentsetting WHERE payId = ?";
        return getJdbcTemplate().queryForObject(sql, new PaymentSettingRowMapper(),paiId);
    }

    @Override
    public List<PaymentSetting> findAllPayment() {
        String sql = "SELECT * FROM paymentsetting";
        return getJdbcTemplate().query(sql,new PaymentSettingRowMapper());
    }
    
}
