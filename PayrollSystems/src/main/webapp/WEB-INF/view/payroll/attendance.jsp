<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Attendance</title>
    </head>
    <body>
        <s:url var="addAtdUrl" value="/addAttendance" />
        <form:form action="${addAtdUrl}" modelAttribute="command" method="post">
            <table>
                <tr>
                    <td>Employee Name ID</td>
                    <td><form:input path="Attendance.atdEid" /></td>
                </tr>
                <tr>
                    <td>Employee AC/No</td>
                    <td><form:input path="Attendance.atdAcnumber" /></td>
                </tr>
                <tr>
                    <td>Employee Department</td>
                    <td><form:input path="Attendance.atdDepartment" /></td>
                </tr>
                <tr>
                    <td>Employee Date</td>
                    <td><form:input path="Attendance.atdDate" type="date" /></td>
                </tr>
                <tr>
                    <td>Employee C/Time</td>
                    <td><form:input path="Attendance.atdTime" type="time" /></td>
                </tr>
                <tr>
                    <td>Employee Status</td>
                    <td><form:input path="Attendance.atdStatus" /></td>
                </tr>
                <tr>
                   
                    <td colspan="2"><input type="submit" value="Add Attendance"></td>
                </tr>
            </table>
        </form:form>
       
        <s:url var="uploadxlsUrl" value="/uploadxls" />
           <form method="POST" action="${uploadxlsUrl}" enctype="multipart/form-data">
        <input type="file" name="file" /> <input type="submit" value="Submit" />
    </form>
 
    <h1>Upload Status</h1>
 
    <h2>Message : ${message}</h2>
    
    </body>
</html>
