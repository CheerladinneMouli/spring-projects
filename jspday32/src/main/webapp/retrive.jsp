<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="ai.jobiak.assessment.customer"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Details</title>
</head>
<body>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.*"%>
<%!
private ArrayList<customer>getCustomerDetails(){
{
		String userName = "root";
		String password = "admin";
		String url = "jdbc:mysql://localhost:3306/employee";
		Connection con=null;
		ArrayList<Customer>customerList=new ArrayList<>(15);
		try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				 con = DriverManager.getConnection(url,userName, password);
					Statement st=con.createStatement();
					String sql="select * from customer";
					ResultSet rs=st.executeQuery(sql);
	while(rs.next())
	{
		if(customerList.size().equals(customer)){
		customer.setId(rs.getString("cusid"));
		customer.setName(rs.getString("name"));
		customer.setBalance(rs.getString("balance"));
		}
	%>	
		}
</body>
	