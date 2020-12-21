package com.devlabs.lab12;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class JoinListUsingAddAll {

	public static void main(String a[])
    {         
        List<Integer> list1 = new LinkedList<Integer>();  
        list1.add(46);  
        list1.add(67);  
        list1.add(24);  
        list1.add(16);  
        list1.add(8);  
        list1.add(12);
        
	      
        List<Integer> list2 = new LinkedList<Integer>();
	        list2.add(4);  
	        list2.add(6);  
	        list2.add(2);  
	        list2.add(1);  
	        list2.add(88);  
	        list2.add(1);
        
        
        list1.addAll(list2);
		System.out.println("The list1 after addAll is "+list1);
		System.out.println("The list2 after addAll is "+list2);
        
    }
}
