/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;


import com.payroll.payrollsystem.command.AttendanceCommand;
import com.payroll.payrollsystem.command.EmployeeCommand;
import com.payroll.payrollsystem.config.SpringRootConfig;
import com.payroll.payrollsystem.controller.FileModel;
import com.payroll.payrollsystem.ie.EmployeeImportService;
import com.payroll.payrollsystem.ie.FileUploadService;
import com.payroll.payrollsystem.ie.FileUploadService1;
import java.io.File;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.servlet.ServletContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.FileCopyUtils;

import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author azhar baloch
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    static FileModel files;
     static ServletContext servletContext;
     
     
     static String  MonthOfName = "";
    static int number_Of_DaysInMonth = 0;
    static int year = 2018;
    
    public static void main(String[] args) throws ParseException  {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        EmployeeImportService empService = ctx.getBean(EmployeeImportService.class);
        
//    File file = new File("C:\\Users\\azhar baloch\\Documents\\NetBeansProjects\\PayrollSystem\\target\\PayrollSystem-1.0-SNAPSHOT\\static\\uploaded\\emp.xls");
//    String a = uploadService.uploadFileData(""+file);
        
   SimpleDateFormat dateFormatter =  new SimpleDateFormat("YYYY-MMM-dd");
   Date date = new Date();
   System.out.print(dateFormatter.format(date));
                          
//    File file = new File("C:\\Users\\DM Solution\\Documents\\NetBeansProjects\\PayrollSystems\\target\\PayrollSystem-1.0-SNAPSHOT\\static\\uploaded\\emps.xls");
//    if(file.exists()){
//        String a = empService.uploadFileData(file.getAbsolutePath());
//      System.out.print(a);  
//    }else{
//        System.out.print("Not found");  
//    }
    
   //String a = userService.uploadFileData(file.getAbsolutePath());
   
   //System.out.print(a); 
    //userService.uploadFileData(uploadPath+fileName);
        
       // System.out.print("============Data Saved successfully===========");
       
//SimpleDateFormat month_date = new SimpleDateFormat("dd-MMM-yy ", Locale.ENGLISH);
//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//String actualDate = "2018-11-14";
//Date date = sdf.parse(actualDate);
//String month_name = month_date.format(date);
//
//
//
//
//System.out.println("Month :" + month_name);  //Mar 2016

//Date dates = new Date();
//String date = "2018-01-19";
//String[] ymd = date.split("-");
//int year = Integer.parseInt(ymd[0]);
//int month = Integer.parseInt(ymd[1]);
//int day = Integer.parseInt(ymd[2]);
//dates.setTime(dates.getTime());
//Calendar calendar = Calendar.getInstance();
//calendar.setTime(dates);

//int numDays = calendar.getActualMaximum(Calendar.DATE);

   // dates.se
    //Date date1=new SimpleDateFormat("YYYY-dd-M").parse(date);  
    //calendar.setTime(returnnew Date().setMonth(month));
    //calendar.set(Calendar.YEAR, year);
    //int numDays = calendar.getActualMaximum(Calendar.DATE);
   // model.addAttribute("numberOfDays",numDays);
//System.out.print("Time id : "+numDays);
//public String MonthOfName = "";
      //  numberOfMonth(12);
        //System.out.println("MonthOfName : "+MonthOfName+"    ||  number_Of_DaysInMonth:  "+number_Of_DaysInMonth);

        
// Date now = new Date();
// 
//        SimpleDateFormat simpleDateformat = new SimpleDateFormat("E"); // the day of the week abbreviated
//        System.out.println(now);
// 
//        simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
//        System.out.println(simpleDateformat.format(now));
// 
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(now);
//        System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); // the day of the week in numerical format
         
        

//int years = 2018;
//int month = 11;
//numberOfMonth(month,years);
//String holidays[] = {"Saturday","Sunday"};
//Map <Integer,String> maping = new HashMap();
//for(int day=1; day<=number_Of_DaysInMonth; day++){
//   
//
//
//    String dateString = String.format("%d-%d-%d", years, month, day);
//    Date date = new SimpleDateFormat("yyyy-M-d").parse(dateString);
//    String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
//    
//    if(Arrays.asList(holidays).contains(dayOfWeek)){
//        maping.put(day, day+"  "+dayOfWeek+" : OFF");
//        // System.out.println("Date : "+day+"   Day : "+dayOfWeek+"    Status: OFF" );
//    }else{
//        maping.put(day, day+"  "+dayOfWeek+" : ON");
//       // System.out.println("Date : "+day+"   Day : "+dayOfWeek+"    Status: ON" );
//    }
//   
//}
//System.out.println(maping.values());














 
 
//        int i1 = 0;
//        //String[] weekdays = dfs.getWeekdays();
//        
//        for(int i=0; i<=7; i++){
//        
//        }
//        for (String weekday : weekdays) {
//          
//              String s =weekdays[i1];
//              
//                System.err.println("number: "+i1+"  Name:" +s);
//               
//          
//           i1++;
//        }

       

    }
    public int getDaysInMonth(int month, int year) {
  Calendar cal = Calendar.getInstance();  // or pick another time zone if necessary
  cal.set(Calendar.MONTH, month);
  cal.set(Calendar.DAY_OF_MONTH, 1);      // 1st day of month
  cal.set(Calendar.YEAR, year);
  cal.set(Calendar.HOUR, 0);
  cal.set(Calendar.MINUTE, 0);
  Date startDate = cal.getTime();

  int nextMonth = (month == Calendar.DECEMBER) ? Calendar.JANUARY : month + 1;
  cal.set(Calendar.MONTH, nextMonth);
  if (month == Calendar.DECEMBER) {
     cal.set(Calendar.YEAR, year + 1);
  }
  Date endDate = cal.getTime();

  // get the number of days by measuring the time between the first of this
  //   month, and the first of next month
  return (int)((endDate.getTime() - startDate.getTime()) / (24 * 60 * 60 * 1000));
}
      public static void numberOfMonth(int month, int year){
    switch (month) {
            case 1:
                MonthOfName = "January";
                number_Of_DaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_Of_DaysInMonth = 29;
                } else {
                    number_Of_DaysInMonth = 28;
                }
                break;
            case 3:
                MonthOfName = "March";
                number_Of_DaysInMonth = 31;
                break;
            case 4:
                MonthOfName = "April";
                number_Of_DaysInMonth = 30;
                break;
            case 5:
                MonthOfName = "May";
                number_Of_DaysInMonth = 31;
                break;
            case 6:
                MonthOfName = "June";
                number_Of_DaysInMonth = 30;
                break;
            case 7:
                MonthOfName = "July";
                number_Of_DaysInMonth = 31;
                break;
            case 8:
                MonthOfName = "August";
                number_Of_DaysInMonth = 31;
                break;
            case 9:
                MonthOfName = "September";
                number_Of_DaysInMonth = 30;
                break;
            case 10:
                MonthOfName = "October";
                number_Of_DaysInMonth = 31;
                break;
            case 11:
                MonthOfName = "November";
                number_Of_DaysInMonth = 30;
                break;
            case 12:
                MonthOfName = "December";
                number_Of_DaysInMonth = 31;
        }
}
}


 
    

// <core:choose>
//                                                                 <core:when test="${allempAtt.atdTime eq ''}">
//                                                                     <td><i class="icon-close btn-danger"></i></td>
//                                                                 </core:when>
//                                                                 <core:otherwise>
//                                                                      <td><i class="icon-check"></i>${count.count}</td>
//                                                                 </core:otherwise>
//                                                             </core:choose>