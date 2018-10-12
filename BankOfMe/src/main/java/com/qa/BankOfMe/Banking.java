package com.qa.BankOfMe;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Banking {
	
	static int account = 0;
	static TextField amountField = new TextField(10);
	static TextField idField = new TextField(10);
	TextField accNo = new TextField(10);
	static TextField nameField = new TextField(10);
	static TextField addressField = new TextField(10);
	static TextField balance;

	public void creatingAnAccount () {
		
		final JFrame window = new JFrame ("Create Account");
		
		JLabel nameL = new JLabel("Name : ");
		JLabel addressL = new JLabel("Address : ");
		JLabel accNoL = new JLabel("Your New Account : ");
		
		final JButton createB = new JButton("Create");
		createB.addActionListener( new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				BankDatabase.create(nameField.getText(), addressField.getText());
				if(createB.isSelected()) {
					account++;
					accNo.setText(String.valueOf(account));
					
				//saccNo=setText(Integer.parseInt(accNo.se);
				
				
				}
			}
		});
		
		JButton goBack = new JButton("Return");
		goBack.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent x)
			{
				
				Runner home = new Runner();
				home.window.setVisible(true);
				window.setVisible(false);
				
			}		
		});
			
		JPanel topP = new JPanel();
		JPanel centerP= new JPanel();
		JPanel bottomP= new JPanel();
		
		GridLayout table = new GridLayout (4,4);
		centerP.setLayout(table);
		FlowLayout fl = new FlowLayout();
		
		window.setLayout(fl);
		
		window.add(nameL);
		window.add(nameField);
		
		window.add(addressL);
		window.add(addressField);
				
		window.add(createB);
		window.add(goBack);
		
		
		window.add(bottomP);
		
		bottomP.add(accNoL);
		bottomP.add(accNo);

		
	
		window.setSize(400,400);
		window.setVisible(true);

	}
	
	public void depositMonies () {
		
	final JFrame window = new JFrame ("Depositing");
	
	JLabel amountL = new JLabel("Amount : ");
	JLabel nameL = new JLabel("Account Number : ");
	
	
	
	JButton DepositB = new JButton("Deposit");
	DepositB.addActionListener( new ActionListener() {

		public void actionPerformed(ActionEvent x) {
			
			BankDatabase.deposit(idField.getText(), amountField.getText());
		}
	});

	
	JButton goBack = new JButton("Return");
	goBack.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent x)
		{
			
			Runner home = new Runner();
			home.window.setVisible(true);
			window.setVisible(false);
			
		}		
	});
	Panel topP = new Panel();
	Panel centerP= new Panel();
	Panel bottomP= new Panel();
	
	GridLayout table = new GridLayout (4,4);
	centerP.setLayout(table);
	
	FlowLayout fl = new FlowLayout();
	
	window.setLayout(fl);
	
	window.add(nameL);
	window.add(idField);
	
	window.add(amountL);
	window.add(amountField);
			
	window.add(DepositB);
	window.add(goBack);

	window.setSize(400,400);
	window.setVisible(true);
}
	

	public void withdrawMonies () {
		
		final JFrame window = new JFrame ("Withdrawl");
		
		JLabel nameL = new JLabel("ID : ");
		JLabel amountL = new JLabel("Amount : ");

		JButton withdrawB = new JButton("Withdraw");
		withdrawB.addActionListener( new ActionListener() {

			public void actionPerformed(ActionEvent x) {
				
				BankDatabase.withdraws(idField.getText(), amountField.getText());
			}
		});
		
		JButton goBack = new JButton("Return");
		goBack.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent x)
			{
				
				Runner home = new Runner();
				home.window.setVisible(true);
				window.setVisible(false);
				
			}		
		});

		Panel topP = new Panel();
		Panel centerP= new Panel();
		Panel bottomP= new Panel();
		
		GridLayout table = new GridLayout (4,4);
		centerP.setLayout(table);
		
		FlowLayout fl = new FlowLayout();
		
		window.setLayout(fl);
		
		window.add(nameL);
		window.add(idField);
		
		
		window.add(amountL);
		window.add(amountField);
				
		window.add(withdrawB);
		window.add(goBack);

		window.setSize(400,400);
		window.setVisible(true);

}
	
public void checkBalance() {
		
		final JFrame window = new JFrame ("Check Balance");
		
		
		JLabel accNoL = new JLabel("AccNo : ");
		final JLabel nameL = new JLabel("Name : ");
		final JLabel addressL = new JLabel("Address : ");
		final JLabel balanceL = new JLabel("Balance : ");
		balance = new TextField(10);
		
		JButton checkB= new JButton("Check");
		checkB.addActionListener( new ActionListener() {

			public void actionPerformed(ActionEvent x) {
				
				BankDatabase.theBalance(accNo.getText());
			}
		});
		JButton goBack = new JButton("Return");
		goBack.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent x)
			{
				
				Runner home = new Runner();
				home.window.setVisible(true);
				window.setVisible(false);
				
			}		
		});
	
		Panel topP = new Panel();
		Panel centerP= new Panel();
		Panel bottomP= new Panel();
		
		GridLayout table = new GridLayout (4,4);
		centerP.setLayout(table);
		
		FlowLayout fl = new FlowLayout();
		
		window.setLayout(fl);
		
		window.add(accNoL);
		window.add(accNo);
				
		window.add(nameL);
		window.add(nameField);
		
		window.add(addressL);
		window.add(addressField);
		
		window.add(balanceL);
		window.add(balance);
				
		window.add(checkB);
		window.add(goBack);
	
		window.setSize(400,400);
		window.setVisible(true);
		
	}

	
}
