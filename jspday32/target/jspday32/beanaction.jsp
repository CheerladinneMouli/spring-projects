<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bean Action</title>
</head>
<body bgcolor="pink">
<h3>check..............</h3>


        <jsp:useBean id="userBean" class="ai.jobiak.model.User" scope="request"></jsp:useBean>
        <jsp:setProperty property="fname" name="userBean" param="fname"/>
        <jsp:setProperty property="email" name="userBean" param="email"/>
        <jsp:setProperty property="mobile" name="userBean" param="mobile"/>
      <hr>
      <jsp:forward page="ShowBeanData.jsp"></jsp:forward>
      <hr> 
    
	
</h3>
      
</body>
</html>