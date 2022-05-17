<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<div align="center">
<h1>Employee Register form</h1>
<form action="<%= request.getContextPath() %>/emp" method="post">
<table style="with: 80%">
<tr>
<td>Emp id</td>
<td><input type="text" name="empid"/></td>
<tr/>
<tr>
<td>First Name</td>
<td><input type="text" name="firstname"/></td>
<tr/>
<td>Last Name</td>
<td><input type="text" name="lastname"/></td>
<tr/>
<td>User Name</td>
<td><input type="text" name="username"/></td>
<tr/>
<td>Password</td>
<td><input type="text" name="password"/></td>
<tr/>
<td>Address</td>
<td><input type="text" name="address"/></td>
<tr/>
<td>Mobileno</td>
<td><input type="text" name="mobileno"/></td>
<tr/> 
<input type = "submit" value = "submit"/>
</form>
</div>
</head>
</html>