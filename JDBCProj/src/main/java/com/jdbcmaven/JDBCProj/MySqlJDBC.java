package com.jdbcmaven.JDBCProj;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlJDBC {
	public static void main(String[] args) {
		Connection con = null;
		try {
			con= (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlconnection","root","Mf112233");
			if(con!=null)
			{
				System.out.println("database is connected");
			}
		}catch(Exception e) {
			System.out.println("Not connected");
		}
	}
}
