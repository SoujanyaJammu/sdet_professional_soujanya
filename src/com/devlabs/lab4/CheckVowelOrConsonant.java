package com.devlabs.lab4;

import java.util.Scanner;

public class CheckVowelOrConsonant {

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        
	        
	          Scanner scan = new Scanner(System.in);
	           System.out.println("Enter the character: ");
	           char ch = scan.next().charAt(0);
	           
	           scan.close();
	           
	           if((ch>='a'&&ch<='z')) {
	           
	           switch(ch)
	           {
	                case 'a':
	                      System.out.println("You enter a vowel character");
	                    break;
	                
	                case 'e':
	                     System.out.println("You enter a vowel character");
	                    break;
	                    
	                case 'i':
	                     System.out.println("You enter a vowel character");
	                    break;
	                    
	                case 'o':
	                     System.out.println("You enter a vowel character");
	                    break;
	                case 'u':
	                     System.out.println("You enter a vowel character");
	                    break;
	                    
	                default: 
	                    System.out.println("You enter a constant character");
	           }
	           }
	           else {
	        		System.out.println("Input is not an alphabet");
	             }

 }
}


