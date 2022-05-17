<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<form name="login" action="logpage.jsp" method="get">
Enter User name: <input type="text" name="val1">
Enter Password: <input type="text" name="val2">
<input type="submit" value="login">
</head>
<body>
<% 
if(request.getParameter("val1")!=null){
String uname=request.getParameter("val1");
if(request.getParameter("val2")!=null){
String pw=request.getParameter("val2");
out.println("User Details Page:");
out.println("Hello "+uname);
out.println("Your Password is *"+pw+"*");
}
}
out.close();

%>
</body>
</html>