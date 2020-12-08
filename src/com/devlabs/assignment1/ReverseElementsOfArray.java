package com.devlabs.assignment1;

import java.util.Scanner;

public class ReverseElementsOfArray {

	public static void main(String[] args) {

    
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arraySize = reader.nextInt();
        int[] arr = new int[arraySize];
        System.out.println("Enter the elements of the array");
        
        for(int i=0;i<arraySize;i++)
        {
            arr[i] = reader.nextInt();
        }       
        reader.close();
        System.out.println("Reverse list of Array: ");
        for(int i=arr.length-1;i>=0;i--)
        {
        	System.out.println(arr[i]);

        }
	}

}
