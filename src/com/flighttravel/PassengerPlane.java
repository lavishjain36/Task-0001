package com.flighttravel;

public class PassengerPlane extends Plane{
     
	@Override
	public void fly() {
		System.out.println("Passenger flies at Medium Height...");
	}
	
	//special method
	public void carryPassenger() {
		System.out.println("Passenger Plane carries passengers");
	}
}
