/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author azhar baloch
 */
public class MonthList {
    
    
    private Map<String, String> Monthlist = new HashMap<String, String>();

    public Map<String, String> getMonthlist() {
        return Monthlist;
    }

    public void setMonthlist(Map<String, String> Monthlist) {
        this.Monthlist = Monthlist;
    }
    
    
}
