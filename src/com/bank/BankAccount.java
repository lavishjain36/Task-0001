package com.bank;

//Encapsulation
public class BankAccount {
     
	//create data member as private to protect the information
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	
	//constructor
	public BankAccount(String accountNumber, String accountHolderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	//getter method generated automatically

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}



	
	
	//Getter and setter
	
	
	//instance-to deposit money-5000
	public void deposit(double amount) {
		//business 
		if(amount>0) {
			balance=balance+amount;
			System.out.println("Deposited :"+amount);
			System.out.println("New Balance :"+balance);
		}else {
			System.out.println("Invalid currency....");
		}
	}
	
	

	//instance-to withdraw amount
	public void withdraw(double amount) {
		//business
		if(amount>0 && amount<=balance) {
			balance=balance-amount;//5000-2000->3000
			System.out.println("Withdraw :"+amount);
			System.out.println("New balance :"+balance);
		}else {
			System.out.println("Insufficent balance...");
		}
		
	}
	
	
	//method
	public void displayDetails() {
		System.out.println("Account Number :"+accountNumber);
		System.out.println("Account Holder Name :"+accountHolderName);
		System.out.println("Balance :"+ balance);
	}
	
	
	
}
