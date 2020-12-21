package com.devlabs.lab11;

import java.util.ArrayList;

public class ArrayListReplaceElementExample {
	
	public static void main (String[] args) {
		
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("a");
		arrList.add("b");
		arrList.add("c");
		arrList.add("d");
		arrList.add("e");
		
		System.out.println("Array List Before : " + arrList);
		
		System.out.println("Replace d with x...");
                //step 1
		int index = arrList.indexOf("d");
                //step 2
		arrList.set(index, "x");
		System.out.println("Array List After : " + arrList);		
		
	}

}