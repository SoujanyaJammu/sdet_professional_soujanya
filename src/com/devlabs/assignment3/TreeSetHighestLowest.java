package com.devlabs.assignment3;

import java.util.TreeSet;

public class TreeSetHighestLowest {
	public static void main(String args[])
	{
	
	TreeSet<Integer> set = new TreeSet<Integer>(); 
	set.add(23);
	set.add(56);
	set.add(71);
	set.add(91);
	set.add(100);
	set.add(40);
	set.add(60);
	set.add(12);
	
	System.out.println("Elements of the treeset are: " + set);
	
	System.out.println("Highest Value: " + set.pollLast()); // returns and
	// removes the
	// highest
	// element

    System.out.println("Lowest Value: " + set.pollFirst()); // returns and
	// removes the
	// smallest
	// element
    System.out.println(set);
	}

}
