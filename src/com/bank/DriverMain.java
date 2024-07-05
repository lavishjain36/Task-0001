package com.bank;

public class DriverMain {

	public static void main(String[] args) {
		//create new bank account
		BankAccount account1=new BankAccount("636747", "Lavish jain", 5000.0);
		//display the account 
//		account1.displayDetails();
//		
//		//deposit money to account
//		account1.deposit(2500.0);
//		System.out.println("------------------");
//
//		account1.withdraw(1500);
//		System.out.println("----------------");
//		
//		account1.withdraw(10000);
//		System.out.println("----------------");
//		
//		account1.displayDetails();
		
		System.out.println("Account Holder Name: "+account1.getAccountHolderName());
        //to update the balance
		account1.setBalance(2500);
		System.out.println("Updated Balance :"+account1.getBalance());
		account1.displayDetails();

	}

}
