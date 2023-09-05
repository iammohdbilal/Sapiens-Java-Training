package com.jdbcmaven.JDBCProj;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDB {
	public static void main(String[] args) throws ClassNotFoundException, 
	SQLException {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection connection = 
	DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlconnection","root","Mf112233");
	 Statement statement = connection.createStatement();
	 String sql = "CREATE DATABASE Q1";
	 statement.executeUpdate(sql);
	 System.out.println("Success");
	 }
}
