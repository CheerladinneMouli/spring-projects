package ai.jobiak.core;
import java.sql.*;

public class Taskdata {
	private static final String sqlUpdate = null;

	public static void main(String[] args) throws SQLException {
		String userName = "root";
		String password = "admin";
		String url = "jdbc:mysql://localhost:3306/world";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		Connection con = DriverManager.getConnection(url,userName,password);
		PreparedStatement pstmt=con.prepareStatement("insert into student values(?,?,?,?)");  
		pstmt.setInt(1,107);//1 specifies the first parameter in the query  
		pstmt.setString(2,"Farooq");
		pstmt.setString(3,"CSE");
		pstmt.setString(4,"PACE");
		int result = pstmt.executeUpdate();  
		System.out.println(result+" records inserted");
		con.close();   
		
	}

}
