<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Success</title>
    </head>
    <body>
       
       
        <table border="1">
            <tr>
                <th>1</th>
                <th>2</th>
                <th>3</th>
                <th>4</th>
                <th>5</th>
                <th>6</th>
                <th>7</th>
                <th>8</th>
                <th>9</th>
                <th>10</th>
            </tr>
                  
                       <core:forEach var="map" items="${key}">
                            <tr>
                              <td>${map.key}</td> 
                                <core:forEach var="maps" items="${map.value}">
                                <td>${maps.atdDate}</td> 
                                </core:forEach>
                            </tr>
                        </core:forEach>
                     
               
            
        </table>
         
           
    </body>
</html>
