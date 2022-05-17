package ai.jobiak.core;
import java.sql.*;


public class UpdateBalance {

	public static void main(String[] args)throws Exception {

		//1.Load the driver class

		Class.forName("com.mysql.cj.jdbc.Driver");
			
		
	//2.Connect with Driver Manager........
		String userName = "root";
		String passWord = "admin";
		String url = "jdbc:mysql://localhost:3306/world";
		
		
			Connection con = DriverManager.getConnection(url,userName,passWord);
			System.out.println("Connected to db......");
			
	
// Callable statement-> executing ->functions,procedures and REF cusors db objects			
//ex: procedure updateBalance(cusid,amount) updates the balance of the customer
			
	
			
			CallableStatement cs2 = con.prepareCall("{?=call updateBalancefunc(?,?)}");

			cs2.registerOutParameter(1,Types.BOOLEAN);
			cs2.setInt(2,102);
			cs2.setDouble(3,50);
			cs2.executeUpdate();
			
			
			//boolean result = cs2.execute();
			//System.out.println(result);
			
		
		
	}

}