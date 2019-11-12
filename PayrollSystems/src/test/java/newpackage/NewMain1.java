/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
//
//class a{

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
class a{
    public void getName(){
        System.out.println("A");
    } 
}
class b extends a{
     public void getNamelimit(){
        System.out.println("B");
    } 
}
class c extends b{
    public void getName(){
        System.out.println("C");
    }
}
class d extends c{
    public void getName(){
        System.out.println("D");
    }
}
class e extends d{
    public void getName(){
        System.out.println("E");
    }
}
class Car {
void run()
{
System.out.println("car is running"); 
}
}
class Audi extends Car {
void run()
{
System.out.println("Audi is running safely with 100km");
}
}
public class NewMain1 {

    public static void main(String[] args) throws ParseException {
        
        
        a obj = new e();
      obj.getName();
      
//    
//        SimpleDateFormat month_date = new SimpleDateFormat("dd-MMM-yy ", Locale.ENGLISH);
//         SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
//         
//      SimpleDateFormat setDateFormat = new SimpleDateFormat("yyyy-MMM-dd");
//      
//        
//        Date date = setDateFormat.parse("01-Nov-18");
//        
//        
//        System.out.println(sayDayName(date));
        
//      System.out.println("2018-11-26 was a " + sayDayName(date1));
//      System.out.println("Today is a " + sayDayName(date2));

 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse("2008-12-31");
        Date date2 = sdf.parse("2010-01-31");

        System.out.println("date1 : " + sdf.format(date1));
        System.out.println("date2 : " + sdf.format(date2));

        if (date1.compareTo(date2) > 0) {
            System.out.println("Date1 is after Date2");
        } else if (date1.compareTo(date2) < 0) {
            System.out.println("Date1 is before Date2");
        } else if (date1.compareTo(date2) == 0) {
            System.out.println("Date1 is equal to Date2");
        } else {
            System.out.println("How to get here?");
        }

    
    }

    public static String sayDayName(Date d) {
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
