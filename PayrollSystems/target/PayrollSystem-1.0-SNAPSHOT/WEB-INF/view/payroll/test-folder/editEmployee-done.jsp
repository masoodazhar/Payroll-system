<%-- 
    Document   : editEmployee
    Created on : Oct 24, 2018, 9:42:29 PM
    Author     : azhar baloch
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Update</title>
    </head>
    <body>
    <s:url var="EditEmployeeRecordURL" value="/EditEmployeeRecord" />
    <form:form action="${EditEmployeeRecordURL}" modelAttribute="command" method="POST" enctype="multipart/form-data"> 
        <table>
            <tr>
                <td>
                    Employee Name
                </td>
                <td>
                   <form:input path="Employee.empName" class="form-control" value="${AllEmployees.empName}" placeholder="Employee Name" />
                </td>
            </tr>
            <tr>
                <td>
                    Employee Email
                </td>
                <td>
                    <form:input path="Employee.empEmail" class="form-control"  value="${AllEmployees.empEmail}" placeholder="Email ID"  />
                </td>
            </tr>
            <tr>
                <td>
                    Employee Phone
                </td>
                <td>
                   <form:input path="Employee.empPhone" class="form-control"  value="${AllEmployees.empPhone}" />
                </td>
            </tr>
            <tr>
                <td>
                    Employee EID
                </td>
                <td>
                    <form:input  path="Employee.empEId" class="form-control" value="${AllEmployees.empEId}" />
                </td>
            </tr>
            <tr>
                <td>
                    Employee Join Date
                </td>
                <td>
                     <form:input path="Employee.empJoindate" class="form-control" value="${AllEmployees.empJoindate}" />
                </td>
            </tr>
            <tr>
                <td>
                    Employee Role
                </td>
                <td>
                   <form:input path="Employee.empRole" class="form-control" value="${AllEmployees.empRole}" />
                </td>
            </tr>
            <tr>
                <td>
                    Employee Status
                </td>
                <td>
                     <form:input type="file" path="empImage" class="form-control"  />
                     ${AllEmployees.empImage}
                </td>
            </tr>
            <tr>
                <td>
                    Employee Status
                </td>
                <td>
                   <form:input path="Employee.empStatus" class="form-control" value="${AllEmployees.empStatus}"  />
                </td>
            </tr>
            <tr>
                <td>
                    Employee ID
                </td>
                <td>
                   <form:input path="Employee.empId" class="form-control" value="${AllEmployees.empId}" placeholder="Status" />
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Save Changes">
                </td>
            </tr>
        </table>
        
    </form:form>
              
    </body>
</html>
