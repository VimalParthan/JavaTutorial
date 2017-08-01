package com.vimal;

public class VipCustomer {

	private String name;
	
	private double creditLimit;
	
	private String emailAddress;

	public String getName() {
		return name;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public VipCustomer(String name, double creditLimit, String emailAddress) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}
	
	public VipCustomer(String name, double creditLimit) {
		this(name,creditLimit,"VIP@gmail.com");
	}
	public VipCustomer() {
		this("VIP",1000000000.00,"VIP@gmail.com");
	}
	
	
	
}
