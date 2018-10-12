package com.qa.ShafeeqWorkOne;

public class QAconsulting {

static {
	
	String greeting = "whazzzzzzup!";
	int p = 60;
	int d= 80;
	System.out.println(p + d);
	System.out.println(greeting);
}
	
static	QAconsulting r;
	
	private QAconsulting ()
	{
	int pound=50;
	int dollar=80;
	
	System.out.println(pound + dollar);
	}
	
	
public static QAconsulting createobject() {
	
	int e = 2;
	
	for (int i=0;i<e;i++)
	{
	if(r==null) {
	
		r = new QAconsulting();
	}
	else {
		
		System.out.println("not available"); 
	}
	}
	
	
	return r;
}
}
