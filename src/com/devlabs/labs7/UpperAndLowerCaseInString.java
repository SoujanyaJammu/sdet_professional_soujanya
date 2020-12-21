package com.devlabs.labs7;

public class UpperAndLowerCaseInString {

	public static void main(String[] args) {
		
		String c ="AbCdefGHijklMNOpqRstUVwxyZ@%*234";
		
		for (int i =0; i<c.length(); i++) {
			if(Character.isUpperCase(c.charAt(i))) {
				System.out.println("UpperCase characters in string are:"+c.charAt(i));
			}
			else if(Character.isLowerCase(c.charAt(i))) {
				System.out.println("LowerCase characters in string are:"+c.charAt(i));
			}
			else if(Character.isDigit(c.charAt(i))) {
				System.out.println("Numerical characters in string are:"+c.charAt(i));
			}
			else {
				System.out.println("Special characters in string are:"+c.charAt(i));
			}
		}
	}
}
