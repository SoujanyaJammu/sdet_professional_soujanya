package com.devlabs.assignment2;

public class Arithematicexception {
	
	public static void myMethod() throws ArithmeticException, NullPointerException
	{
		int num1 = 20;
		int num2 = 0;
		int  result = num1/num2;
        System.out.println("Result after division"+result); 
	}

	public static void main(String[] args) throws ArithmeticException{
			
		 try {
			 myMethod();
		 }
		 catch(ArithmeticException e) {
			 e.printStackTrace();
		 }
		 finally {
			 System.out.println(" Finally i am here. ");
		 }
	}

}


