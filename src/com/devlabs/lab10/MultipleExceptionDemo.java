package com.devlabs.lab10;

public class MultipleExceptionDemo {

	public static void main(String[] args) {
		int array[] = {20,20,40};
		int num1 = 15, num2=0;
		int result = 0;
		
		try 
		{
		for(int i = 2; i>=0; i--) {
			System.out.println("Values of array is"+ array[i]);
		}
		System.out.println("The result is"+result);
		result= num1/num2;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bound Exception is: "+e);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception is"+e);
		}
		System.out.println("Last Line in main thread");
	}

}
