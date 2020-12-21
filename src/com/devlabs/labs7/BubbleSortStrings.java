package com.devlabs.labs7;

import java.util.Scanner;

public class BubbleSortStrings {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String need to be sorted:");
		// str[] = {"Ciaz,Alto,Swift,Dezire,Brezza"};
		String str = scan.nextLine();
		scan.close();
		String[] strArr = str.split(",");

		String temp;
		System.out.println("Strings in sorted order:");
		for (int j = 0; j < strArr.length; j++)
		{
	   	   for (int i = j + 1; i < strArr.length; i++)
	   	   {
			// comparing adjacent strings
			if (strArr[i].compareTo(strArr[j]) < 0)
			{
				temp = strArr[j];
				strArr[j] = strArr[i];
				strArr[i] = temp;
			}
		   }
		   System.out.println(strArr[j]);
		}
		
	}

}
