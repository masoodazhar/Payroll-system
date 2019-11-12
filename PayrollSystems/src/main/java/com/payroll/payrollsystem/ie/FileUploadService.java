/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.ie;
import com.payroll.payrollsystem.dao.AttendanceDaoImpl;
import com.payroll.payrollsystem.domain.Attendance;
import com.payroll.payrollsystem.domain.AttendanceImport;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
 
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
public class FileUploadService {
 
        @Autowired
	FileUploadDao fileUploadDao;
	
         SimpleDateFormat month_date = new SimpleDateFormat("dd-MMM-yy ", Locale.ENGLISH);
         SimpleDateFormat sdf = new SimpleDateFormat("M-dd-yyyy");
	public String uploadFileData(String inputFilePath){
		Workbook workbook = null;
			Sheet sheet = null;
			try 
			{
				
				workbook = getWorkBook(new File(inputFilePath));
				sheet = workbook.getSheetAt(0);
				
				/*Build the header portion of the Output File*/
				String headerDetails= "AtdAcnumber,AtdName,AtdDepartment,AtdDate,AtdTime,AtdDayNumber,AtdMonth,AtdYear,AtdMonthNumber,AtdDay";
				String headerNames[] = headerDetails.split(",");
				 
				 /*Read and process each Row*/
				 ArrayList<AttendanceImport> employeeList = new ArrayList<>();
				 Iterator<Row> rowIterator = sheet.iterator();
				  SimpleDateFormat setDateFormat = new SimpleDateFormat("dd-MMM-yy");
                                  int leaveFirstHeader = 0;
				 while(rowIterator.hasNext()) 
				 {
    				        Row row = rowIterator.next();
				        //Read and process each column in row
				        AttendanceImport excelTemplateVO = new AttendanceImport();
				        int count=0;
                                        int dateSep = 0;
                                        
				        while(count<headerNames.length){
                                            String methodName = "set"+headerNames[count];
                                              String inputCellValue = "";
                                              if(leaveFirstHeader>0){
                                            switch (count) {
                                                case 5:
                                                    {
                                                        String dates = getCellValueBasedOnCellType(row,3);
                                                        String[] month = dates.split("-");
                                                        inputCellValue = month[0];
                                                        count++;
                                                        break;
                                                    }
                                                case 6:
                                                    {
                                                        String dates = getCellValueBasedOnCellType(row,3);
                                                        String[] month = dates.split("-");
                                                        inputCellValue = month[1];
                                                        count++;
                                                        break;
                                                    }
                                                case 7:
                                                    {
                                                        String dates = getCellValueBasedOnCellType(row,3);
                                                        String[] month = dates.split("-");
                                                        inputCellValue = month[2];
                                                        count++;
                                                        break;
                                                    }
                                                case 8:
                                                   
                                                    Date dateforMonth = setDateFormat.parse(getCellValueBasedOnCellType(row,3));
                                                    
                                                    inputCellValue = getNumberOfMonth(dateforMonth);// month Number
                                                    count++;
                                                    break;
                                                case 9:
                                                    //SimpleDateFormat setDateFormat = new SimpleDateFormat("dd-MMM-yy");
                                                    Date date = setDateFormat.parse(getCellValueBasedOnCellType(row,3));
                                                    inputCellValue = sayDayName(date);
                                                    count++;
                                                    break;
                                               
                                                default:
                                                    if(getCellValueBasedOnCellType(row,count)==null){
                                                         inputCellValue = "";
                                                    }else{
                                                         inputCellValue = getCellValueBasedOnCellType(row,count);
                                                    }
                                                   
                                                    count++;
                                                    break;
                                                   
                                            }
                                              }else{
                                                  count++;
                                                  //inputCellValue = getCellValueBasedOnCellType(row,count++);
                                              }
                                            setValueIntoObject(excelTemplateVO, AttendanceImport.class, methodName, "java.lang.String", inputCellValue);
				        }
				        
				        if(leaveFirstHeader>0){
                                            employeeList.add(excelTemplateVO);
                                        }
                                   leaveFirstHeader++;
				 }
				 String b = fileUploadDao.saveFileDataInDB(employeeList);
                                 fileUploadDao.deleteRow("Date");
                                 fileUploadDao.addMonthYear();
                                 
                                 
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
         public static String getNumberOfMonth(Date d) {
      DateFormat f = new SimpleDateFormat("MM");
      try {
        return f.format(d);
      }
      catch(Exception e) {
        e.printStackTrace();
        return "";
      }
 
     }   
}