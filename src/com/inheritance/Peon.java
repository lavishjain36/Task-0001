package com.inheritance;

public class Peon extends Manager {

	public Peon(String name, double salary, String department) {
		super(name, salary, department);
		System.out.println("Peon Class constructor");
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
	}
}
