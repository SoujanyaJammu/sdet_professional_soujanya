package com.devlabs.assignment3;

import java.util.*;

public class countDupCharsHashMap {
	//Create a HashMap 
	
	public static void main(String args[]){
		
	String str ="WelcomeToCoreJava";
    Map<Character, Integer> map = new HashMap<Character, Integer>(); 
 
    //Convert the String to char array
    char[] chars = str.toCharArray();
 
    /* logic: char are inserted as keys and their count
     * as values. If map contains the char already then
     * increase the value by 1
     */
    for(Character ch:chars){
      if(map.containsKey(ch)){
         map.put(ch, map.get(ch)+1);
      } else {
         map.put(ch, 1);
        }
    }
 
    //Obtaining set of keys
    Set<Character> keys = map.keySet();
 
    /* Display count of chars if it is
     * greater than 1. All duplicate chars would be 
     * having value greater than 1.
     */
    for(Character ch:keys){
      if(map.get(ch) > 1){
        System.out.println("Char "+ch+" "+map.get(ch));
      }
    }
	}
}
