package com.devlabs.lab8;

public class AppendStringBuilderAndBuffer {

	public static void main(String[] args) {
		
		String str = "Welcome ";
//StringBuilder
		StringBuilder sb1 = new StringBuilder(str);	
		sb1.append("To");	
		System.out.println("StringBuilder sb1  " +sb1);
		
//StringBuffer
		String str1 = "Core ";
		StringBuffer sb2 = new StringBuffer(str1);
		sb2.append("Java Tutorial");
		System.out.println("StringBuffer sb2   " +sb2);

	}

}
