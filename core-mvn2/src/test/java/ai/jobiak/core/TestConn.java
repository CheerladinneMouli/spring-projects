package ai.jobiak.core;
import java.sql.*;
public class TestConn {

	public static void main(String[] args)throws SQLException {
		

		String userName = "root";
		String passWord = "admin";
		String url = "jdbc:mysql://localhost:3306/world";
		
		Connection con =DriverManager.getConnection(url,userName,passWord);
		System.out.println(con);
                 


                      String names[] = {"Li","Xi","Xing","Lee","Pie","Poo","Woo","wan","Zang","Chifu"};
		double deposits[] = {200,250,300,350,400,450,500,550,600,650};
		
		
		for(int i=1;i<names.length;i++) {
		PreparedStatement pstmt = con.prepareStatement("insert into customer values(?,?,?)");
		
		pstmt.setInt(1,i+201);
		pstmt.setString(2,names[i]);
		pstmt.setDouble(3,deposits[i]);
		
		int count = pstmt.executeUpdate();
		System.out.println(count+" record inserted");
		}
	}
}


  

