<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*;" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp@Jobiak#mouli</title>
</head>
<body>
<h1>
<%!
public int cube(int n){
	
	return n*n*n;
}
ArrayList<String>topics=new ArrayList<>();

%>
<%=new String("Welcome Jobiak java Gaints")%>
</h1>
<%out.println("you can write java in tags=which are know as Scriplets/"); %>
</body>
<h3>5^3 is :<%=cube(5)%></h3>
<h3><% 
topics.add("html,css,JS");
topics.add("typing script and angular 10");
topics.add("Spring,SpringBoot,Hibernate&JPA");
topics.add("GIT,KENKINS,JUNIT&AWS");
for(String topic:topics){
out.println(topic+"<br/>");
}
%>
</h3>
</html>