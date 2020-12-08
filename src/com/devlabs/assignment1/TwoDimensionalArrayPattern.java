package com.devlabs.assignment1;

import java.util.Scanner;

public class TwoDimensionalArrayPattern {

	public static void main(String[] args) {
		
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter row size: ");
        int rowSize = reader.nextInt();
        System.out.println("Enter column size: ");
        int columnSize = reader.nextInt();
        reader.close();
		int[][] arr = new int[rowSize][columnSize];
		System.out.println("Triangle array: ");
        for(int i=0;i<=rowSize-1;i++)
        {
        	for(int j=0;j<=i;j++) {
               System.out.print(arr[i][j]);
        	}
        	System.out.println();
        }
	}
}
