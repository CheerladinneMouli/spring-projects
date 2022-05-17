<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First</title>
</head>
<body>
<%! public int add(int a,int b){//declaration part
	return a+b;
	}%>
	<%! public int sub(int i,int j){//declaration part
	return i-j;
	}%>
	<!-- short form for out.println -->
	<!-- expressions -->
	<div>
	The sum of two numbers is = <%= add(10,20) %> 
	</div>
	<!-- here div will devides the lines  -->
	<div>
	The subtraction of two numbers is = <%= sub(100,20)%>
	</div>
	<!-- implicit objects -->
	<% out.print("hello"); %>
</body>
</html>