/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.payrollsystem.controller;

import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author azhar baloch
 */
public class FileModel {
    private MultipartFile file;

   public MultipartFile getFile() {
      return file;
   }

   public void setFile(MultipartFile file) {
      this.file = file;
   }
}
