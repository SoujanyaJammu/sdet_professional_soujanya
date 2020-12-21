package com.devlabs.lab12;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionMinMax {
	public static void main(String a[])
    {         
        List<Integer> list1 = new LinkedList<Integer>();  
        list1.add(46);  
        list1.add(67);  
        list1.add(24);  
        list1.add(16);  
        list1.add(8);  
        list1.add(12); 
        
        System.out.println("Value of maximum element from the collection: "+ Collections.max(list1));  //max of list
        System.out.println("Value of minimum element from the collection: "+ Collections.min(list1));  //min of list
    }
}
