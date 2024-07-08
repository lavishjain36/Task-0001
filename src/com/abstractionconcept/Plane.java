package com.abstractionconcept;

//Class->Abstraction
abstract public  class Plane {

	
	//method ->without implementation->abstract method
	abstract public void takeoff();
	abstract public void fly();
	abstract public void landing();
	
	//normal method or non-abstract method
	public void airport() {
		System.out.println("All planes need airport..");
	}

}
