package com.abstractionconcept;

public class CargoPlane extends Plane {

	@Override
	public void takeoff() {
		// TODO Auto-generated method stub
		System.out.println("Cargo Plane need longer runway to take off..");

		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Cargo Plane flies at low heights..");

		
	}

	

	@Override
	public void landing() {
		// TODO Auto-generated method stub
		System.out.println("Cargo Plane need longer runway to land..");
		
	}

}
