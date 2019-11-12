/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.dao;

import com.payroll.payrollsystem.domain.Shift;
import com.payroll.payrollsystem.rm.ShiftRowMapper;
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
public class ShiftDaoImpl extends BaseDao implements ShiftDao{

    @Override
    public void addShift(Shift shift) {
       String sql ="INSERT INTO shifts (shiftName, shiftHoursd, shiftHoursm, shiftStarttime, shiftEndtime, shiftLate, shiftHalp, "
               + "shiftStatus,shiftHolidays, sun, mon, tue, wed, thu, fri, sat) "
               + "VALUES (:shiftName, :shiftHoursd, :shiftHoursm, :shiftStarttime, :shiftEndtime, :shiftLate, :shiftHalp, :shiftStatus,:shiftHolidays, :sun, :mon, :tue, :wed, :thu, :fri, :sat)";
     Map m = new HashMap();
     m.put("shiftName", shift.getShiftName());
     m.put("shiftHoursd", shift.getShiftHoursd());
     m.put("shiftHoursm", shift.getShiftHoursm());
     m.put("shiftStarttime", shift.getShiftStarttime());
     m.put("shiftEndtime", shift.getShiftEndtime());
     m.put("shiftLate", shift.getShiftLate());
     m.put("shiftHalp", shift.getShiftHalp());
     m.put("shiftStatus", shift.getShiftStatus());
     m.put("shiftHolidays", shift.getShiftHolidays());
     
     KeyHolder kh  = new GeneratedKeyHolder();
     SqlParameterSource ps = new MapSqlParameterSource(m);
     super.getNamedParameterJdbcTemplate().update(sql, ps,kh);
     Integer shiftid  = kh.getKey().intValue();
     shift.setShiftId(shiftid);
     
     
    }

    @Override
    public void updateShift(Shift shift) {
         String sql ="UPDATE shifts SET shiftName=:shiftName, shiftHoursd=:shiftHoursd, shiftHoursm=:shiftHoursm, shiftStarttime=:shiftStarttime, shiftEndtime=:shiftEndtime, "
                 + "shiftLate=:shiftLate, shiftHalp=:shiftHalp, shiftStatus=:shiftStatus, shiftHolidays=:shiftHolidays WHERE shiftId=:shiftId";
     Map m = new HashMap();
     m.put("shiftName", shift.getShiftName());
     m.put("shiftHoursd", shift.getShiftHoursd());
     m.put("shiftHoursm", shift.getShiftHoursm());
     m.put("shiftStarttime", shift.getShiftStarttime());
     m.put("shiftEndtime", shift.getShiftEndtime());
     m.put("shiftLate", shift.getShiftLate());
     m.put("shiftHalp", shift.getShiftHalp());
     m.put("shiftStatus", shift.getShiftStatus());
     m.put("shiftHolidays", shift.getShiftHolidays());
     m.put("shiftId", shift.getShiftId());
     super.getNamedParameterJdbcTemplate().update(sql, m);
     
    }

    @Override
    public void deleteShift(Integer shiftId) {
      String sql = "DELETE FROM shifts WHERE shiftId = ?";  
      getJdbcTemplate().update(sql,shiftId);
    }

    @Override
    public Shift findShiftById(Integer shiftId) {
        String sql = "SELECT * FROM shifts WHERE shiftId = ?";
        return getJdbcTemplate().queryForObject(sql, new ShiftRowMapper(),shiftId);
    }

    @Override
    public List<Shift> findAllShift() {
        String sql = "SELECT * FROM shifts";
        return getJdbcTemplate().query(sql, new ShiftRowMapper());
    }
    
}
