package ai.jobiak.servlets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Employeeregistration {
	public int register(Employee employee) throws ClassNotFoundException, SQLException {
	String sql = "insert into registration"+"(empid,firstname,lastname,username,password,address,mobileno)values"+"(?,?,?,?,?,?,?);";
	int result =0;
	String userName = "root";
	String passWord = "admin";
	String url = "jdbc:mysql://localhost:3306/world";
		
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
		try(Connection con = DriverManager.getConnection(url,userName,passWord);
			PreparedStatement stmt = con.prepareStatement(sql)){
			
			stmt.setString(1,employee.getEmpid());
			stmt.setString(2,employee.getFirstname());
			stmt.setString(3,employee.getLastname());
			stmt.setString(4,employee.getUsername());
			stmt.setString(5,employee.getPassword());
			stmt.setString(6,employee.getAddress());
			stmt.setString(7,employee.getMobileno());
			System.out.println(stmt);
			result=stmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

}
