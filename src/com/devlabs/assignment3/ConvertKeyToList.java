package com.devlabs.assignment3;

import java.util.*;

public class ConvertKeyToList {
	Map<Integer, String> map;
	 
	 public ConvertKeyToList(Map<Integer, String> map) {
	      this.map = map;
	 }
	 
	 public List<Integer> convertKeyToList() {
	    return new ArrayList(map.keySet());
	 }
	 
	 public static void main(String[] args) {           
	 Map<Integer, String> map = new HashMap<>();
	 
	    map.put(11, "one");
	    map.put(22, "two");
	    map.put(33, "three");
	    map.put(44, "Four");
	    map.put(55, "Five");
	    map.put(66, "Six");
	    map.put(77, "Seven");
	    map.put(88, "Eight");
	    map.put(99, "Nine");
	    map.put(100, "Ten");
	 
	    ConvertKeyToList  conv = new ConvertKeyToList (map);
	    List<Integer> val = conv.convertKeyToList();
	    System.out.println("Keys:");
	   
	    for (int keysList : val)
	    {
	       System.out.println(keysList);
	    }
	 }
}
