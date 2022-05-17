<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Even or Odd</title>
<form name="evenodd" action="evenodd.jsp" method="post">
Enter Number:<input type="text" name="number"><br/>
<input type="submit" value="Check">
</head>
<body>
<% 
if(request.getParameter("number")!=null){
String st = request.getParameter("number");
		int pars = Integer.parseInt(st);
			if(pars%2==0) {
				out.println("<h1>"+pars+" is Even number"+"</h1>");
			}
			else {
				out.println("<h1>"+pars+" is odd number"+"</h1>");
		}
}
		
%>		
</body>
</html>