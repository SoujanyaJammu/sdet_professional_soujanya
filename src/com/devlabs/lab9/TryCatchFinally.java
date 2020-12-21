package com.devlabs.lab9;

import java.util.Scanner;

public class TryCatchFinally {

	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
	        System.out.println("Enter num1");
	        int num1 = scan.nextInt();
	        System.out.println("Enter num2");
	        int num2 = scan.nextInt();
	        scan.close();
	        divide(num1, num2);	        
	        
	}
	 static void divide(int num1, int num2) {
		 try {
              int  result = num1/num2;
              System.out.println("Result after division: "+result);
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		 finally {
			 System.out.println(" Finally i am here");
		 }
	}

}
