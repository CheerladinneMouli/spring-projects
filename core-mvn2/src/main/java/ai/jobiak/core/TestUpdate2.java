package ai.jobiak.core;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

//import com.mysql.cj.xdevapi.Statement;
public class TestUpdate2 {

	public static void main(String[] args)throws SQLException {
		String userName = "root";
		String password = "admin";
		String url = "jdbc:mysql://localhost:3306/world";
		Connection con = DriverManager.getConnection(url,userName,password);
		java.sql.Statement st = con.createStatement();
		String selectSql = "Select * from Customer where idcustomer = 101";
		
		ResultSet rs = st.executeQuery(selectSql);
		
		while(rs.next()){
			System.out.println("data found");
			System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
			
			
		}


	}

}
