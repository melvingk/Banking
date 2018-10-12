package com.qa.FramingShafeeq;

import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event implements ActionListener {
	
	TextField txt;
	
	public void actionPerformed(ActionEvent x)
	{
	
		txt.setText("helo");
		txt.setFont(new Font("Italic", 100, 50));
	}
	
	public Event (TextField x) {
		
		txt=x;
	}


}
