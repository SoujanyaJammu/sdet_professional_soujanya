package com.devlabs.lab2;

public class Swap {
	
	public static void main(String[] args) {
		
		float variable1 = 0.03f;
		float variable2 = 0.05f;
		float temp;		
		temp = variable2;
        variable2 = variable1;
        variable1 = temp;
        System.out.println(variable1);
        System.out.println(variable2);

	}

}
