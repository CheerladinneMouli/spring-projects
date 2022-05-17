<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Factorial of a number</title>
<h1>Factorial of Number</h1>
        <form name="factorial" action="fact.jsp" method="get">
            Enter the Number:<input type="text" name="n1"/><br/>
            <input type="submit" value="Find"/>  
</head>
<body>
<%
if(request.getParameter("n1")!=null){
String x=request.getParameter("n1");
int n=Integer.parseInt(x);
int i=1,fact=1;
if(n==0)
{
out.println("<h1>factorial of 0"+"is"+n+"</h1>");
}
else
{
while(i<=n)
{
fact=fact*i;
i=i+1;
} 
out.println("<h1>factorial of " + n +"="+fact+ "</h1>");
}
}
%>
</body>
</html>