package ai.jobiak.core;
import java.sql.*;


public class TestResultSetDeletion {

	public static void main(String[] args)throws Exception {

		//1.Load the driver class

		Class.forName("com.mysql.cj.jdbc.Driver");
			
		
	//2.Connect with Driver Manager........
		String userName = "root";
		String passWord = "admin";
		String url = "jdbc:mysql://localhost:3306/world";
		
		
			Connection con = DriverManager.getConnection(url,userName,passWord);
			System.out.println("Connected to db......");
			
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		
			
			String selectSql = "select * from customer";  //sql syntax
			ResultSet rs = st.executeQuery(selectSql);
			
			if(rs.next()) {
				
				rs.absolute(12);
				rs.deleteRow();//upon deleting a record the cursor moves one row up and displays that record when we fetch
				
				System.out.println(rs.getInt(1)+ " :: "+rs.getString(2)+" :: "+rs.getString(3));
				
			}
			
		
		
	}

}