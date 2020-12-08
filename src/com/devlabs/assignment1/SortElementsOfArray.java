package com.devlabs.assignment1;

import java.util.Scanner;

public class SortElementsOfArray {

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
        System.out.println("Elements of array sorted in ascending order: ");
        for(int i=0;i<arraySize;i++)
        {
        	for(int j=i+1;j<arraySize;j++) {
        		if(arr[i]> arr[j])
        		{
        			int temp = arr[i];
        			arr[i]= arr[j];
        			arr[j]= temp;
        		}
        	}
			System.out.println(arr[i]);
        }
	}

}
