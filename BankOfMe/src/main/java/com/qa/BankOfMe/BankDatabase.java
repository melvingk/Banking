package com.qa.BankOfMe;

import java.awt.TextField;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JLabel;

public class BankDatabase {
	static Connection con =null;
	static Statement st = null;
	
	public static void create(String name, String address) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankingschemaforme","root","password");
			st = con.createStatement();
			System.out.println(name);
			String query = "INSERT INTO account VALUES(null, '"+name+"','"+address+"')";
			System.out.println(query);
			st.executeUpdate(query);
			st.close();
			con.close();
		}catch(Exception se) {
			System.out.println(se.toString());
		}
		
		
	}
	public static void deposit(String id, String amount) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankingschemaforme","root","password");
			st = con.createStatement();
			String query = "INSERT INTO deposit VALUES("+Integer.parseInt(id)+","+Double.parseDouble(amount)+",CURDATE())";
			System.out.println(query);
			st.executeUpdate(query);
			st.close();
			con.close();
		}catch(Exception se) {
			System.out.println(se.toString());
		}
	}
	public static void withdraws(String id, String amount) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankingschemaforme","root","password");
			st = con.createStatement();
			System.out.println(id);
			System.out.println(amount);
			String query = "INSERT INTO withdraws VALUES("+Integer.parseInt(id)+","+Double.parseDouble(amount)+",CURDATE())";
			System.out.println(query);
			st.executeUpdate(query);
			st.close();
			con.close();
		}catch(Exception se) {
			System.out.println(se.toString());
		
		}
	}
	
	public static void theBalance (String id) {
			
		int deposits = 0;
		int withdraws = 0;

		try {
			
			String names="";
			String addresses="";
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankingschemaforme","root","password");
			st = con.createStatement();
			
			ResultSet rs = st.executeQuery("SELECT * FROM deposit WHERE AccNo="+id);
			while(rs.next()) 
			{
				int amount = rs.getInt("Amount");
				deposits += amount;
				System.out.println(amount);
				
			}
			rs.close();
			ResultSet rsWithdraws = st.executeQuery("SELECT * FROM withdraws WHERE AccNo="+id);
			while(rsWithdraws.next()) 
			{
				int amount = rsWithdraws.getInt("Amount");
				System.out.println(rsWithdraws.getInt("Amount"));
				withdraws += amount;
			}
			rsWithdraws.close();
			ResultSet rsAccount = st.executeQuery("SELECT * from account WHERE AccNo="+id);
			while(rsAccount.next()) 
			{
				names = rsAccount.getString("Name");
				addresses = rsAccount.getString("Address");
				System.out.println(names);
				System.out.println(addresses);
			}
			rsAccount.close();
			Banking bank = new Banking();
			bank.nameField.setText( names);
			bank.addressField.setText(addresses);
			bank.balance.setText(Integer.toString(deposits-withdraws));

			st.close();
			con.close();
			
		} catch(Exception se) 
		{
			System.out.println(se.getMessage());
			se.printStackTrace();
		}
			
		
	}
	
	

}
