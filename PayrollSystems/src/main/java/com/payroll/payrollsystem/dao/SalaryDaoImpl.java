/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.dao;

import com.payroll.payrollsystem.domain.Salary;
import com.payroll.payrollsystem.rm.SalaryRowMapper;
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
public class SalaryDaoImpl extends BaseDao implements SalaryDao{

    @Override
    public void addSalary(Salary sal) {
        String sql = "INSERT INTO salary (salName, salEmpId, salStartingSalary, salPaymentSettingId, salNextReview, salShiftId, salStatus) "
                + "VALUES (:salName, :salEmpId, :salStartingSalary, :salPaymentSettingId, :salNextReview, :salShiftId, :salStatus)";
        Map m = new HashMap();
        m.put("salEmpId", sal.getSalEmpId());
        m.put("salStartingSalary", sal.getSalStartingSalary());
        m.put("salPaymentSettingId", sal.getSalPaymentSettingId());
        m.put("salNextReview", sal.getSalNextReview());
        m.put("salShiftId", sal.getSalShiftId());
        m.put("salName", sal.getSalName());
        m.put("salStatus", sal.getSalStatus());
        KeyHolder kh = new GeneratedKeyHolder();
        SqlParameterSource ps = new MapSqlParameterSource(m);
        super.getNamedParameterJdbcTemplate().update(sql, ps, kh);
        Integer salId = kh.getKey().intValue();
        sal.setSalId(salId);
    }

    @Override
    public void updateSalary(Salary sal) {
         String sql = "UPDATE salary SET salEmpId=:salEmpId, salStartingSalary=:salStartingSalary, salPaymentSettingId=:salPaymentSettingId, salNextReview=:salNextReview, "
                 + "salShiftId=:salShiftId,salName=:salName, salStatus=:salStatus WHERE salId=:salId";
        Map m = new HashMap();
        m.put("salEmpId", sal.getSalEmpId());
        m.put("salStartingSalary", sal.getSalStartingSalary());
        m.put("salPaymentSettingId", sal.getSalPaymentSettingId());
        m.put("salNextReview", sal.getSalNextReview());
        m.put("salShiftId", sal.getSalShiftId());
        m.put("salName", sal.getSalName());
        m.put("salStatus", sal.getSalStatus());
        m.put("salId", sal.getSalId());
        super.getNamedParameterJdbcTemplate().update(sql, m);
    }

    @Override
    public void deleteSalary(Integer salId) {
        String sql = "DELETE FROM salary WHERE salId=?";
        getJdbcTemplate().update(sql,salId);
    }

    @Override
    public Salary findSalaryById(Integer salId) {
        String sql = "select sal.salId, sal.salPaymentSettingId, sal.salShiftId, sal.salEmpId, sal.salName,sal.salStartingSalary,sal.salNextReview,sal.salStatus,"
                + " emp.empName, shift.shiftName, payment.payName from salary sal inner join employee emp "
                + "inner join shifts shift inner join paymentsetting payment on emp.empId= sal.salEmpId and "
                + "sal.salShiftId = shift.shiftId and sal.salPaymentSettingId = payment.payId WHERE sal.salId=?";
        return getJdbcTemplate().queryForObject(sql,new SalaryRowMapper(), salId);
    }

    @Override
    public List<Salary> findAllSalary() {
        String sql = "SELECT * FROM salary";
        return getJdbcTemplate().query(sql,new SalaryRowMapper());
    }

    @Override
    public List<Salary> findAllSalaryJoined() {
         String sql = "select sal.salId, sal.salPaymentSettingId, sal.salShiftId, sal.salEmpId,  sal.salName,sal.salStartingSalary,sal.salNextReview,sal.salStatus, emp.empName, shift.shiftName, payment.payName "
                 + "from salary sal inner join employee emp inner join shifts shift"
                 + " inner join paymentsetting payment on emp.empId= sal.salEmpId and sal.salShiftId = shift.shiftId and sal.salPaymentSettingId = payment.payId";
         
        return getJdbcTemplate().query(sql,new SalaryRowMapper()); }
    
}
