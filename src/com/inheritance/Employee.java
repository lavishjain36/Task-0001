package com.inheritance;

//Parent class
public class Employee {
		//data fields
	private String name;
	private double salary;
	
	//constructor
	public Employee(String name, double salary) {
		System.out.println("Parent Employee Class Constructor.. ");
		this.name = name;
		this.salary = salary;
	}
	
	//instance method
	public void displayDetails() {
		System.out.println("Name :"+name);
		System.out.println("Salary: "+salary);
	}


}
