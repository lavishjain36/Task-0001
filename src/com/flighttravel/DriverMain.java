package com.flighttravel;

public class DriverMain {

	public static void main(String[] args) {
		
		//create Cargoplane obj
		CargoPlane cp=new CargoPlane();
		PassengerPlane pp=new PassengerPlane();
		
		cp.takeoff();//inherited method
		cp.fly();//@Overriden method
		cp.carryGoods();//specialized method
		cp.landing();//inherited method
		
		System.out.println("-------------------------");

		pp.takeoff();
		pp.fly();
		pp.carryPassenger();
		pp.landing();
	}

}
