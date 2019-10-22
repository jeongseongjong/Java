package com.biz.addr.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	private static Connection dbConn = null;
	
	static {
		String jdbcDriver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "user4";
		String password = "user4";
	
		try {
			Class.forName(jdbcDriver);
			dbConn = DriverManager.getConnection(url, user, password);
			System.out.println("DBConnection OK!!");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	public static Connection getDBConnection () {
		return dbConn;
	}
	
	
}
