/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.dao;

import com.payroll.payrollsystem.domain.Employee;
import com.payroll.payrollsystem.rm.EmployeeRowMapper;
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
public class EmployeeDaoImpl extends BaseDao implements EmployeeDao {

    @Override
    public void save(Employee emp) {
        String sql="INSERT INTO employee (empName, empEmail, empPhone, empJoindate, empCnic, empRole, empStatus,empImage,empDateofbirth,empDepartment, empGender, empJobtitle, empJobtype,empSelf,empShift )"
                + " VALUES (:empName, :empEmail, :empPhone, :empJoindate, :empCnic, :empRole, :empStatus, :empImage, "
                + ":empDateofbirth, :empDepartment, :empGender, :empJobtitle, :empJobtype, :empSelf, :empShift)";
        Map m = new HashMap();
        m.put("empName", emp.getEmpName());
        m.put("empEmail", emp.getEmpEmail());
        m.put("empPhone", emp.getEmpPhone());
        m.put("empJoindate", emp.getEmpJoindate());
        m.put("empRole", emp.getEmpRole());
        m.put("empStatus", emp.getEmpStatus());
        m.put("empImage", emp.getEmpImage());
        m.put("empDateofbirth", emp.getEmpDateofbirth());
        m.put("empDepartment", emp.getEmpDepartment());
        m.put("empGender", emp.getEmpGender());
        m.put("empJobtitle", emp.getEmpJobtitle());
        m.put("empJobtype", emp.getEmpJobtype());
        m.put("empSelf", emp.getEmpSelf());
        m.put("empShift", emp.getEmpShift());
        m.put("empCnic", emp.getEmpCnic());
        KeyHolder kh = new GeneratedKeyHolder();
        SqlParameterSource ps = new MapSqlParameterSource(m);
        super.getNamedParameterJdbcTemplate().update(sql, ps,kh);
        Integer empId = kh.getKey().intValue();
        emp.setEmpId(empId);
    }

    @Override
    public void update(Employee emp) {
      String sql="UPDATE employee set empName=:empName, empEmail=:empEmail, empPhone=:empPhone,empJoindate=:empJoindate, "
              + " empRole=:empRole, empStatus=:empStatus, empCnic=:empCnic, empDateofbirth=:empDateofbirth,empDepartment=:empDepartment, empGender=:empGender, empJobtitle=:empJobtitle, empJobtype=:empJobtype,empSelf=:empSelf,empShift=:empShift  WHERE empId=:empId";
        Map m = new HashMap();
        m.put("empName", emp.getEmpName());
        m.put("empEmail", emp.getEmpEmail());
        m.put("empPhone", emp.getEmpPhone());
        m.put("empJoindate", emp.getEmpJoindate());
        m.put("empRole", emp.getEmpRole());
        m.put("empStatus", emp.getEmpStatus());
        m.put("empId", emp.getEmpId());
        m.put("empDateofbirth", emp.getEmpDateofbirth());
        m.put("empDepartment", emp.getEmpDepartment());
        m.put("empGender", emp.getEmpGender());
        m.put("empJobtitle", emp.getEmpJobtitle());
        m.put("empJobtype", emp.getEmpJobtype());
        m.put("empSelf", emp.getEmpSelf());
        m.put("empShift", emp.getEmpShift());
        m.put("empCnic", emp.getEmpCnic());
        super.getNamedParameterJdbcTemplate().update(sql, m);
    }

    @Override
    public void delete(Employee emp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Integer empId) {
        String sql = "DELETE FROM employee WHERE empId=?";
        getJdbcTemplate().update(sql,empId);
    }

    @Override
    public Employee findById(Integer empId) {
         String sql = "SELECT * FROM employee"
                 + " WHERE empId=?";
        Employee emp = getJdbcTemplate().queryForObject(sql, new EmployeeRowMapper(),empId);
        return emp;
    }

    @Override
    public List<Employee> findAll() {
        String sql = "SELECT * FROM employee";
        return getJdbcTemplate().query(sql,new EmployeeRowMapper());
    }

    @Override
    public List<Employee> findByProp(String propName, Object propValue) {
       String sql = "SELECT * FROM employee"
               + " WHERE "+propName+"=?";
        return getJdbcTemplate().query(sql,new EmployeeRowMapper(),propValue);
    }

    @Override
    public Employee findByPropRow(String propName, Object propValue) {
       String sql = "SELECT * FROM employee WHERE "+propName+"=?";
       Employee emp = getJdbcTemplate().queryForObject(sql,new EmployeeRowMapper(),propValue);
       return emp;
    }
    
}
