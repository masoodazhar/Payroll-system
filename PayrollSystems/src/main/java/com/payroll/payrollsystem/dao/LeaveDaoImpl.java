/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.dao;

import com.payroll.payrollsystem.domain.Leave;
import com.payroll.payrollsystem.rm.LeaveRowMapper;
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
public class LeaveDaoImpl extends BaseDao implements LeaveDao{

    @Override
    public void addLeave(Leave leave) {
        String sql = "INSERT INTO leav (leaveEmpid,leaveFrom,leaveTo,leaveType,leaveReason,leaveStatus) "
                + "VALUES (:leaveEmpid,:leaveFrom,:leaveTo,:leaveType,:leaveReason,:leaveStatus)";
        
         Map m = new HashMap();
        m.put("leaveEmpid", leave.getLeaveEmpid());
        m.put("leaveFrom", leave.getLeaveFrom());
        m.put("leaveTo", leave.getLeaveTo());
        m.put("leaveType", leave.getLeaveType());
        m.put("leaveStatus", leave.getLeaveStatus());
        m.put("leaveReason", leave.getLeaveReason());
        KeyHolder kh = new GeneratedKeyHolder();
        SqlParameterSource ps = new MapSqlParameterSource(m);
        super.getNamedParameterJdbcTemplate().update(sql, ps,kh);
        Integer leaveId = kh.getKey().intValue();
        leave.setLeaveId(leaveId);
    }

    @Override
    public void EditLeave(Leave leave) {
        String sql = "UPDATE leav set leaveEmpid=:leaveEmpid,leaveReason=:leaveReason,leaveFrom=:leaveFrom,leaveTo=:leaveTo,leaveType=:leaveType,leaveStatus=:leaveStatus "
                + " WHERE leaveId=:leaveId ";
         Map m = new HashMap();
        m.put("leaveEmpid", leave.getLeaveEmpid());
        m.put("leaveFrom", leave.getLeaveFrom());
        m.put("leaveTo", leave.getLeaveTo());
        m.put("leaveType", leave.getLeaveType());
        m.put("leaveStatus", leave.getLeaveStatus());
        m.put("leaveReason", leave.getLeaveReason());
        m.put("leaveId", leave.getLeaveId());
        
        super.getNamedParameterJdbcTemplate().update(sql, m);
    }

    @Override
    public void deleteLeave(Integer leaveId) {
        String sql = "DELETE FROM leav WHERE leaveId=?";
        getJdbcTemplate().update(sql,leaveId);
    }

    @Override
    public Leave FindLeaveById(Integer leaveId) {
         String sql = "SELECT * FROM leav WHERE leaveId=?";
        Leave leave = getJdbcTemplate().queryForObject(sql,new LeaveRowMapper(),leaveId);
        return leave;
    }

    @Override
    public List<Leave> findLeaveByProp(String propName, String PropValue) {
       String sql = "SELECT * FROM leav WHERE "+propName+"=?";
      return getJdbcTemplate().query(sql,new LeaveRowMapper(),PropValue);
    }

    @Override
    public List<Leave> FindAllLeave() {
         String sql = "SELECT * FROM leav";
      return getJdbcTemplate().query(sql,new LeaveRowMapper());
    }
    
}
