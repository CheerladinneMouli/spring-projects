package ai.jobiak.core;
import java.sql.*;
public class Testjdbc2 {

			public static void main(String[] args) {

				//1.Load the driver class
				
				try {
					
					Class.forName("com.mysql.cj.jdbc.Driver");
				}catch(ClassNotFoundException e) {
					
					e.printStackTrace();
				}
				
				
			//2.Connect with Driver Manager........
				String userName = "root";
				String passWord = "admin";
				String url = "jdbc:mysql://localhost:3306/world";
				
				try {
					Connection con = DriverManager.getConnection(url,userName,passWord);
					System.out.println("Connected to db......");
					         DatabaseMetaData dmd = con.getMetaData();
					         System.out.println(dmd.getDriverName());
					         System.out.println(dmd.getDriverVersion());
					         System.out.println(dmd.getDriverMinorVersion());
					         System.out.println(dmd.getDatabaseProductName());
					         
				}catch(SQLException e) {
					e.printStackTrace();
				}
				
				
				
			}


	}

