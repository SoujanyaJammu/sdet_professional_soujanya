package com.devlabs.lab13;

import java.util.HashSet;
import java.util.*;

public class SetInsertRetrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//maintains no order
				Set<String> set=new HashSet<String>(); 
				//add()
				
		           set.add("Mayank");  
		           set.add("Apoorv");  
		           set.add("Lokesh");  
		           set.add("Abhishek");
		           set.add("Ankur");
		           set.add("Shaishav");
		           
		           System.out.println("The elements in the set are: "+set);
		           
		           set.add("Lavanya");
		          // Retrieve
		           System.out.println("Elements in the set after adding other element: ");
		           Iterator<String> itr= set.iterator();
		           while(itr.hasNext()) {
		        	   System.out.println(itr.next());
		           }
	}

}
