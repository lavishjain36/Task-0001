package com.conceptinterface;

public class CurrentAccount implements Account {

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Current Accoun withdraw implemented...");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Current Account deposit implemented...");

	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Current Account check balance implemented...");

	}

}
