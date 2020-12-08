package com.devlabs.assignment1;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		
		   Scanner scan = new Scanner(System.in);
		   System.out.println("Enter the first number: ");
		   double length = scan.nextDouble();
		   
		   System.out.println("Enter the second number: ");
		   double height = scan.nextDouble();
		   
		   scan.close();
			
		   double areaOfTriangle =  area(length, height);  
		   System.out.println("Area of rectangle: "+areaOfTriangle);
	}
	
	public static double area(double length, double height) {
		double Length = length;
		double Height = height;
		return 0.5*(Length*Height);
		
	}
}
