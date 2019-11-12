<%-- 
    Document   : department
    Created on : Oct 24, 2018, 11:45:22 PM
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
        <title>JSP Page</title>
    </head>
    <body>
        
                                <core:if test="${param.act eq 'success'}">
                                    <li><a href="javascript:void(0);" class="btn btn-success" style="margin: 0 330px 0px 0px; padding: 10px 20px 10px 20px;font-size: 20px;">Department Modified Successfully!</a></li>
                                </core:if>
                                <core:if  test="${param.act eq 'wrong'}">
                                     <li><a href="javascript:void(0);" class="btn btn-danger" style="margin: 0 330px 0px 0px; padding: 10px 20px 10px 20px;font-size: 20px;">Some thing went wrong! Please try again.</a></li>
                                </core:if>
   
        <s:url var="editDepartmentURL"  value="/editDepartment" />
                                     
        <form:form action="${editDepartmentURL}" modelAttribute="command" method="post">
            <table>
                <tr>
                    <td>Department Name</td>
                    <td><form:input path="Department.depName" value="${allDepartment.depName}" /></td>
                </tr>
                <tr>
                    <td>Department Head</td>
                    <td><form:input path="Department.depHead" value="${allDepartment.depHead}"/></td>
                </tr>
                <tr>
                    <td>Department No-Emp</td>
                    <td><form:input path="Department.depNumberofEmployee" value="${allDepartment.depNumberofEmployee}"/></td>
                </tr>
                <tr>
                    <td>Department Status</td>
                    <td><form:input path="Department.depStatus" value="${allDepartment.depStatus}"/></td>
                </tr>
                <tr>
                    <td>Department Status</td>
                    <td><form:input path="Department.depId" value="${allDepartment.depId}"/></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Add Department">
                    </td>
                </tr>
            </table>
        </form:form>
        
                                     
                                                            
                                     
                                     
                                     
                               
    </body>
</html>
