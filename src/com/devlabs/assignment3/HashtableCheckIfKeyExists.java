package com.devlabs.assignment3;

import java.util.Hashtable;

public class HashtableCheckIfKeyExists {
    public static void main(String[] args) {
    	 
        Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
        
        hashtable.put(1, "One");
        hashtable.put(2, "Two");
        hashtable.put(3, "Three");
 
        /*
         * If the return value of the get
         * method is null, then the key
         * does not exist
         */
        //this will print true as the key 2 exists
        System.out.println( "Key 2 exists? " +  (hashtable.get(2) != null) );
        
        /*
         * this will print false as the key 5
         * does not exist and hence the get 
         * method will return null
         */
        System.out.println( "Key 5 exists? " +  (hashtable.get(5) != null) );
 
    }
}
