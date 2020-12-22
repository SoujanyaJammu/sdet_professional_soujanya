package com.devlabs.assignment3;

import java.util.*;

public class SortArrayList {

public static void main(String[] args) {
  
//create an ArrayList object
ArrayList<String> arrayList = new ArrayList();

//Add elements to Arraylist
        
arrayList.add("Alex"); 
arrayList.add("Charles");
arrayList.add("Brian");
arrayList.add("David");
arrayList.add("Francis");

       
 System.out.println("Before sorting ArrayList ...");
 Iterator itr=arrayList.iterator();
        
while (itr.hasNext()) {
 
System.out.println(itr.next());
     
}
      
 /*
 To sort an ArrayList object, use Collection.sort method. This is a
  static method. It sorts an ArrayList object's elements into ascending order.
*/
  Collections.sort(arrayList);
     
  System.out.println("After sorting ArrayList ...");
       
    
        
Iterator itr1=arrayList.iterator();
        
while (itr1.hasNext()) {

System.out.println(itr1.next());
            
}
     
}
}
