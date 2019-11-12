/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.ie;

import com.payroll.payrollsystem.domain.Attendance;
import com.payroll.payrollsystem.domain.AttendanceImport;
import com.payroll.payrollsystem.domain.ImportEmployee;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
 
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DM Solution
 */
@Service
public class EmployeeImportService {
    
    @Autowired
    EmployeeImportDao fileUploadDao;
    public String uploadFileData(String inputFilePath){
		Workbook workbook = null;
			Sheet sheet = null;
			try 
			{
				
				workbook = getWorkBook(new File(inputFilePath));
				sheet = workbook.getSheetAt(0);
				
				/*Build the header portion of the Output File*/
				String headerDetails= "EmpName,EmpEmail,EmpPhone,EmpJoindate,EmpShift,EmpDateofbirth,EmpJobtype,EmpGender,EmpDepartment,EmpJobtitle,EmpRole,EmpImage";
				String headerNames[] = headerDetails.split(",");
				 
				 /*Read and process each Row*/
				 ArrayList<ImportEmployee> employeeList = new ArrayList<>();
				 Iterator<Row> rowIterator = sheet.iterator();
				int leaveFirstHeader=0;
				 while(rowIterator.hasNext()) 
				 {
                                      SimpleDateFormat dateFormatter =  new SimpleDateFormat("YYYY-MM-dd");
                                      SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/YY");
				       DataFormatter makingDate = new DataFormatter();
                                       Date date=null;
                                        Row row = rowIterator.next();
				        //Read and process each column in row
				        ImportEmployee excelTemplateVO = new ImportEmployee();
                                        
				        int count=0;
				        while(count<headerNames.length){
				        	String methodName = "set"+headerNames[count];
                                                String inputCellValue;
                                                
				        	if(leaveFirstHeader>0 && (count==3 || count==5)){
                                                    //CellStyle cellStyle = sheet.getRow(leaveFirstHeader+1).getCell(4).getCellStyle();
                                                    //inputCellValue = row.getCell(count).getDateCellValue().toString();
                                                     date = sdf.parse(makingDate.formatCellValue(row.getCell(count)));
                                                    inputCellValue = dateFormatter.format(date);
                                                    count++;
                                                }else{
                                                 inputCellValue = getCellValueBasedOnCellType(row,count++);
                                                 
                                                }
                                                
                                                
                                                
				        	
                                                
                                                setValueIntoObject(excelTemplateVO, ImportEmployee.class, methodName, "java.lang.String", inputCellValue);
				        }
				       
                                        if(leaveFirstHeader>0){
                                            employeeList.add(excelTemplateVO);
                                        }
                                   leaveFirstHeader++;     
				 }
                                 
                                 
                                 
				 String b = fileUploadDao.saveFileDataInDB(employeeList);
                                
                                 
                                 
				 return b;
                                 
                                 
			}
			catch(Exception ex){
				ex.printStackTrace();
                                return ex.getMessage();
                                
			}
			
		
		
	}
	
	public static Workbook getWorkBook(File fileName)
	{
		Workbook workbook = null;
		try {	
			String myFileName=fileName.getName();
			String extension = myFileName.substring(myFileName.lastIndexOf("."));
			if(extension.equalsIgnoreCase(".xls")){
				workbook = new HSSFWorkbook(new FileInputStream(fileName));
			}
			else if(extension.equalsIgnoreCase(".xlsx")){
				workbook = new XSSFWorkbook(new FileInputStream(fileName));
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return workbook;
	}
	
	public static String getCellValueBasedOnCellType(Row rowData,int columnPosition)
	{
		String cellValue=null;
		Cell cell = rowData.getCell(columnPosition);
		if(cell!=null){
			if(cell.getCellType()==Cell.CELL_TYPE_STRING)
			{
				String inputCellValue=cell.getStringCellValue();
				if(inputCellValue.endsWith(".0")){
					inputCellValue=inputCellValue.substring(0, inputCellValue.length()-2);
				}
		 		cellValue=inputCellValue;
			}
			else if (cell.getCellType()==Cell.CELL_TYPE_NUMERIC)
			{
		 		Double doubleVal = new Double(cell.getNumericCellValue());
		 		cellValue= Integer.toString(doubleVal.intValue());
			}
		}
		return cellValue;
	}
	
	private static <T> void  setValueIntoObject(Object obj, Class<T> clazz, String methodNameForField, String dataType, String inputCellValue) 
		throws SecurityException, NoSuchMethodException, ClassNotFoundException, NumberFormatException, IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		
		
		Method meth = clazz.getMethod(methodNameForField, Class.forName(dataType));
		T t = clazz.cast(obj);
		 
		 if("java.lang.Double".equalsIgnoreCase(dataType))
		{
			meth.invoke(t, Double.parseDouble(inputCellValue));
		}else if(!"java.lang.Integer".equalsIgnoreCase(dataType))
		{
			meth.invoke(t, inputCellValue);
		}
		else
		{
			meth.invoke(t, Integer.parseInt(inputCellValue));
		}		 		
	}
 
}
