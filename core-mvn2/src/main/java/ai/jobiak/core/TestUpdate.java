package ai.jobiak.core;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
public class TestUpdate {

	public static void main(String[] args)throws SQLException {
		String userName = "root";
		String password = "admin";
		String url = "jdbc:mysql://localhost:3306/world";
		
		Connection con = DriverManager.getConnection(url,userName,password);
		System.out.println("Connected to db.........:)   ");
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		//generic ->both ddl,dml,tcl(common or wider or super)
		String selectSql = "Select * from Customer";//SEQUEL or SQL syntax
		
		ResultSet rs = stmt.executeQuery(selectSql);
		
		//while(rs.next()){
			
			rs.afterLast();//enter which record to see 4 go to 4Th record first goto first record
			rs.previous();
			System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
			rs.first();
			System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
			rs.next();
			System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
			rs.absolute(4);//with reference first record
			System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
			rs.beforeFirst();
			System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3));
		
		}
	


	}


