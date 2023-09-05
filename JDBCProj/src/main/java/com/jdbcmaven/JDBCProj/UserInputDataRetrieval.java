package com.jdbcmaven.JDBCProj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

public class UserInputDataRetrieval {
	public static void main(String[] args) throws ClassNotFoundException, 
	SQLException {
		System.out.println("Enter EmpID");
		Scanner sc=new Scanner(System.in);
		int empID=sc.nextInt();
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 System.out.println("Connecting to a selected database...");
	 Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/q1","root","Mf112233");
	 String sql = "SELECT * FROM employee WHERE EmpID=?";
	 PreparedStatement preparedStatement=connection.prepareStatement(sql);
	 preparedStatement.setInt(1, empID);
	 ResultSet resultSet=preparedStatement.executeQuery();
	 if(resultSet.next()) {
		  String empName = resultSet.getString("EmpName");
          String designation = resultSet.getString("Designation");
          String qualification = resultSet.getString("Qualification");
          String dob = resultSet.getString("DOB");
          String contact = resultSet.getString("ContactNum");
          String city = resultSet.getString("CurrentCity");
          String salary = resultSet.getString("SALARY");
          System.out.println("EmpName: " + empName);
          System.out.println("Designation: " + designation);
          System.out.println("Qualification: " + qualification);
          System.out.println("DOB: " + dob);
          System.out.println("Contact Number: " + contact);
          System.out.println("Current City: " + city);
          System.out.println("Salary: " + salary);
          
          SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
          String timestamp = dateFormat.format(new Date());
          
          try (FileWriter writer = new FileWriter("C:\\Users\\mohammad.farooque\\Documents\\EmployeeDetails.txt", true)) {
              writer.write("Timestamp: " + timestamp + "\n");
              writer.write("EmpID: " + empID + "\n");
              writer.write("EmpName: " + empName + "\n");
              writer.write("Designation: " + designation + "\n");
              writer.write("Qualification: " + qualification + "\n");
              writer.write("DOB: " + dob + "\n");
              writer.write("Contact Number: " + contact + "\n");
              writer.write("Current City: " + city + "\n");
              writer.write("Salary: " + salary + "\n");
              writer.write("\n"); 
          } catch (IOException e) {
              e.printStackTrace();
          }
      } else {
          System.out.println("No data found for EmpID: " + empID);
      }
        		  
          
	 }
	}
	
