package ai.jobiak.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Countries {
		public static void main(String[] args)throws SQLException {
			
			String userName = "root";
			String password = "admin";
			String url = "jdbc:mysql://localhost:3306/world";
			
			Connection con = DriverManager.getConnection(url,userName,password);
			Statement stmt = con.createStatement();
			String insertSql = "insert into world.countries values('Asia','India','Syam','Anitha',300000,200000)";
			String insertSql1="insert into world.countries values('Asia','India','Srikanth','Swapna',303000,205000)";
			String insertSql2="insert into world.countries values('Asia','India','Sundaram','Sakunthala',403000,203000)";
			String insertSql3="insert into world.countries values('Asia','India','Vamsi','Nayana',404000,103000);";
			String insertSql4="insert into world.countries values('Asia','India','Sasi','Sunandhana',423000,243000)";
			String insertSql5="insert into world.countries values('Asia','India','Gopi','Girija',435540,246686)";
			String insertSql6="insert into world.countries values('Asia','India','Pavan','Pavani',535540,346686)";
			String insertSql7="insert into world.countries values('Asia','India','Preveen','Bargavi',535630,142456)";
			String insertSql8=" insert into world.countries values('Asia','India','Surya','Mona',635630,442456)";
			String insertSql9=" insert into world.countries values('Asia','India','Surya','Mona',635630,442456)";
					
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
