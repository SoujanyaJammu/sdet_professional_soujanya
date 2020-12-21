package com.devlabs.lab11;

import java.util.*;

public class ArrayListInsertRetrive {

	public static void main(String[] args) {

		List arrayList = new ArrayList();
		arrayList.add("Soujanya");
		arrayList.add(24);
		arrayList.add(40.1);
		
		arrayList.add(1, "Mahesh");
		
		System.out.println("As List: "+arrayList);
		
		System.out.println("Elements in the list after adding are:");
		for(int i =0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		/// retrive an element
		System.out.println("The element at 2nd position: "+arrayList.get(3));
		
		//Remove an element from the specific index or value
		//Object obj = arrayList.remove(1);//using index 
		Object obj = arrayList.remove("Mahesh");// using value
		

		System.out.println(" List after removal : "+arrayList);
	}

}
