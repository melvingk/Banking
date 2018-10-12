package com.qa.FramingShafeeq;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

import javax.swing.JInternalFrame;

public class Runner {
	
	public static void main(String[] args) {
		
		Frame F = new Frame ("Shafeeq");
		Button b1 = new Button("Click here");
		Button b2 = new Button("Click there");
		Button b3 = new Button("Click where?");
		Button b4 = new Button("Click the bear");
		TextField T = new TextField();
		
		Event E = new Event(T);
		
	
		
		F.add(b1,BorderLayout.NORTH);
		F.add(b2,BorderLayout.SOUTH);
		F.add(b3,BorderLayout.WEST);
		F.add(b4,BorderLayout.EAST);
		F.add(T,BorderLayout.CENTER);
		
		b1.addActionListener(E);
		
		F.setSize(400,400);
		F.setVisible(true);
//		
//		
//		JInternalFrame D8 = new JInternalFrame ("The Shafeeq");
//		Button c1 = new Button("Click here");
//		Button c2 = new Button("Click there");
//		Button c3 = new Button("Click where?");
//		Button c4 = new Button("Click the bear");
//		Button c5 = new Button("Click the gap");
//		
//		D8.add(c1,BorderLayout.NORTH);
//		D8.add(c2,BorderLayout.SOUTH);
//		D8.add(c3,BorderLayout.WEST);
//		D8.add(c4,BorderLayout.EAST);
//		
//		F.add(D8,BorderLayout.CENTER);
//		
//		D8.setSize(100,100);
//		D8.setVisible(true);
//		
//		
//		
		
		
		
		
		
		
		
	}

}
