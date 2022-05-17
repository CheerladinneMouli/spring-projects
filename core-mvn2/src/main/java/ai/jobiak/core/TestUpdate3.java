package ai.jobiak.core;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

//import com.mysql.cj.xdevapi.Statement;
public class TestUpdate3 {

	public static void main(String[] args)throws SQLException {
		String userName = "root";
		String password = "admin";
		String url = "jdbc:mysql://localhost:3306/world";
		Connection con = DriverManager.getConnection(url,userName,password);
		java.sql.Statement st = con.createStatement();
		String selectSql = "Select * from Customer where idcustomer = 101";
		
		ResultSet rs = st.executeQuery(selectSql);
		
		java.sql.ResultSetMetaData rsmd = rs.getMetaData();
		
			System.out.println(rsmd.getColumnCount());
			System.out.println(rsmd.getColumnClassName(1));
			System.out.println(rsmd.getColumnClassName(2));
			System.out.println(rsmd.getColumnClassName(3));
			
			System.out.println(rsmd.getColumnType(1));
			System.out.println(rsmd.getColumnType(2));
			System.out.println(rsmd.getColumnType(3));
			
			System.out.println(rsmd.getTableName(1));
			System.out.println(rsmd.getCatalogName(2));
			System.out.println(rsmd.isNullable(1));
			System.out.println(rsmd.getColumnName(1));
			System.out.println(rsmd.getColumnName(2));
			System.out.println(rsmd.getColumnName(3));
			
			System.out.println(rsmd.getPrecision(1));
			System.out.println(rsmd.getScale(1));
			
			
		}


	}


