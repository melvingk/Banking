package com.qa.DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainData {

	public static void main(String[] args) {
	
	Connection con = null;
	Statement stat = null;
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qac", "root", "password");
		
		stat = con.createStatement();
		String sql;
		sql = "SELECT * FROM qac;";
		ResultSet rs = stat.executeQuery(sql);
//		
//		stat = con.createStatement();
//		String sql1;
//		sql = "INSERT INTO FROM qac VALUES (55,'Peter','Kamau')";
//		ResultSet ds = executeUpdate(sql1);
//		
		while(rs.next()) {
			int id = rs.getInt("id");
			int age = rs.getInt("age");
			String first = rs.getString("first");
			String last = rs.getString("last");
			System.out.println("ID :" + id );
			System.out.println("Age :" + age);
			System.out.println("First :" + first );
			System.out.println("Last :" + last );
			
		}
	rs.close();
	stat.close();
	con.close();
		
	}
	catch(Exception se) {
		
	}

	}

}
