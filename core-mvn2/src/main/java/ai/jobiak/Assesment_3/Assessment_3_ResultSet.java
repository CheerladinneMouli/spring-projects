package ai.jobiak.Assesment_3;
import java.sql.*;
import java.util.Scanner;
public class Assessment_3_ResultSet {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		System.out.println("******************JOBIAK MAIL INBOX***************");
		System.out.println();
		System.out.println("1.first mail");
		System.out.println("2.next mail");
		System.out.println("3.previous mail");
		System.out.println("4.last mail");
		System.out.println("5. Go to Position");
		System.out.println("6.exit mail box");
		System.out.println(" ENTER YOUR CHOICE ");
	        Class.forName("com.mysql.cj.jdbc.Driver");
						
				String userName = "root";
				String passWord = "admin";
				String url = "jdbc:mysql://localhost:3306/world";
						Connection con = DriverManager.getConnection(url,userName,passWord);
						Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
						ResultSet rs = stmt.executeQuery("Select * from mailbox ");
	
		while(true){
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch(choice) {
			case 1: 
				if(rs.first()== true)
					System.out.println("From: "+ rs.getString(1)+"  "+ "Subject : "+ rs.getString(2)+"  "+ "Content: "+ rs.getString(3)+"  "+"Content Size: "+ rs.getString(4));	
				else {
					System.out.println("Mail box is empty");
				}
				break;
			case 2:
				if(rs.next()==true)
					System.out.println("From: "+ rs.getString(1)+"  "+ "Subject : "+ rs.getString(2)+"  "+ "Content: "+ rs.getString(3)+"  "+"Content Size: "+ rs.getString(4));	
				else {
					System.out.println("This is the last mail");
				}
				break;
			case 3:
				if(rs.previous()==true)
					System.out.println("From: "+ rs.getString(1)+"  "+ "Subject : "+ rs.getString(2)+"  "+ "Content: "+ rs.getString(3)+"  "+"Content Size: "+ rs.getString(4));	
				else {
					System.out.println("This is the First mail");
				}
				break;
			case 4:
				if(rs.last()==true)
					System.out.println("From: "+ rs.getString(1)+"  "+ "Subject : "+ rs.getString(2)+"  "+ "Content: "+ rs.getString(3)+"  "+"Content Size: "+ rs.getString(4));	
				else {
					System.out.println("This is the last mail");
				}
				break;
			case 5:
				System.out.println("Enter the position You want to go");
				choice = sc.nextInt();
				if(rs.absolute(choice))
					System.out.println("From: "+ rs.getString(1)+"  "+ "Subject : "+ rs.getString(2)+"  "+ "Content: "+ rs.getString(3)+"  "+"Content Size: "+ rs.getString(4));	
				else {
					System.out.println("There is no mail that you want");
				}
				break;
			default:{
				System.out.println("There are no mails that you want");
			}
			}
		}
	}
}
				
				
				
					
				
					