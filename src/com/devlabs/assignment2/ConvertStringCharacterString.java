package com.devlabs.assignment2;

public class ConvertStringCharacterString {

	public static void main(String[] args) {

        String str = "CoreJavaInSdet"; 
        
        // Creating array and Storing the array 
        // returned by toCharArray() 
        char[] ch = str.toCharArray(); 
  
        // Printing array 
        System.out.print("Character Array from String is: [");
        for (char c : ch) { 
            System.out.print("'"+c+"',"); 
        } 
        System.out.println("]");
        
      //constructor of the String class that parses char array as a parameter  
        String string = new String(ch);  
        //prints the string  
        System.out.println("String from Character array is: "+string); 

	}



}
