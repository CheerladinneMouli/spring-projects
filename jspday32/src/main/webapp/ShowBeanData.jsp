<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show bean data</title>
</head>
<body>

<jsp:useBean id="userBean" class="ai.jobiak.model.User" scope="request"></jsp:useBean>

<h3>Your Data is{
     
      First Name:<jsp:getProperty property="fname" name="userBean"/><br/>
      Email     :<jsp:getProperty property="email" name="userBean"/><br/>
      Mobile    :<jsp:getProperty property="mobile" name="userBean"/><br/>
  }    
</h3>

</body>
</html>