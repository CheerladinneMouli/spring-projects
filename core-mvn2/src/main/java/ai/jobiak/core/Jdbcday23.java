package ai.jobiak.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbcday23 {

public static void main(String[] args)throws SQLException {
			
			String userName = "root";
			String password = "admin";
			String url = "jdbc:mysql://localhost:3306/world";
			Connection con = DriverManager.getConnection(url,userName,password);
			
			String names[]= {"Li","Xi","Xing","Lee","Pie","Poo","Woo","Wan","Zang"};
			double deposits[]= {200,320,650,730,587,790,565,98,546};
			
			for(int i=0;i<names.length;i++) {
			PreparedStatement pstmt = con.prepareStatement("insert into customer values(?,?,?)");
			pstmt.setInt(1,i+102);
			pstmt.setString(2,names[i]);
			pstmt.setDouble(3,deposits[i]);
			
			long count =pstmt.executeLargeUpdate();
			System.out.println(count+"record inserted");
			}

	}

}
