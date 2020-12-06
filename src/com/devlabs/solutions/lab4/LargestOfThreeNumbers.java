package com.devlabs.solutions.lab4;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		 int num1, num2, num3;
		    
		   Scanner scan = new Scanner(System.in);
		   System.out.println("Enter the first number: ");
		   num1 = scan.nextInt();
		   
		   System.out.println("Enter the second number: ");
		   num2 = scan.nextInt();

		   System.out.println("Enter the third number: ");
		   num3 = scan.nextInt();
		   
		   scan.close();
		   
	       if (num1>num2 && num1>num3)
	        {
	            System.out.println("Largest number : "+num1);
	        }
	        else if (num2>num1 && num2>num3) {
	            System.out.println("Largest number : "+num2);
	        }
	        else
	        {
	            System.out.println("Largest number : "+num3);
	        }
	           
	}

}
