package com.jobiak.ioc2;
import com.jobiak.ioc.*;
public class UseConnetion {
	public UseConnetion() {
	NewConnection con = new NewConnection();
	con.getnewconnection();
	System.out.println("Connection is established at"+ this.getClass());
	}
	
}
