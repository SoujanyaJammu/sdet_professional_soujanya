package com.devlabs.assignment2;

import java.util.Scanner;

public class StringCheck {

	public static void main(String[] args) {

		String str = "A brown fox ran away fast";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String need to be find:");
		String str1 = scan.nextLine();
		scan.close();
		
		if(str.contains(str1))
		{
			System.out.println(str1+ " is present");
		}

	}

}
