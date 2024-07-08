package com.abstractionconcept;

public class Passenger extends Plane {

	//implementation to all abstract performed in child class
	@Override
	public void takeoff() {
		// TODO Auto-generated method stub
		
		System.out.println("Passenger Plane need medium runway to take off..");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Passenger flies at medium Height");
	}

	@Override
	public void landing() {
		// TODO Auto-generated method stub
		System.out.println("Passenger Plane need medium runway to land");
		
	}

}
