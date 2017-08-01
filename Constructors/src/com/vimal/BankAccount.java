package com.vimal;

public class BankAccount {
	private String number;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	
	public BankAccount(){
		this("56789",2.50,"Default name", "Default address","default phone");
	}
	

	
	public BankAccount(String number, double balance, String customerName, String email, String phoneNumber) {
		System.out.println("Account constructor with parameters called");
		this.number = number;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}



	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void deposit(double depositAmount){
		this.balance += depositAmount;
		System.out.println("Deposit of "+ depositAmount + "made. new balance is "+ this.balance);
	}
	
	public void withdrawFunds(double amount){
		if(amount<=this.balance){
			balance-=amount;
			System.out.println("Withdrawal of "+amount +"processed. Remaining balance = " + this.balance);
		}else{
			System.out.println("Only "+ this.balance+" available. Withdrawal not processed");
		}
	}
}
