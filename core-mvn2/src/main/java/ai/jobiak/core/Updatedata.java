package ai.jobiak.core;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Updatedata {

	public static void main(String[] args) throws SQLException {
		String userName = "root";
		String password = "admin";
		String url = "jdbc:mysql://localhost:3306/world";
		Connection con = DriverManager.getConnection(url,userName,password);
		Statement stmt = con.createStatement();
		System.out.println("Inserting records into the table...");          
        String sql = "INSERT INTO student VALUES (100, 'Zara', 'Ali', 18)";
        stmt.executeUpdate(sql);
        sql = "INSERT INTO student VALUES (101, 'Mahnaz', 'Fatma', 25)";
        stmt.executeUpdate(sql);
        sql = "INSERT INTO student VALUES (102, 'Zaid', 'Khan', 30)";
        stmt.executeUpdate(sql);
        sql = "INSERT INTO student VALUES(103, 'Sumit', 'Mittal', 28)";
        stmt.executeUpdate(sql);
        System.out.println("Inserted records into the table..."); 


	}

}
