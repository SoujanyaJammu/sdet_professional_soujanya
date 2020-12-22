package com.devlabs.assignment2;

public class StringCheckPalindrome {

	public static void main(String[] args) {
		String str = "trurt";
		
		StringBuilder sb = new StringBuilder();
		// read string backward
		for(int i = str.length() - 1; i >= 0; i--){
			sb.append(str.charAt(i));
		}            
		if(str.equalsIgnoreCase(sb.toString())){
			System.out.println(str + " is a Palindrome");
		}else{
			System.out.println(str + " is not a Palindrome");
		}
	}
	

}
