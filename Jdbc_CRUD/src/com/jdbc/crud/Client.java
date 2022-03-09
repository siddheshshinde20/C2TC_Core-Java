package com.jdbc.crud;

import java.sql.Connection;

public class Client {

	public static void main(String[] args) {
	Connection connection=	DBUtil.getConnection();
	if (connection !=null) {
	     System.out.println("JDBC: Connection is established");
	}

	}

}
