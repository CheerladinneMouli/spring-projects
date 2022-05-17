package ai.jobiak.core;

import java.sql.*;
import java.util.Scanner;

public class Aadhar {                                                                                                                                                                                                  
	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);
		System.out.println("******************WELCOME TO AADHAR SEVA***************");
		System.out.println();
		System.out.println("1. APPLY FOR NEW AADHAR");
		System.out.println("2. MODIFY DETAILS IN AADHAR");
		System.out.println("3. VIEW YOUR AADHAR");
		System.out.println("4. ADMIN");
		System.out.println("5.EXIT");
		System.out.println(" ENTER YOUR CHOICE ");
		int choice = sc.nextInt();
		int Aadhar_no ;
		String first_name;
		String last_name;
		int age;
		int dob;
		long mobileno ;
		String mailid ;
		String gender = null;
		int choose;
				                                                                                                                                                              
		

		String userName = "root";
		String passWord = "admin";
		String url = "jdbc:mysql://localhost:3306/world";
		
		Connection con =DriverManager.getConnection(url,userName,passWord);
		System.out.println(con);
		Statement stmt = con.createStatement();
		
		
		switch(choice) {
		
		case 1:
			System.out.println("Enter details for Your Application");
			System.out.println("Enter your Aadhar number : ");
			Aadhar_no = sc.nextInt();
			System.out.println("Enter your First name : ");
			first_name=sc.next();
			System.out.println("Enter your last name : ");
			last_name=sc.next();
			System.out.println("Enterr your age");
			age = sc.nextInt();
			System.out.println("Enterr your dob");
			dob = sc.nextInt();
			System.out.println("Enter your gender");
			gender = sc.nextLine();
			System.out.println("Enter your  mobile number : ");
			mobileno = sc.nextLong();
			System.out.println("Enter mailid");
			mailid = sc.next();
			
			
			String insertsql = "insert into application (Aadhar_no,first_name,last_name,age,dob,gender,mobileno,mailid) values(?,?,?,?,?,?,?,?)";
			
			PreparedStatement pstmt = con.prepareStatement(insertsql);
			
			pstmt.setInt(1,Aadhar_no);
			pstmt.setString(2,first_name);
			pstmt.setString(3,last_name);
			pstmt.setInt(4, age);
			pstmt.setInt(5,dob);
			pstmt.setString(6,gender);
			pstmt.setLong(7, mobileno);
			pstmt.setString(8,mailid);

			int count = pstmt.executeUpdate();
			System.out.println(count+ " Applicants data inserted.......");
	
			break;
			
		case 2:
			System.out.println(" Enter the details for modifying your aadhar");	
			
			String modify = "update application set name = ?, age=?, mobileno = ?,mailid = ? where Aadhar_no = ?";
			String modify1 = "update application where Aadhar_no =? ,set name = ?, age=?, mobileno = ?" ;
			
			System.out.println("enter your Adhar number");
			Aadhar_no = sc.nextInt();
			System.out.println("Re-enter your Adhar number");
			Aadhar_no = sc.nextInt();
 
			System.out.println("enter first name");
			first_name = sc.next();
			System.out.println("enter last name");
			last_name = sc.next();
			System.out.println("enter correct age");
			age = sc.nextInt();
			System.out.println("enter your dob");
			dob = sc.nextInt();
			System.out.println("enter correct mobno");
			mobileno = sc.nextLong();
			System.out.println("enter mailid");
			mailid = sc.next();
			System.out.println("enter serial number");
			Aadhar_no = sc.nextInt();

			PreparedStatement pstmt1 = con.prepareStatement(modify1);
			
			
			pstmt1.setString(1,first_name);
			pstmt1.setString(2,last_name);
			pstmt1.setInt(3, age);
			pstmt1.setInt(4,dob);
			pstmt1.setString(5,gender);
			pstmt1.setLong(6, mobileno);
			pstmt1.setString(7,mailid);
			pstmt1.setInt(8,Aadhar_no);
			
			int count2= pstmt1.executeUpdate();
			System.out.println(count2+  " record updated...");
			System.out.println("  SUCCESSEFULLY UPDATED YOUR DETAILS IN AADHAR  ");
			
			
			
			
	
			break;
			
		case 3:
			System.out.println(" View your aadhar ");
			
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		
			
			String selectSql = "select * from application";  //display particular row
			ResultSet rs = st.executeQuery(selectSql);
			choose= sc.nextInt();
			rs.absolute(choose);
			
			
			System.out.println(rs.getString(1)+" :: "+rs.getString(2)+" :: "+rs.getString(3)+" :: "+rs.getString(4)+" :: "+rs.getString(5)+" :: "+rs.getString(6)+" :: "+rs.getString(7)+" :: "+rs.getString(8)); 
			
			break;
			
		case 4:
				System.out.println("===============WELCOME TO ADMIN PAGE=================   ");
				
			   String adminId = "Admin@123";
			   String adminPassword = "Aadhar@456";
			   
			   System.out.println("Enter The adminId :     ");
				String ausername = sc.next();
				
				if(adminId.equals(ausername)) {
					System.out.println("Enter admin Password:      ");
					String apassword = sc.next();
					if(adminPassword.equals(apassword)) {
						System.out.println("ADMIN Logged in successfully....");
						
				System.out.println("THE APPLICANTS DATA IS SHOWN BELOW................");		
					String selsectSql = "Select * from application";
						ResultSet rs1 = stmt.executeQuery(selsectSql);
						while(rs1.next()) {
							
							System.out.println(rs1.getString(1)+" :: "+rs1.getString(2)+" :: "+rs1.getString(3)+" :: "+rs1.getString(4));  
						} 
					
					}
				}
				else {
					System.out.println("Invalid AdminId Or PassWord....");
					System.out.println("please enter correct ADMIN details ");
				}
		 default:
			System.out.println("Exit from the page................");
		     
			
		}
		
		
	}

	
	
}