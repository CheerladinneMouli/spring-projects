<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="source2.jsp"%>
Iam using source.jsp
<h2>
<jsp:include page="source.jsp"></jsp:include>
</h2>
<h3>
<%@include file="source3.jsp"%>
</h3>

</body>
</html>