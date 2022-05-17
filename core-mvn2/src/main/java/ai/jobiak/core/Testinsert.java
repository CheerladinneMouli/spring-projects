package ai.jobiak.core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Testinsert {

	public static void main(String[] args) throws SQLException, IOException {
		String userName = "root";
		String password = "admin";
		String url = "jdbc:mysql://localhost:3306/world";
		Connection con = DriverManager.getConnection(url,userName,password);
		
		String FilePath = "courseList.csv";
		
		int batchSize = 10;
		String sql = "insert into courselist(CourseName,StudentName)"+"values(?,?)";
        PreparedStatement statement = con.prepareStatement(sql);
		
		
		BufferedReader lineReader = new BufferedReader(new FileReader(FilePath));
		String lineText = null;
		int count = 0;
		lineReader.readLine();
		
		while((lineText = lineReader.readLine())!=null) {
			String[] data = lineText.split(",");
			String CourseName = data[0];
			String StudentName = data[1];
			
			statement.setString(1,CourseName);
			statement.setString(2,StudentName);
			statement.addBatch();
			
			if(count % batchSize == 0) {
				statement.executeBatch();
			}
		}
		lineReader.close();
		statement.executeBatch();
		System.out.println("values inserted");
		con.close();
	}
	
	

}
