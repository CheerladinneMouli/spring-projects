<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Palindrome</title>
<form action="palindrome" method="get">
            Enter the Number:<input type="text" name="name"/><br/>
            <input type="submit" value="Find"/>
</form>
<body>
<%  if(request.getParameter("name")!=null){
        String name=request.getParameter("name");    
            
        StringBuffer sb=new StringBuffer(name);   
        if(name!=null) {
        String reverse=sb.reverse().toString();    
            
        if(name.equalsIgnoreCase(reverse))    
        {    
            out.println("It is a palindrome");    
        }    
        else    
        {    
            out.println("It is not a palindrome");    
        }    
        }  
}
        
       
        
        %>
        </head>
</body>
</html>