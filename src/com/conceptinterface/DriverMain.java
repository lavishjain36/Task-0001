package com.conceptinterface;

public class DriverMain {

	public static void main(String[] args) {
		Saving sa=new Saving();
		sa.deposit();
		sa.checkBalance();
		sa.withdraw();
		System.out.println("---------------------");
		CurrentAccount ca=new CurrentAccount();
		ca.deposit();
		ca.checkBalance();
		ca.withdraw();

	}

}
