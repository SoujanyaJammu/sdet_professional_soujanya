package com.devlabs.lab3;

public class HDFCBank extends AxisBank implements Bank 
{

	public void getInterest() {
		
		System.out.println("Interest for HDFCBank");
	}
	
	public static void main(String[] args) {

		HDFCBank h1 = new HDFCBank();
		h1.getInterest();
		AxisBank h2 = new AxisBank();
		h2.getInterest();

	}

}
