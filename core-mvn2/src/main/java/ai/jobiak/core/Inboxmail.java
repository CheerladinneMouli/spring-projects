package ai.jobiak.core;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Inboxmail {

    public static void main(String[] args) throws Exception {
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	String userName = "root";
		String passWord = "admin";
		String url = "jdbc:mysql://localhost:3306/world";
		
		
		Connection con = DriverManager.getConnection(url,userName,passWord);
		System.out.println("Connected to db......");
        Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = st.executeQuery("select * from mailbox");//this is the jobiak mail box
        System.out.println("MAILS IN THE TABLE...");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " -> " + rs.getString(2));
        }
        rs.first();
        System.out.println("FIRST MAIL...");//we can fetch first mail
        System.out.println(rs.getInt(1) + " -> " + rs.getString(2)+ " -> " +rs.getString(3)+" -> "+rs.getString(4));
        rs.absolute(3);
        System.out.println("THIRD MAIL...");//we can get 3rd mail
        System.out.println(rs.getInt(1) + " -> " + rs.getString(2)+ " -> " +rs.getString(3)+" -> "+rs.getString(4));
        rs.last();
        System.out.println("LAST MAIL...");
        System.out.println(rs.getInt(1) + " -> " + rs.getString(2)+ " -> " +rs.getString(3)+" -> "+rs.getString(4));
        rs.previous();
        rs.relative(-1);
        System.out.println("LAST TO FIRST MAIL...");
        System.out.println(rs.getInt(1) + " -> " + rs.getString(2)+ " -> " +rs.getString(3)+" -> "+rs.getString(4));
        con.close();
    }

}