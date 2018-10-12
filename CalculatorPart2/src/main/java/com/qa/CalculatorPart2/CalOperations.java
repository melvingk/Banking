package com.qa.CalculatorPart2;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalOperations implements ActionListener {

		TextField tt1;

		public CalOperations(TextField a) {
			tt1=a;
			
			
		}
		public void actionPerformed(ActionEvent x) {
			
			int fInput;
			int sInput;
			int result;
			
//			a=Integer.parseInt(tt1.getText());
//			String firstNo = String.valueOf(a);
			
			Button btn;
			btn = (Button) (x.getSource());
			String titlebtn = btn.getLabel();
			
			if(titlebtn.equals("+")) {
				firstNo.substring(0,1) + ;
				 
				
			
			}
		}
}
//			else if (titlebtn.equals("-")) {
//				c= a-b;
//			}
//			else if(titlebtn.equals("*")) {
//				
//				c = a * b;
//			}
//			else if (titlebtn.equals("/"))
//			{
//				c = a / b;
//			}
//			
//			String result= String.valueOf(c);
//	
//		}
	

