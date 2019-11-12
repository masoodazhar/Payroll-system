/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.dao;

import com.payroll.payrollsystem.domain.Attendance;
import com.payroll.payrollsystem.rm.AttendanceRowMapper;
import com.payroll.payrollsystem.rm.AttendanceRowMapperDitinct;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class AttendanceDaoImpl extends BaseDao implements AttendanceDao {
SimpleDateFormat month_date = new SimpleDateFormat("dd-MMM-yy ", Locale.ENGLISH);
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//String actualDate = "2018-11-14";

    
    @Override
    public void save(Attendance atd) {
        String sql = "INSERT INTO attendance ( atdAcnumber, atdName,atdDepartment, atdDate, atdTime,atdCheckin,atdCheckout,atdStatus, atdMonth, atdYear, atdMonthNumber,atdDay,atdDayNumber ) VALUES ("
                + ":atdAcnumber,:atdName, :atdDepartment,:atdDate,:atdTime,:atdCheckin,:atdCheckout,:atdStatus, :atdMonth, :atdYear, :atdMonthNumber, :atdDay, :atdDayNumber ) ";
        Map m = new HashMap();
        m.put("atdAcnumber",atd.getAtdAcnumber());
        m.put("atdDepartment",atd.getAtdDepartment());
        m.put("atdTime",atd.getAtdCheckin()+" "+atd.getAtdCheckout());
        m.put("atdCheckin",atd.getAtdCheckin());
        m.put("atdCheckout",atd.getAtdCheckout());
        m.put("atdStatus",atd.getAtdStatus());
        m.put("atdName",atd.getAtdName());
        
        
       
        Date date = null;
         
        try{
        date = sdf.parse(atd.getAtdDate());
        } catch (ParseException ex) {
        Logger.getLogger(AttendanceDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String dateWith_month_name = month_date.format(date);
        String[] dateSep = dateWith_month_name.split("-");
        String[] monthNumber = atd.getAtdDate().split("-");
         m.put("atdMonth", dateSep[1]);
	m.put("atdYear", dateSep[2]);
	m.put("atdMonthNumber", monthNumber[1]);
	m.put("atdDayNumber", dateSep[0]);
        m.put("atdDate",dateWith_month_name);
        m.put("atdDay",sayDayName(date));
        KeyHolder kh = new GeneratedKeyHolder();
        SqlParameterSource ps = new MapSqlParameterSource(m);
        super.getNamedParameterJdbcTemplate().update(sql, ps, kh);
        Integer atdID = kh.getKey().intValue();
        atd.setAtdId(atdID);
        
    }

    @Override
    public void update(Attendance atd) {
       String sql = "UPDATE attendance set atdAcnumber=:atdAcnumber,atdDepartment=:atdDepartment, "
               + "atdDate=:atdDate, atdName=:atdName, atdTime=:atdTime, atdStatus=:atdStatus, atdMonth=:atdMonth, atdYear=:atdYear, atdMonthNumber=:atdMonthNumber,atdDay=:atdDay WHERE atdId=:atdId";
        Map m = new HashMap();
        m.put("atdAcnumber",atd.getAtdAcnumber());
        m.put("atdDepartment",atd.getAtdDepartment());
       
        m.put("atdTime",atd.getAtdTime());
        m.put("atdName",atd.getAtdName());
        m.put("atdStatus",atd.getAtdStatus());
        m.put("atdId",atd.getAtdId());
        m.put("atdMonth", "m");
	m.put("atdYear", "y");
	m.put("atdMonthNumber", "mn");
         Date date = null;
        try{
        date = sdf.parse(atd.getAtdDate());
        } catch (ParseException ex) {
        Logger.getLogger(AttendanceDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        String dateWith_month_name = month_date.format(date);
        m.put("atdDate",dateWith_month_name);
        m.put("atdDay","d");
        super.getNamedParameterJdbcTemplate().update(sql, m);
    }

    @Override
    public void delete(Attendance atd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Integer atdId) {
         String sql = "DELETE FROM attendance WHERE atdId=?";
       getJdbcTemplate().update(sql,atdId);
    }

    @Override
    public Attendance findById(Integer atdId) {
        String sql = "SELECT * FROM attendance WHERE atdId=?";
        return getJdbcTemplate().queryForObject(sql,new AttendanceRowMapper(),atdId); 
    }

    @Override
    public List<Attendance> findAll() {
       String sql = "SELECT employee.empShift, shifts.*, attendance.* , salary.salStartingSalary  FROM employee INNER JOIN shifts ON employee.empShift=shifts.shiftId INNER JOIN salary ON employee.empId = salary.salEmpId INNER JOIN attendance WHERE attendance.atdAcnumber=employee.empId";
       return getJdbcTemplate().query(sql,new  AttendanceRowMapper());
    }

    @Override
    public List<Attendance> findByProp(String propName, Object propValue) {
      String sql = "SELECT employee.empShift, shifts.*, attendance.* FROM employee INNER JOIN shifts ON employee.empShift=shifts.shiftId INNER JOIN attendance WHERE attendance.atdAcnumber=employee.empId and "+propName+"=?";
      return getJdbcTemplate().query(sql,new AttendanceRowMapper(),propValue); 
    }

    @Override
    public Attendance findByPropRow(String propName, Object propValue) {
     String sql = "SELECT employee.empId, employee.empName, attendance.* FROM employee INNER JOIN attendance WHERE "+propName+"=?";
        Attendance atd = getJdbcTemplate().queryForObject(sql,new AttendanceRowMapper(),propValue); 
     return atd;
    }

    @Override
    public List<Attendance> findByMultiProp(String propName, String propName2,String propName3, Object propValue, Object propValue2,Object propValue3) {
         String sql = "SELECT * FROM attendance WHERE "+propName+"=? and "+propName2+"=? and "+propName3+"=?";
        return getJdbcTemplate().query(sql,new AttendanceRowMapper(),propValue,propValue2,propValue3); 
    }

    @Override
    public List<Attendance> findByMultiProp2(String monthNumber, String year, String AccountNumber, String shifts, Object monthNumberVal, Object yearVal, Object accountNumberVal, Object shiftsVal) {
        String sql = "SELECT employee.empShift, shifts.*, attendance.* , salary.salStartingSalary  FROM employee INNER JOIN shifts ON employee.empShift=shifts.shiftId INNER JOIN salary ON employee.empId = salary.salEmpId INNER JOIN attendance WHERE attendance.atdAcnumber=employee.empId and attendance."+monthNumber+"=? and attendance."+year+"=? and attendance."+AccountNumber+"=? and shifts."+shifts+"=?";
                    //SELECT employee.empId, employee.empName, attendance.* FROM employee INNER JOIN attendance ON employee.empId=attendance.atdAcnumber INNER JOIN shifts ON employee.empShift=shifts.shiftId
        return getJdbcTemplate().query(sql,new AttendanceRowMapper(),monthNumberVal,yearVal,accountNumberVal,shiftsVal); 
    }
 
    @Override
    public int addMonthYear(){
//         String sql3 = "UPDATE attendance SET attendance.atdDate = TRIM(attendance.atdDate) WHERE attendance.atdDay ='d'";
//        int s2= getJdbcTemplate().update(sql3);
//        
//        String sqls ="UPDATE attendance SET attendance.atdDayNumber =  SUBSTRING_INDEX(SUBSTRING_INDEX(atdDate, '-', 1), '-', -1), attendance.atdMonth = SUBSTRING_INDEX(SUBSTRING_INDEX(atdDate, '-', 2), '-', -1) WHERE attendance.atdDayNumber='dn'";
//        int ss= getJdbcTemplate().update(sqls);
//        
//       // String sql ="UPDATE attendance SET attendance.atdYear = SUBSTRING_INDEX(SUBSTRING_INDEX(atdDate, '-', 3), '-', -1), attendance.atdMonth = SUBSTRING_INDEX(SUBSTRING_INDEX(atdDate, '-', 2), '-', -1), attendance.atdDayNumber =  SUBSTRING_INDEX(SUBSTRING_INDEX(atdDate, '-', 1), '-', -1), attendance.atdMonth = SUBSTRING_INDEX(SUBSTRING_INDEX(atdDate, '-', 2), '-', -1) WHERE attendance.atdMonth='m' and attendance.atdYear='y' and attendance.atdMonthNumber='mn' and attendance.atdDayNumber='dn'";
//        String sql ="UPDATE attendance SET attendance.atdYear = SUBSTRING_INDEX(SUBSTRING_INDEX(atdDate, '-', 3), '-', -1), attendance.atdMonth = SUBSTRING_INDEX(SUBSTRING_INDEX(atdDate, '-', 2), '-', -1), attendance.atdDayNumber =  SUBSTRING_INDEX(SUBSTRING_INDEX(atdDate, '-', 1), '-', -1) WHERE attendance.atdMonth='m' and attendance.atdYear='y' and attendance.atdMonthNumber='mn' and attendance.atdDayNumber='dn'";
//        int s= getJdbcTemplate().update(sql);
//        
//        String sql2 = "UPDATE attendance SET attendance.atdMonthNumber = IF(month(str_to_date(SUBSTRING_INDEX(SUBSTRING_INDEX(atdDate, '-', 2), '-', -1),'%b')) < 10, CONCAT('0',month(str_to_date(SUBSTRING_INDEX(SUBSTRING_INDEX(atdDate, '-', 2), '-', -1),'%b'))),month(str_to_date(SUBSTRING_INDEX(SUBSTRING_INDEX(atdDate, '-', 2), '-', -1),'%b'))),attendance.atdDay = DAYNAME(CONCAT(SUBSTRING_INDEX(SUBSTRING_INDEX(atdDate, '-', 3), '-', -1),'-',month(str_to_date(SUBSTRING_INDEX(SUBSTRING_INDEX(atdDate, '-', 2), '-', -1),'%b')),'-',SUBSTRING_INDEX(SUBSTRING_INDEX(atdDate, '-', 1), '-', -1)) ) WHERE atdMonthNumber = 'mn' and attendance.atdDay='d'";
//        int s1= getJdbcTemplate().update(sql2);
//        
//       
////        
////        String sql4 = "UPDATE attendance SET attendance.atdDay = DAYNAME(CONCAT(SUBSTRING_INDEX(SUBSTRING_INDEX(atdDate, '-', 3), '-', -1),'-',month(str_to_date(SUBSTRING_INDEX(SUBSTRING_INDEX(atdDate, '-', 2), '-', -1),'%b')),'-',SUBSTRING_INDEX(SUBSTRING_INDEX(atdDate, '-', 1), '-', -1)) ) WHERE attendance.atdDay='d'";
////        int s3= getJdbcTemplate().update(sql4);
//        return s+s1+s2;
return 0;
    }
    
    public static String sayDayName(Date d) {
      DateFormat f = new SimpleDateFormat("EEEE");
      try {
        return f.format(d);
      }
      catch(Exception e) {
        e.printStackTrace();
        return "";
      }
 
     }   
}
