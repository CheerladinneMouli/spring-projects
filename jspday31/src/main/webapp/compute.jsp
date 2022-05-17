<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
<form name="calculator" method="get" action="compute.jsp">
No-1<input type="text"name=t1><br><br/>
No-2<input type="text"name=t2><br><br/>
<input type=submit value="+" name="btn" >
<input type=submit value="-" name="btn" >
<input type=submit value="*" name="btn" >
<input type=submit value="/" name="btn" >
<input type=submit value="%" name="btn" >
</form>
<%
if(request.getParameter("t1")!=null){
int a=Integer.parseInt(request.getParameter("t1"));
if(request.getParameter("t2")!=null){
int b=Integer.parseInt(request.getParameter("t2"));
int c=0;
String op=request.getParameter("btn");
if(op.equals("+"))c=a+b;
if(op.equals("-"))c=a-b;
if(op.equals("*"))c=a*b;
if(op.equals("/"))c=a/b;
if(op.equals("%"))c=a%b;
out.println("<h3>"+a+op+b+"="+c+"</h3>");
	out.println("<br>");
	out.println("</center>");
}
}


%>
</head>
</html>