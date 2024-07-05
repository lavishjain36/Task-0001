package com.std;

//Parent class
public class Student {
    String name;
	int age;
	
	//constructor
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//method to display the student details
	public void getstudentdetails() {
		System.out.println("Name :"+name+" ,Age: "+age);
	}
	
	//overloading
	//calculate fees with base fees
	public double calculateFees(double baseFee) {
		return baseFee;
	}
	
	//overloaded method to calculate fees with additional charges.
	public double calculateFees(double baseFee,double additionalCharge) {
		return baseFee+additionalCharge;//10000+2000->12000
	}
	//Above two concept-Overloaded methods?

}
