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
        <s:url var="addLeaveURL"  value="/addLeave" />
 <s:url var="deleteLeaveURL"  value="/deleteLeave" />
 <s:url var="editLeaveURL"  value="/editleavePage" />
        <form:form action="${addLeaveURL}" modelAttribute="command">
            <table>
                <tr>
                    <td>Leave Emp ID</td>
                    <td><form:input path="Leave.leaveEmpid"/></td>
                </tr>
                <tr>
                    <td>Leave From</td>
                    <td><form:input path="Leave.leaveFrom"/></td>
                </tr>
                <tr>
                    <td>Leave TO</td>
                    <td><form:input path="Leave.leaveTo"/></td>
                </tr>
                <tr>
                    <td>Leave Type</td>
                    <td><form:input path="Leave.leaveType"/></td>
                </tr>
                <tr>
                    <td>Leave Status</td>
                    <td><form:input path="Leave.leaveStatus"/></td>
                </tr>
                <tr>
                    <td>Leave Status</td>
                    <td><form:input path="Leave.leaveReason"/></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Add Department">
                    </td>
                </tr>
            </table>
        </form:form>
        
                                     <br>
                                     
                                     <table border="1">
                                         <tr>
                                             <th>leave Empid</th>
                                             <th>leave From</th>
                                             <th>leave To</th>
                                             <th>leave Type</th>
                                             <th>leave Status</th>
                                             <th>leave Reason</th>
                                             <th>Acrion</th>
                                         </tr>
                                         
                                         <core:forEach var="all" items="${allLeave}">
                                             <tr>
                                                 <td>${all.leaveEmpid}</td>
                                                 <td>${all.leaveFrom}</td>
                                                 <td>${all.leaveTo}</td>
                                                 <td>${all.leaveType}</td>
                                                 <td>${all.leaveStatus}</td>
                                                 <td>${all.leaveReason}</td>
                                                 <td>
                                                     <a onclick="return confirm('Are you sure?')" href="${deleteLeaveURL}?id=${all.leaveId}">Delete</a> | 
                                                     <a href="${editLeaveURL}?id=${all.leaveId}">Edit</a>
                                                 </td>
                                             </tr>
                                         </core:forEach>
                                     </table>                          
                                     
                                     
                                     
                               
    </body>
</html>
