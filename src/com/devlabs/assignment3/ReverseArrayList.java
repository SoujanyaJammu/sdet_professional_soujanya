package com.devlabs.assignment3;

import java.util.ArrayList;

public class ReverseArrayList {

	public static void main(String[] args) {
		 ArrayList<Integer> arrayList = new ArrayList<Integer>();
	       
	        //Add elements to Arraylist
	        arrayList.add(10);
	        arrayList.add(20);
	        arrayList.add(30);
	        arrayList.add(40);
	        arrayList.add(50);

	        System.out.println("Elements before reversing:"+ arrayList);
	        System.out.print("\nElements after reversing: ");
	        for(int i= arrayList.size()-1; i>=0; i--) {
	        	System.out.println(arrayList.get(i));
	        }

	}

}
