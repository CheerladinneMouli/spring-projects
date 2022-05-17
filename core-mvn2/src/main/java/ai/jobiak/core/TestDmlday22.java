package ai.jobiak.core;
import java.sql.*;
public class TestDmlday22 {

	public static void main(String[] args)throws SQLException {
	
		String userName = "root";
		String password = "admin";
		String url = "jdbc:mysql://localhost:3306/world";
		
		Connection con = DriverManager.getConnection(url,userName,password);
		Statement stmt = con.createStatement();
		String insertSql = "insert into customer values(101,'Pavani',6000)";
		String insert = "insert into customer values(102,'wang',300)";
		String insertSql2 = "insert into customer values(103,'Kin jong',200)";
		String insertSql3 = "insert into customer values(114,'Jack',500)";
		String insertSql4 = "insert into customer values(115,'Jim',700)";
		String insertSql5 = "insert into customer values(116,'Sana',1000)";
		String insertSql6 = "insert into customer values(117,'Sam',1010)";
		String insertSql7 = "insert into customer values(118,'Jack ma',10000)";
		String insertSql8 = "insert into customer values(119,'George',1500)";
		String insertSql9 = "insert into customer values(121,'Henry',2000)";
		long count = stmt.executeUpdate(insertSql);
		long count1 = stmt.executeUpdate(insertSql);
		long count2 = stmt.executeUpdate(insertSql);
		long count3 = stmt.executeUpdate(insertSql);
		long count4 = stmt.executeUpdate(insertSql);
		long count5 = stmt.executeUpdate(insertSql);
		long count6 = stmt.executeUpdate(insertSql);
		long count7 = stmt.executeUpdate(insertSql);
		long count8 = stmt.executeUpdate(insertSql);
		long count9 = stmt.executeUpdate(insertSql);
		
		System.out.println(count);
		System.out.println(count1);
		System.out.println(count2);
		System.out.println(count3);
		System.out.println(count4);
		System.out.println(count5);
		System.out.println(count6);
		System.out.println(count7);
		System.out.println(count8);
		System.out.println(count9);
	}

}
