<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vote Eligibility check</title>
<body bgcolor="pink"></body>
<p align="center"></p>
<form name="vote" action="check.jsp" method="post">
<p align="center">Enter person name<input type="text" name="pname"></br></p>
<p align="center">Enter Age<input type="text" name="age"></br></p>
<p align="center"><input type="submit" value="check"></p>
<%
if(request.getParameter("age")!=null){
String st = request.getParameter("pname");
int pars = Integer.parseInt(request.getParameter("age"));
if(pars>=18) {
	out.println("<h1>"+"<i>"+"pname"+"You are eligible to vote"+"</i>"+"</h1>");
}else {
	out.println("<h1>"+"<i>"+"pname"+"You are not eligible to vote"+"</i>"+"</h1>");
}
}
%>
</form>
</body>
</head>
</html>