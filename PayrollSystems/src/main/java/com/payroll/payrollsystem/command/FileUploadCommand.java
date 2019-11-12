/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.command;

import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author azhar baloch
 */
public class FileUploadCommand {
 
    private MultipartFile fileUpload;

    public MultipartFile getFileUpload() {
        return fileUpload;
    }

    public void setFileUpload(MultipartFile fileUpload) {
        this.fileUpload = fileUpload;
    }
}
