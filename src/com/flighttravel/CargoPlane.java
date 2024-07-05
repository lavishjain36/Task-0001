package com.flighttravel;

public class CargoPlane extends Plane{
        
	//overriden method
	
	@Override
	public void fly() {
		System.out.println("CargoPlane Flies at lower height");
	}
	//specialized method
	public void carryGoods() {
		System.out.println("Cargoplance carries goods.");
	}
	 
}
