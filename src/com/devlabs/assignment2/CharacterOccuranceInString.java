package com.devlabs.assignment2;

import java.util.Scanner;

public class CharacterOccuranceInString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String to find the occurrence of each character:");
		String str = scan.nextLine();
		scan.close();
		//ASCII values ranges upto 256
		int counter[] = new int[256]; 

		//String length
 

		/* This array holds the occurrence of each char, For example
		 * ASCII value of A is 65 so if A is found twice then 
		 * counter[65] would have the value 2, here 65 is the ASCII value
		 * of A
		 */
		for (int i = 0; i < str.length(); i++) 
			counter[str.charAt(i)]++; 

	        for (int i = 0; i < str.length(); i++) { 
		   
		   int flag = 0; 
		   for (int j = 0; j <= i; j++) { 

			/* If a char is found in String then set the flag 
			 * so that we can print the occurrence
			 */
			if (str.charAt(i) == str.charAt(j))  
				flag++;                 
		   } 

		   if (flag == 1)  
		      System.out.println("Occurrence of char " + str.charAt(i)
			 + " in the String is:" + counter[str.charAt(i)]);             
		} 
	}
}


