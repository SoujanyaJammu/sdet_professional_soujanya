package com.devlabs.lab11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {
	
	 public static void main(String[] args) 
	    {
	        List<String> list = new ArrayList<String>();
	        list.add("a");
	        list.add("b");
	        
	        System.out.println(list);
	        
	        String[] array = new String[list.size()];
	        
	        list.toArray(array);//convert list into array
	        
	        System.out.println(array);
	        System.out.println(Arrays.toString(array)); //Arrays class mostly has static methods. Use it with the class name
	    }
	}
