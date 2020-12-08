package com.devlabs.assignment1;

import java.util.Scanner;

public class Factorial {


	public static void main(String[] args) {
			
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        
        int num = reader.nextInt();
        
        reader.close();
        
        int i= 1, fact = 1;
        
        		while(i<=num) {
        			fact *= i;
        			i++;
        		}
        		
        System.out.println("Factorial of "+num+" is: "+fact);      		
	}

}
