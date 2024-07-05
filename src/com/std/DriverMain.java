package com.std;

public class DriverMain {

	public static void main(String[] args) {
		//create an object of Student class
		Student std1=new Student("Lavish", 38);
		std1.getstudentdetails();

		//crate an object of Graduate student
		GraduateStudent gs1=new GraduateStudent("Lavish", 38,"Software Development");
		gs1.getstudentdetails();
		
		//Overriding concept
		
		//Overloading
		double baseFee=10000;
		//below -->overloaded method
		System.out.println("Base Fee :"+std1.calculateFees(baseFee));
		System.out.println("Base with Fee with Addition Charges :"+std1.calculateFees(baseFee, 2000));
		
	}

}
