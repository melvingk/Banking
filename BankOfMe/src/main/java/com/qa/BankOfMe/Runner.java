package com.qa.BankOfMe;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Runner {
	static JFrame window = new JFrame ("Banking");
	
	public static void main(String[] args) {
		
	
		JButton creatingButton =new JButton("Create Account");
		JButton depositingButton =new JButton("Deposit Money");
		JButton withdrawingButton =new JButton("Withdraw Money");
		JButton checkBalanceButton =new JButton("Check Balance");
		JButton exitButton =new JButton("Exit");
		
		Label CreateL = new Label();
		Label DepositL = new Label();
		Label WithdrawL = new Label();
		Label CheckbalanceL = new Label();
		
		FlowLayout fl = new FlowLayout();
		FlowLayout f2 = new FlowLayout();
		Panel topP = new Panel();
		Panel bottomP= new Panel();
		GridLayout table = new GridLayout (2,1);
		GridLayout table1 = new GridLayout (2,2);
		
//		
		//topP.setLayout(fl);
		//bottomP.setLayout(fl);
		//window.setLayout(fl);
		//window.setLayout(f2);		
		window.setLayout(table);
		//window.setLayout(table1);
//		
		topP.add(CreateL);
		topP.add(creatingButton);
		
		topP.add(DepositL);
		topP.add(depositingButton);
	
		bottomP.add(WithdrawL);
		bottomP.add(withdrawingButton);
		bottomP.add(CheckbalanceL);
		bottomP.add(checkBalanceButton);
		bottomP.add(exitButton);
		
		window.add(topP);
		window.add(bottomP);
		window.setSize(400,400);
		window.setVisible(true);
		
		creatingButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent x)
					{
						window.setVisible(false);
						Banking creating = new Banking();
						creating.creatingAnAccount();	
					}		
				});
		
		checkBalanceButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent x)
			{
				window.setVisible(false);
				Banking check = new Banking();
				check.checkBalance();		
			}		
		});

		depositingButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent x)
			{
				window.setVisible(false);
				Banking deposit = new Banking();
				deposit.depositMonies();		
			}		
		});
		
		withdrawingButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent x)
			{
				window.setVisible(false);
				Banking withdraw = new Banking();
				withdraw.withdrawMonies();		
			}		
		});
		
		exitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent x)
			{
				window.setVisible(false);
				
			}		
		});
		
	
		
		
	}

}
