package com.abstractionconcept;

public class Airport {
	//pp

	public void permit(Plane  plane) {
		//call the all implementation.
		plane.airport();
		plane.takeoff();
		plane.landing();
		plane.fly();
	}
}
