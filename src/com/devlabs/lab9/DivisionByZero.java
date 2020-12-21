package com.devlabs.lab9;

public class DivisionByZero {

	public static void main(String[] args) {
		
		int num1 = 20;
		int num2 = 0;
		
		 try {
             int  result = num1/num2;
             System.out.println("Result after division"+result);
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		 finally {
			 System.out.println("Finally i am here. ");
		 }
		 
		 int addition = num1+num2;
		 System.out.println("Result after addition: "+addition);

	}

}
