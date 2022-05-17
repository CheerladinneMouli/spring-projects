package ai.jobiak.core;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.*;

public class TaskUpdate {
	public static void main(String[] args) throws SQLException, IOException {
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
		String q = "update student set sname = ?, set sdept = ? , set college = ?, where sroll = ?";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter new name : ");
		String sname = br.readLine();
		System.out.println("Enter correct department : ");
		String sdept = br.readLine();
		System.out.println("Enter college name : ");
		String college = br.readLine();
		System.out.println("Enter student id : ");
	    int sroll = Integer.parseInt(br.readLine());
		PreparedStatement pstmt = con.prepareStatement(q);
		pstmt.setString(1,sname);
		pstmt.setString(2,sdept);
		pstmt.setString(3,college);
		pstmt.setInt(4,sroll);
		System.out.println(pstmt);
		pstmt.executeUpdate();
		System.out.println("program done........");
		
		con.close();   
		
	}

}
