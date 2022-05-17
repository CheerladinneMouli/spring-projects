package ai.jobiak.core;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;
public class TestUpdate4 {

	public static void main(String[] args)throws SQLException {
		String userName = "root";
		String password = "admin";
		String url = "jdbc:mysql://localhost:3306/world";
		
		Connection con = DriverManager.getConnection(url,userName,password);
	    java.sql.Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		String selectSql = "Select * from Customer";
		
		ResultSet rs = st.executeQuery(selectSql);
		
		if(rs.next()){
			rs.moveToCurrentRow();
			
			rs.updateInt(1,125);
			rs.updateString(2,"Mitchel Lee");
			rs.updateDouble(3,890);
			rs.insertRow();
			rs.last();
			
			System.out.println(rs.getInt(1)+"::"+rs.getInt(2)+"::"+rs.getString(3));
			
			
		}


	}

}
