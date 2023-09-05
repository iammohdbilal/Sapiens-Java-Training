package com.jdbcmaven.JDBCProj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TruncateTable {
	public static void main(String[] args) throws ClassNotFoundException, 
	SQLException {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 System.out.println("Connecting to a selected database...");
	 Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/q1","root","Mf112233");
	 Statement statement = connection.createStatement();
	 String sql = "TRUNCATE TABLE employee;";
	 statement.executeUpdate(sql);
	 System.out.println("Success");
	 connection.close();
	 }
}
