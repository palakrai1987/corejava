package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabseConnection {

	private static Connection conn;
	public static Connection getConn()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root", "localhost");
		}
		catch(Exception e)
		{e.printStackTrace();}
		return conn;
	}
	
}