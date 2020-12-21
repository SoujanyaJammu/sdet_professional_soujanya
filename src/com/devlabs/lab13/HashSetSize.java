package com.devlabs.lab13;
import java.util.*; 

public class HashSetSize { 
    public static void main(String args[]) 
    { 
        // Creating an empty HashSet 
        HashSet<String> set = new HashSet<String>(); 
  
        // Use add() method to add elements into the Set 
        set.add("Soujanya"); 
        set.add("Mahesh"); 
        set.add("Saikiran"); 
        set.add("Lavanya"); 
        set.add("Ashok"); 
  
        // Displaying the HashSet 
        System.out.println("HashSet: " + set); 
  
        // Displaying the size of the HashSet 
        System.out.println("The size of the set is: " + set.size()); 
    } 
} 