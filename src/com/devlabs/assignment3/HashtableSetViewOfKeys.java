package com.devlabs.assignment3;

import java.util.*;

public class HashtableSetViewOfKeys {
	public static void main(String[] args) {
	      Hashtable ht = new Hashtable();
	      ht.put("1", "One");
	      ht.put("2", "Two");
	      ht.put("3", "Three");
	      Enumeration e = ht.keys();
	      
	      while (e.hasMoreElements()) {
	         System.out.println(e.nextElement());
	      }
	   }
}
