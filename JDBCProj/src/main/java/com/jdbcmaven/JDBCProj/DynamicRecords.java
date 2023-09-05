package com.jdbcmaven.JDBCProj;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicRecords {
	public static void main(String[] args) throws ClassNotFoundException, 
	SQLException {
	 //Entering the data
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter the number of entries you want to add dynamically");
	 int entry_quant=scanner.nextInt();
	 for(int i=0;i<entry_quant;i++) {
	 System.out.println("Enter EmpId:");
	 String id = scanner.next();
	 System.out.println("Enter EmpName:");
	 String name = scanner.next();
	 System.out.println("Enter Designation:");
	 String designation = scanner.next();
	 System.out.println("Enter Qualification:");
	 String qualification = scanner.next();
	 System.out.println("Enter DOB:");
	 String dob = scanner.next();
	 System.out.println("Enter ContactNum:");
	 String contactNum = scanner.next();
	 System.out.println("Enter current city:");
	 String currCity = scanner.next();
	 System.out.println("Enter Salary:");
	 String salary = scanner.next();
	 System.out.println("Enter total experience :");
	 String experience = scanner.next();
	 
	 String sql = "insert into employee values('"+id+"','"+name+"','"+ designation+"','"+qualification+"','"+dob+"',"+contactNum+",'"+currCity+"',"+salary+","+experience+")";
			  //Creating the connection
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  System.out.println("Connecting to a selected database...");
			  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/q1","root","Mf112233");
					   Statement statement = connection.createStatement();
					   int result = statement.executeUpdate(sql);
					   if(result == 1) System.out.println("Transaction Successful "+sql);
					   else System.out.println("Transaction Failed");
					   connection.close();
	 }
	 
}
	}
