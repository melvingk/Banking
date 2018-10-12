package com.qa.CalculatorPart2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Runner {
	public static void main(String[] args) {
		
		Frame window = new Frame ("calculator");
		Panel topP = new Panel();
		Panel centerP= new Panel();
		GridLayout table = new GridLayout (4,4);
		centerP.setLayout(table);
		
		TextField T = new TextField (30);		
		
		CalOperations E = new CalOperations(T);
		
		Button B1= new Button("1");
		Button B2= new Button("2");
		Button B3= new Button("3");
		Button B4= new Button("4");
		Button B5= new Button("5");
		Button B6= new Button("6");
		Button B7= new Button("7");
		Button B8= new Button("8");
		Button B9= new Button("9");
		Button Ba= new Button("+");
		Button Bs= new Button("-");
		Button Bt= new Button("*");
		Button Bd= new Button("/");
		
		B1.addActionListener(E);
		B2.addActionListener(E);
		B3.addActionListener(E);
		B4.addActionListener(E);
		B5.addActionListener(E);
		B6.addActionListener(E);
		B7.addActionListener(E);
		B8.addActionListener(E);
		B9.addActionListener(E);
		Ba.addActionListener(E);
		Bs.addActionListener(E);
		Bt.addActionListener(E);
		Bd.addActionListener(E);
		
		
		topP.add(T);
				
	
		centerP.add(B1);
		centerP.add(B2);
		centerP.add(B3);
		centerP.add(Ba);
		centerP.add(B4);
		centerP.add(B5);
		centerP.add(B6);
		centerP.add(Bs);
		centerP.add(B7);
		centerP.add(B8);
		centerP.add(B9);
		centerP.add(Bt);
		centerP.add(Bd);
		
		window.add(topP, BorderLayout.NORTH);
		window.add(centerP, BorderLayout.CENTER);
		
		window.setSize(400,400);
		window.setVisible(true);
		
		
		
	}
	
	
	

}
