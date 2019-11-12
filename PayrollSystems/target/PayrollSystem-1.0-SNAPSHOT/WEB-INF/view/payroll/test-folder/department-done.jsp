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
        <s:url var="addDepartmentURL"  value="/addDepartment" />
 <s:url var="deleteDepartmentURL"  value="/deleteDepartment" />
 <s:url var="editDepartmentURL"  value="/editDepartmentPage" />
        <form:form action="${addDepartmentURL}" modelAttribute="command">
            <table>
                <tr>
                    <td>Department Name</td>
                    <td><form:input path="Department.depName"/></td>
                </tr>
                <tr>
                    <td>Department Head</td>
                    <td><form:input path="Department.depHead"/></td>
                </tr>
                <tr>
                    <td>Department No-Emp</td>
                    <td><form:input path="Department.depNumberofEmployee"/></td>
                </tr>
                <tr>
                    <td>Department Status</td>
                    <td><form:input path="Department.depStatus"/></td>
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
                                             <th>Dep Name</th>
                                             <th>Dep Head</th>
                                             <th>Dep No-Emp</th>
                                             <th>Dep Status</th>
                                             <th>Acrion</th>
                                         </tr>
                                         
                                         <core:forEach var="all" items="${allDepartment}">
                                             <tr>
                                                 <td>${all.depName}</td>
                                                 <td>${all.depHead}</td>
                                                 <td>${all.depNumberofEmployee}</td>
                                                 <td>${all.depStatus}</td>
                                                 <td>
                                                     <a onclick="return confirm('Are you sure?')" href="${deleteDepartmentURL}?id=${all.depId}">Delete</a> | 
                                                     <a href="${editDepartmentURL}?id=${all.depId}">Edit</a>
                                                 </td>
                                             </tr>
                                         </core:forEach>
                                     </table>                          
                                     
                                     
                                     
                               
    </body>
</html>
