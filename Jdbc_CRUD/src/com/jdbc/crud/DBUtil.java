package com.jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	private static final String db_driver = "com.mysql.cj.jdbc.Driver";
	private static final String db_url ="jdbc:mysql://localhost:3306/jdbcdb";
	public static final String db_username = "root";
	public static final String db_password = "Shubhdaggg123";
	private static Connection con=null;
	
	static {
		try {
			Class.forName(db_driver);
			con = DriverManager.getConnection(db_url, db_username, db_password);
		} catch (ClassNotFoundException |SQLException e) {
			
		}
	}
	public static Connection getConnection() {
		return con;
	}
}
