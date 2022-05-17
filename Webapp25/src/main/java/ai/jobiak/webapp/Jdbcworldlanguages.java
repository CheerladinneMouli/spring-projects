package ai.jobiak.webapp;
import java.sql.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Jdbcworldlanguages implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		String url = "jdbc:mysql://localhost:3306/world";
		String userName = "root";
		String password = "admin";

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    try {
					Connection con = DriverManager.getConnection(url,userName,password);
					out.println("Connected to db");
					Statement st = con.createStatement();
					String sql = "select * from countrylanguage";
					ResultSet rs = st.executeQuery(sql);
					
					while(rs.next()) {
						out.println(rs.getString(1)+ "::"+rs.getString(2)+"::"+rs.getString(3)+"::"+rs.getString(4));
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

}

			
