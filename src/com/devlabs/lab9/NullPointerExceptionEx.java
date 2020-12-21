package com.devlabs.lab9;

public class NullPointerExceptionEx {

	public static void main(String[] args) {

			String value = null;
			getLength(value);
			System.out.println("Last line in main thread");

	}

	public static void getLength(String value) {
		try {
		if(value.length()!=0) {
			value = null;
		}
		System.out.println("Lenghth of input string:"+value.length());	
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
