package com.devlabs.labs7;

import java.util.Scanner;

public class StringTrim {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String need to be trimed:");
		String str1 = scan.nextLine();
		scan.close();
		//String str1 = " She sells sea shells on the sea shore "	
		System.out.println("String before trim:"+str1);
		String str2 = str1.trim();
		System.out.println("String After trim:"+str2);
	}

}
