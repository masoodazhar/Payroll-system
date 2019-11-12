<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Trasitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8"></meta>
<title>Upload Page</title>
</head>
<body>
    <spring:url value="/upload" var="uploadURL" />
    <form:form action="${uploadURL}" modelAttribute="command" method="post" enctype="multipart/form-data">
      <form:input path="files" type="file" multiple="multiple" />
      <input type="submit" value="Upload Files"></input>
   </form:form>
</body>
</html>