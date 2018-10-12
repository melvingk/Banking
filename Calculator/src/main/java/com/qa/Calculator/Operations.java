package com.qa.Calculator;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Operations implements ActionListener {

		TextField tt1;
		TextField tt2;
		TextField tt3;
	

		public Operations(TextField a, TextField b, TextField c) {
			tt1=a;
			tt2=b;
			tt3=c;
			
		}
		public void actionPerformed(ActionEvent x) {
			
			int a=0;
			int b=0;
			int c=0;
			
			a=Integer.parseInt(tt1.getText());
			b=Integer.parseInt(tt2.getText());
			
			
			Button btn;
			btn = (Button) (x.getSource());
			String titlebtn = btn.getLabel();
			
			if(titlebtn.equals("+")) {
				c =a + b ;
			}
			else if (titlebtn.equals("-")) {
				c= a-b;
			}
			else if(titlebtn.equals("*")) {
				
				c = a * b;
			}
			else if (titlebtn.equals("/"))
			{
				c = a / b;
			}
			
			String result= String.valueOf(c);
			tt3.setText(result);
		}
	
	
}
