package com.jdbcmaven.JDBCProj;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws ClassNotFoundException, 
	SQLException {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 System.out.println("Connecting to a selected database...");
	 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/q1","root","Mf112233");
	 Statement statement = connection.createStatement();
	 String sql = "CREATE TABLE EMPLOYEE(\n" +
	    "EmpID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,\n"+
		"EmpName VARCHAR (100) NOT NULL,\n"+
		"DESIGNATION VARCHAR(100) NOT NULL,\n"+
	    "QUALIFICATION VARCHAR(100) NOT NULL,\n"+
		"DOB DATE NOT NULL,\n"+
	    "ContactNum VARCHAR(15),\n"+
		"CurrentCity VARCHAR(255),\n"+
	    "SALARY DECIMAL (18, 2), \n"+
		"TotalExperience INT\n"+");";
	    //"PRIMARY KEY (EmpID)\n" +");";
	 statement.executeUpdate(sql);
	 System.out.println("Success");
	 }
}
