/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.ie;

import com.payroll.payrollsystem.dao.BaseDao;
import com.payroll.payrollsystem.domain.AttendanceImport;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.springframework.stereotype.Repository;
/**
 *
 * @author azhar baloch
 */
@Repository
public class FileUploadDao extends BaseDao {
    public int deleteRow(String atdAcnumber){
    String sql = "DELETE FROM attendance WHERE atdDate=?";
    int s= getJdbcTemplate().update(sql,atdAcnumber);
    return s;
    }
    
    public void addMonthYear(){
//        String sql ="UPDATE attendance SET attendance.atdYear = SUBSTRING_INDEX(SUBSTRING_INDEX(atdDate, '-', 3), '-', -1), attendance.atdMonth = SUBSTRING_INDEX(SUBSTRING_INDEX(atdDate, '-', 2), '-', -1) WHERE attendance.atdMonth='m' and attendance.atdYear='y' and attendance.atdMonthNumber='mn'";
//        getJdbcTemplate().update(sql);
//        String sql2 = "UPDATE attendance SET attendance.atdMonthNumber = IF(month(str_to_date(SUBSTRING_INDEX(SUBSTRING_INDEX(atdDate, '-', 2), '-', -1),'%b')) < 10, CONCAT('0',month(str_to_date(SUBSTRING_INDEX(SUBSTRING_INDEX(atdDate, '-', 2), '-', -1),'%b'))),month(str_to_date(SUBSTRING_INDEX(SUBSTRING_INDEX(atdDate, '-', 2), '-', -1),'%b'))) WHERE atdMonthNumber = 'mn'";
//        getJdbcTemplate().update(sql2);
//        
//        String sql3 = "UPDATE attendance SET attendance.atdDate = TRIM(attendance.atdDate) WHERE attendance.atdDay ='d'";
//        getJdbcTemplate().update(sql3);
//        
//        String sql4 = "UPDATE attendance SET attendance.atdDay = DAYNAME(CONCAT(SUBSTRING_INDEX(SUBSTRING_INDEX(atdDate, '-', 3), '-', -1),'-',month(str_to_date(SUBSTRING_INDEX(SUBSTRING_INDEX(atdDate, '-', 2), '-', -1),'%b')),'-',SUBSTRING_INDEX(SUBSTRING_INDEX(atdDate, '-', 1), '-', -1)) ) WHERE attendance.atdDay='d'";
//        getJdbcTemplate().update(sql4);
//        
        String sql5 = "UPDATE attendance SET attendance.atdCheckin = SUBSTRING_INDEX(attendance.atdTime, ' ', 1), attendance.atdCheckout = SUBSTRING_INDEX(attendance.atdTime,' ',-1) WHERE attendance.atdCheckin='ci' AND attendance.atdCheckout='co' AND attendance.atdTime<>''";
        getJdbcTemplate().update(sql5);

       
    }
    SimpleDateFormat month_date = new SimpleDateFormat("dd-MMM-yy ", Locale.ENGLISH);
SimpleDateFormat sdf = new SimpleDateFormat("M-dd-yyyy");
//String actualDate = "2018-11-14";
    public String saveFileDataInDB(List<AttendanceImport> employeeList){
		String sql = "INSERT INTO attendance (atdAcnumber, atdDate, atdDepartment, atdName, atdTime, atdMonth, atdYear, atdMonthNumber,atdDay,atdDayNumber, atdCheckin, atdCheckout) "
			+ " VALUES (:atdAcnumber, :atdDate, :atdDepartment, :atdName, :atdTime, :atdMonth, :atdYear, :atdMonthNumber,:atdDay,:atdDayNumber, :atdCheckin, :atdCheckout)";
		try {
			List<Map<String, String>> batchUpdateParams = new ArrayList<>();
			
                        
				for(AttendanceImport vo : employeeList){
                                        //String[] dateed = vo.getAtdDate().split("-");
                                            
					Map<String, String> paramMap = new HashMap<>();
					paramMap.put("atdAcnumber", vo.getAtdAcnumber());
                                        paramMap.put("atdDate", vo.getAtdDate());
					paramMap.put("atdDepartment", vo.getAtdDepartment());
					paramMap.put("atdName", vo.getAtdName());
					paramMap.put("atdTime", vo.getAtdTime());
                                        
					paramMap.put("atdMonth", vo.getAtdMonth());
					paramMap.put("atdYear", vo.getAtdYear());
					paramMap.put("atdMonthNumber", vo.getAtdMonthNumber());
					paramMap.put("atdDay", vo.getAtdDay());
					paramMap.put("atdDayNumber", vo.getAtdDayNumber());
					paramMap.put("atdCheckin", "ci");
					paramMap.put("atdCheckout","co");
                                        
					batchUpdateParams.add(paramMap);
				}
				               
                                                
				super.getNamedParameterJdbcTemplate().batchUpdate(sql, batchUpdateParams.toArray(new Map[batchUpdateParams.size()] ));
			
		} catch (Exception e) {
			//e.printStackTrace(); 
			return e.getMessage();
		}
		
		return "success";
		
	}
    
    public String dateConvert(String input2){
        switch(input2) {
            case "january":
            case "jan":
                return  "1";
            

            case "febuary":
            case "feb":
                return  "2";
         

            case "march":
            case "mar":
                return  "3";
           

            case "april":
            case "apr":
                return  "4";
           

            case "may":
                return  "5";
          

            case "june":
            case "jun":
                return  "6";
           

            case "july":
            case "jul":
                return  "7";
         

            case "august":
            case "aug":
                return  "8";
          

            case "september":
            case "sep":
            case "sept":
                return  "9";
           

            case "october":
            case "oct":
                return  "10";
         

            case "november":
            case "nov":
                return  "11";
           

            case "december":
            case "dec":
                return  "12";
            default:
                return "";
            }
    }

}
