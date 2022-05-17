package ai.jobiak.core;
import java.sql.*;
public class TestFetchingdata {

	public static void main(String[] args)throws SQLException {
		String userName = "root";
		String password = "admin";
		String url = "jdbc:mysql://localhost:3306/world";
		
		Connection con = DriverManager.getConnection(url,userName,password);
		Statement stmt = con.createStatement();
		String selectSql = "Select * from Customer";
		
		ResultSet rs = stmt.executeQuery(selectSql);
		
		while(rs.next()){
			System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
			
			
		}


	}

}
