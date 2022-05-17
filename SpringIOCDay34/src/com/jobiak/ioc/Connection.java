package com.jobiak.ioc;
public class Connection {

	public Connection getconnection() {
		System.out.println("Preapared to connection.....");
		return new Connection();
	}
}
