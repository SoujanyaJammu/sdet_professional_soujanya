package com.devlabs.lab8;

public class StringComparision {

	public static void main(String[] args) {
		
	        String str1 = "Hello World";
	        String str2 = "Hello wORld";
			String str3 = "Hello"; //str1 and str2 are two reference variables pointing to the same string literal
			String str4 = "Hello";
			  
	        if(str1.equalsIgnoreCase(str2)) {
	        	System.out.println("str1 and str2 are equal");
	        }
	        else {
	        System.out.println("str1 and str2 are not equal");
	        }
	        
			//== compares hashcodes and not content //shallow comparison : memory locations checked 
			  if(str3==str4) 
			  {
			      System.out.println("str3==str4"); } 
			  else 
			  { 
				  System.out.println("str3!=str4");
			 }

	}

}
