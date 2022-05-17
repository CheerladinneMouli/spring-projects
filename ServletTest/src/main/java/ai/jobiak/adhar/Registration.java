package ai.jobiak.adhar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Registration {
		public int register(Attributes att) throws ClassNotFoundException, SQLException {
		String sql = "insert into registration"+"(regid,firstname,lastname,dob,age,address,mobileno)values"+"(?,?,?,?,?,?,?);";
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
				
				stmt.setString(1,att.getRegid());
				stmt.setString(2,att.getFirstname());
				stmt.setString(3,att.getLastname());
				stmt.setString(4,att.getDob());
				stmt.setLong(5,att.getAge());
				stmt.setString(6,att.getAddress());
				stmt.setString(7,att.getMobileno());
				System.out.println(stmt);
				result=stmt.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return result;
		}

	}


	