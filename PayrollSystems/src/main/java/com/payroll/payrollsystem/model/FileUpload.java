/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.model;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 *
 * @author azhar baloch
 */
public class FileUpload {
    private CommonsMultipartFile[] empImage;

    public CommonsMultipartFile[] getFiles() {
        return empImage;
    }

    public void setFiles(CommonsMultipartFile[] files) {
        this.empImage = files;
    }
    
    
}
