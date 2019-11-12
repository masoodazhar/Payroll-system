/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.ie;

import com.payroll.payrollsystem.dao.BaseDao;
import com.payroll.payrollsystem.domain.AttendanceImport;
import com.payroll.payrollsystem.domain.Employee;
import com.payroll.payrollsystem.domain.ImportEmployee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DM Solution
 */
@Repository
public class EmployeeImportDao extends BaseDao {
    public String saveFileDataInDB(List<ImportEmployee> employeeList){
		String sql = "INSERT INTO employee (empName,empEmail,empPhone,empJoindate,empShift,empDateofbirth,empJobtype,empGender,empDepartment,empJobtitle,empRole,empImage )"
                + " VALUES (:empName,:empEmail,:empPhone,:empJoindate,:empShift,:empDateofbirth,:empJobtype,:empGender,:empDepartment,:empJobtitle,:empRole,:empImage)";
		try {
			List<Map<String, String>> batchUpdateParams = new ArrayList<>();
			
                        
				for(ImportEmployee emp : employeeList){
                                        //String[] dateed = vo.getAtdDate().split("-");
                                            
					Map<String, String> m = new HashMap<>();
					m.put("empName", emp.getEmpName());
                                        m.put("empEmail", emp.getEmpEmail());
                                        m.put("empPhone", emp.getEmpPhone());
                                        m.put("empJoindate", emp.getEmpJoindate());
                                        m.put("empShift", emp.getEmpShift());
                                        m.put("empDateofbirth", emp.getEmpDateofbirth());
                                        m.put("empJobtype", emp.getEmpJobtype());
                                        m.put("empGender", emp.getEmpGender());
                                        m.put("empDepartment", emp.getEmpDepartment());
                                        m.put("empJobtitle", emp.getEmpJobtitle());
                                        m.put("empRole", emp.getEmpRole());
                                        m.put("empImage", emp.getEmpImage());
                                        
					batchUpdateParams.add(m);
				}
				               
                                                
				super.getNamedParameterJdbcTemplate().batchUpdate(sql, batchUpdateParams.toArray(new Map[batchUpdateParams.size()] ));
			
		} catch (Exception e) {
			//e.printStackTrace(); 
			return e.getMessage();
		}
		
		return "success";
		
	}
}
