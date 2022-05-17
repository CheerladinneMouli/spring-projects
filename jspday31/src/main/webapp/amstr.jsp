<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name ="amstrong" action="amstr.jsp" method="post">
Enter the number:<input type="text" name="num"><br/>
<input type="submit" value="Check">
</form>
<%
if(request.getParameter("num")!=null){
	String am=request.getParameter("num");
	int pars=Integer.parseInt(am);
	int sum=0;
	int rem;
int temp=pars;
while(pars!=0){
	rem=pars%10;
	sum=sum+(rem*rem*rem);
	pars=pars/10;
}
if(sum==temp) {
	out.println("<h2>"+temp+" Number is Amstrong number"+"</h2>");
	
}else{
	out.println("<h2>"+temp+" Number is not Amstrong number"+"</h2>");
}
}
%>

<hr/>
</body>
</html>