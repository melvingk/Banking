import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.qa.BankOfMe.Banking;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;

public class BankApp {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BankApp window = new BankApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BankApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	
	JFrame window = new JFrame ("Banking");
	
	private void initialize() {
		

			
		
			JButton creatingButton =new JButton("Create Account");
			JButton depositingButton =new JButton("Deposit Money");

			
			Label CreateL = new Label();
			Label DepositL = new Label();
			
//			FlowLayout fl = new FlowLayout();
//			FlowLayout f2 = new FlowLayout();
			Panel topP = new Panel();
			Panel bottomP= new Panel();
//			GridLayout table = new GridLayout (2,2);
//			GridLayout table1 = new GridLayout (2,2);
			
//	
//			window.setLayout(fl);
//			window.setLayout(f2);		
//			window.getContentPane().setLayout(table);
//			window.getContentPane().setLayout(table1);
////			
			topP.add(CreateL);
			topP.add(creatingButton);
			
			topP.add(DepositL);
			topP.add(depositingButton);
			bottomP.setLayout(new BoxLayout(bottomP, BoxLayout.X_AXIS));
			Label WithdrawL = new Label();
			bottomP.add(WithdrawL);
			JButton withdrawingButton =new JButton("Withdraw Money");
			bottomP.add(withdrawingButton);
			
			
			withdrawingButton.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent x)
				{
					window.setVisible(false);
					Banking withdraw = new Banking();
					withdraw.withdrawMonies();		
				}		
			});
			JButton checkBalanceButton =new JButton("Check Balance");
			bottomP.add(checkBalanceButton);
			
			checkBalanceButton.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent x)
				{
					window.setVisible(false);
					Banking check = new Banking();
					check.checkBalance();		
				}		
			});
			Label CheckbalanceL = new Label();
			bottomP.add(CheckbalanceL);
			
			window.getContentPane().add(topP);
			window.getContentPane().add(bottomP);
			
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

			depositingButton.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent x)
				{
					window.setVisible(false);
					Banking deposit = new Banking();
					deposit.depositMonies();		
				}		
			});
			

			
		
			
			
		}

	}
