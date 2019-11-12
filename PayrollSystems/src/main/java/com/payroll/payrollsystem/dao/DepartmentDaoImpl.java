/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.dao;

import com.payroll.payrollsystem.domain.Department;
import com.payroll.payrollsystem.rm.DepartmentRowMapper;
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
public class DepartmentDaoImpl extends BaseDao implements DepartmentDao{

    @Override
    public void addDepartment(Department dep) {
       
    String sql = "INSERT INTO department (depName, depHead, depNumberofEmployee, depStatus) "
            + "VALUES (:depName, :depHead, :depNumberofEmployee, :depStatus)";
    
        Map m = new HashMap();
        m.putIfAbsent("depName", dep.getDepName());
        m.putIfAbsent("depHead", dep.getDepHead());
        m.putIfAbsent("depNumberofEmployee", dep.getDepNumberofEmployee());
        m.putIfAbsent("depStatus", dep.getDepStatus());
        
        KeyHolder kh = new  GeneratedKeyHolder();
        
        SqlParameterSource ps = new MapSqlParameterSource(m);
        getNamedParameterJdbcTemplate().update(sql, ps,kh);
        Integer depid = kh.getKey().intValue();
        dep.setDepId(depid);
        
    
    }

    @Override
    public void deleteDepartment(Integer dep) {
        String sql= "DELETE FROM department WHERE depId=?";
        getJdbcTemplate().update(sql,dep);
    
    }
//  Employee emp = getJdbcTemplate().queryForObject(sql, new EmployeeRowMapper(),empId);
    @Override
    public Department findDepartmentByID(Integer depid) {
       String sql = "SELECT depId, depNumberofEmployee, depName, depHead, depStatus FROM department WHERE depId = ?";
       Department dep = getJdbcTemplate().queryForObject(sql, new DepartmentRowMapper(),depid);
       
       return dep;
    }

    @Override
    public List<Department> findDepartmentByProp(String prop, String propName) {
     String sql = "SELECT * FROM department WHERE "+prop+" = "+propName+"";
      
     return  getJdbcTemplate().query(sql, new DepartmentRowMapper());
       
      
    }

    @Override
    public List<Department> findAllDepartment() {
        String sql = "SELECT * FROM department";
      
     return  getJdbcTemplate().query(sql, new DepartmentRowMapper());}

    @Override
    public void editDepartment(Department dep) {
         String sql = "UPDATE department set depName=:depName, depHead=:depHead, depNumberofEmployee=:depNumberofEmployee, depStatus=:depStatus WHERE depId=:depId ";
        Map m = new HashMap();
        m.putIfAbsent("depName", dep.getDepName());
        m.putIfAbsent("depHead", dep.getDepHead());
        m.putIfAbsent("depNumberofEmployee", dep.getDepNumberofEmployee());
        m.putIfAbsent("depStatus", dep.getDepStatus());
        m.putIfAbsent("depId", dep.getDepId());
        
        super.getNamedParameterJdbcTemplate().update(sql, m);
    }
    
}
