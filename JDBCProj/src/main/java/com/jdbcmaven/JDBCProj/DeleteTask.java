package com.jdbcmaven.JDBCProj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteTask {
	public static void main(String[] args) throws ClassNotFoundException, 
	SQLException {
		System.out.println("Enter EmpID to delete");
		Scanner sc=new Scanner(System.in);
		int empID=sc.nextInt();
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 System.out.println("Connecting to a selected database...");
	 Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/q1","root","Mf112233");
	 String sql = "DELETE FROM employee WHERE EmpID = ?";
     PreparedStatement preparedStatement = connection.prepareStatement(sql);
     preparedStatement.setInt(1, empID);
     int rowsAffected = preparedStatement.executeUpdate();

     if (rowsAffected > 0) {
         System.out.println("Employee with EmpID " + empID + " has been deleted successfully.");
     } else {
         System.out.println("No records found for EmpID " + empID + ". No deletions performed.");
     }
	 connection.close();
	 sc.close();
	 }

}
