package com.inheritance;

//child class->Inheritance
public class Manager extends Employee {

	//instance variable
	private String department;
	//constructor->Child class constructor
	public Manager(String name,double salary,String department) {
		//Access parent class
		super(name,salary);	
		System.out.println("Child Class  Manager Constructor");
		this.department=department;//initialize
	}
	
	//Method -execute the data
	
	@Override
	public void displayDetails() {
		super.displayDetails();//name and salary
		System.out.println("Department :"+this.department);
	}
	
}
