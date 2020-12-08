package com.devlabs.assignment1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		 int num, num1, num2, num3 = 0;
		    
		   Scanner scan = new Scanner(System.in);
		   
		   System.out.println("Enter the value to generate the fibonacci: ");
		   num = scan.nextInt();
		   
		   System.out.println("Enter the first number of fibonacci series: ");
		   num1 = scan.nextInt();
		   
		   System.out.println("Enter the second number of fibonacci series: ");
		   num2 = scan.nextInt();
		   
		   scan.close();
		   
		   System.out.println(num1);
		   System.out.println(num2);
		   
		   for (int i=1 ; i <= num-2; i++) {
		   
		   num3 = num2 +num1;
		   
		   System.out.println(num3);
		   
		   num1 = num2;
		   num2 = num3;
		   
		   }
				   

	}

}
