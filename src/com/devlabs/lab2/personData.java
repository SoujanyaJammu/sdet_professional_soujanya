package com.devlabs.lab2;

class personData{
	
	String personName;
	int personAge;
	double personWeight;
	
	personData(String personName, int personAge, double personWeight){
		this.personName = personName;
		this.personAge = personAge;
		this.personWeight = personWeight;
	}

public static void main(String[] args) {
	personData persondata1 = new personData("Soujanya", 24, 40);
	System.out.println(persondata1.personName);
	System.out.println(persondata1.personAge);
	System.out.println(persondata1.personWeight);
}
}