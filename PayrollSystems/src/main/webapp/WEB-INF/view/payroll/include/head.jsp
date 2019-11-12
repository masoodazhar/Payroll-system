<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Trasitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8"></meta>
<title>Upload Page</title>
<s:url var="faviconIco" value="static/favicon.ico" />
<link rel="icon" href="${faviconIco}" type="image/x-icon">
<!-- VENDOR CSS -->
<s:url var="styleCss" value="static/css/style.css" />
<link rel="stylesheet" href="${styleCss}">
<s:url var="bootstrapMinCss" value="static/vendor/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="${bootstrapMinCss}">
<s:url var="fontawesomeMinCss" value="static/vendor/font-awesome/css/font-awesome.min.css" />
<link rel="stylesheet" href="${fontawesomeMinCss}">
<s:url var="jqueryJvectormap203MinCss" value="static/vendor/jvectormap/jquery-jvectormap-2.0.3.min.css" />
<link rel="stylesheet" href="${jqueryJvectormap203MinCss}"/>
<s:url var="morrisMinCss" value="static/vendor/morrisjs/morris.min.css" />
<link rel="stylesheet" href="${morrisMinCss}" />
<s:url var="jqueryNestableCss" value="static/vendor/nestable/jquery-nestable.css" />
<link rel="stylesheet" href="${jqueryNestableCss}"/>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.2/css/all.css" integrity="sha384-/rXc/GQVaYpyDdyxK+ecHPVYJSN9bmVFBvjA/9eOB+pb3F2w2N6fc5qB9Ew5yIns" crossorigin="anonymous">
<!--employe page data table ETC -->
<s:url var="sweetalertCss" value="static/vendor/sweetalert/sweetalert.css" />
<link rel="stylesheet" href="${sweetalertCss}"/>
<s:url var="dataTablesBootstrap4MinCss" value="static/vendor/jquery-datatable/dataTables.bootstrap4.min.css" />
<link rel="stylesheet" href="${dataTablesBootstrap4MinCss}">
<!--employe page data table ETC -->


<!-- MAIN CSS -->
<s:url var="mainCss" value="static/css/main.css" />
<link rel="stylesheet" href="${mainCss}">
<s:url var="colorSkinsCss" value="static/css/color_skins.css" />
<link rel="stylesheet" href="${colorSkinsCss}">
<link rel="stylesheet" href="${colorSkinsCss}">
<link rel="" href="${colorSkinsCss}">
<%--Attendnace Upload URL--%>


<%--PAGES LINK TO REDIRECTION --%>


<%--Employee Page  links --%>
<s:url var="aallEmployeeUrl" value="/employee" />
<s:url var="updateEmployeeUrl" value="/editEmployee" />

<%--Employee method  links --%>
<s:url var="deleteEmployeeUrl" value="/deleteEmployee" />
<s:url var="EditEmployeeRecordURL" value="/EditEmployeeRecord" />
<s:url var="addEmployeeForm" value="/addEmployee" />
<s:url var="importEmployeesUrl" value="/importEmployees" />
<%--Attendance Page  links --%>
<s:url var="attendancePageUrl" value="/attendance" />

<%--Attendance method  links --%>
<s:url var="addAtdUrl" value="/addAttendance" />
<s:url var="uploadxlsUrl" value="/importAttendance" />

   <%--method link for action--%>

   <s:url var="deleteDepartmentURL"  value="/deleteDepartment" />
  
    <%--Leave page  links--%>
    <s:url var="leavePageUrl" value="/leave" />
    <s:url var="editLeavePageURL"  value="/editleave" />
    
    <%--Leave method links--%>
    <s:url var="addLeaveURL"  value="/addLeave" />
    <s:url var="deleteLeaveURL"  value="/deleteLeave" />
    <s:url var="editLeaveURL"  value="/editLeave" />
    
    <%--department page  links--%>
    <s:url var="departmentPageUrl" value="/department" />
    <s:url var="editDepartmentPageUrl"  value="/editDepartmentPage" />
 
    <%--department method links--%>
    <s:url var="editDepartmentURL"  value="/editDepartment" />
    <s:url var="addDepartmentURL"  value="/addDepartment" />
    
 <%--paymentSetting  Page links--%>
 <s:url var="addPaymentPageURL"  value="/paymentsetting" />
  <s:url var="updatePaymentPageURL"  value="/editpaymentsetting" />
  
 <%--paymentSetting  method links--%>
  <s:url var="addPaymentURL"  value="/addPaymentsetting" />
  <s:url var="editPaymentURL"  value="/updatePaymentsetting" />
  <s:url var="deletePaymentURL"  value="/deletePaymentsetting" />
  
  <%--Shift  Page links--%>
 <s:url var="addshiftPageURL"  value="/shift" />
  <s:url var="updateshiftPageURL"  value="/editshift" />
  
 <%--Shift  method links--%>
  <s:url var="addshiftURL"  value="/addshift" />
  <s:url var="editshiftURL"  value="/updateshift" />
  <s:url var="deleteshiftURL"  value="/deleteshift" />
  
  
  
  <%------------------------------------Salary  Page links-----------------------------%>
 <s:url var="addsalaryPageURL"  value="/salary" />
  <s:url var="updatesalaryPageURL"  value="/editsalary" />
  
 <%--Salary  method links--%>
  <s:url var="addsalaryURL"  value="/addsalary" />
  <s:url var="editsalaryURL"  value="/updatesalary" />
  <s:url var="deletesalaryURL"  value="/deletesalary" />
  
  <%------------------------------------Manage Salary  Page links-----------------------------%>
 <s:url var="manageEmployeePageURL"  value="/manageSalary" />

  
 <%--Manage Salary  method links--%>
  <s:url var="manageSalarySearchURL"  value="/manageSalarySearch" />
  <s:url var="salaryPaymentURL"  value="/salaryPayment" />
  
   <s:url var="searchEmpUrl" value="searchByName" />
   
    <%--IMAGES LINK --%>
    <s:url var="employeeImage" value="C://upload//" />
    <s:url var="avatar2Jpg" value="static/images/xs/avatar2.jpg" />
    <s:url var="userPng" value="static/images/user.png" />
    <s:url var="employeeImgPath" value="static/uploaded/" />
    <s:url var="homePage" value="/index" />

</head>