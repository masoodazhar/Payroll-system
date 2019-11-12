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
                                    <li><a href="javascript:void(0);" class="btn btn-success" style="margin: 0 330px 0px 0px; padding: 10px 20px 10px 20px;font-size: 20px;">Department Added Successfully!</a></li>
                                </core:if>
                                <core:if  test="${param.act eq 'wrong'}">
                                     <li><a href="javascript:void(0);" class="btn btn-danger" style="margin: 0 330px 0px 0px; padding: 10px 20px 10px 20px;font-size: 20px;">Some thing went wrong! Please try again.</a></li>
                                </core:if>
                                 <core:if test="${param.act eq 'deleted'}">
                                    <li><a href="javascript:void(0);" class="btn btn-success" style="margin: 0 330px 0px 0px; padding: 10px 20px 10px 20px;font-size: 20px;">Department Deleted Successfully!</a></li>
                                </core:if>
                                <core:if  test="${param.act eq 'noDelete'}">
                                     <li><a href="javascript:void(0);" class="btn btn-danger" style="margin: 0 330px 0px 0px; padding: 10px 20px 10px 20px;font-size: 20px;">Some thing went wrong! Please try again.</a></li>
                                </core:if>
        <s:url var="editLeaveURL"  value="/editLeave" />
        <form:form action="${editLeaveURL}" modelAttribute="command">
            <table>
                <tr>
                    <td>Leave Emp ID</td>
                    <td><form:input path="Leave.leaveEmpid" value="${leaves.leaveEmpid}" /></td>
                </tr>
                <tr>
                    <td>Leave From</td>
                    <td><form:input path="Leave.leaveFrom" value="${leaves.leaveFrom}" /></td>
                </tr>
                <tr>
                    <td>Leave TO</td>
                    <td><form:input path="Leave.leaveTo" value="${leaves.leaveTo}" /></td>
                </tr>
                <tr>
                    <td>Leave Type</td>
                    <td><form:input path="Leave.leaveType" value="${leaves.leaveType}" /></td>
                </tr>
                <tr>
                    <td>Leave Status</td>
                    <td><form:input path="Leave.leaveStatus" value="${leaves.leaveStatus}" /></td>
                </tr>
                <tr>
                    <td>Leave Reason</td>
                    <td><form:input path="Leave.leaveReason" value="${leaves.leaveReason}" /></td>
                </tr>
                <tr>
                    <td>Leave ID</td>
                    <td><form:input path="Leave.leaveId" value="${leaves.leaveId}" /></td>
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
