package com.cgi;

public class MySqlDB implements DSource {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
			System.out.println("connect with mysqldb");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("disconnect with mysqldb");
	}

}
