package com.devlabs.labs7;

import java.util.Scanner;

public class StringReplace {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter main string:");
		String str1 = scan.nextLine();
		//str1="Pan Pun Prank Pit Pat";
		System.out.println("Enter character to replace in string:");
		String str2 = scan.nextLine();
		System.out.println("Enter character to replace in string with:");
		String str3 = scan.nextLine();
		scan.close();
	    str1 = str1.replace(str2, str3);
		System.out.println("String After Replacement:"+str1);
		
	}

}
