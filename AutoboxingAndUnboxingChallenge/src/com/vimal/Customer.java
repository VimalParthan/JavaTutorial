package com.vimal;

import java.util.ArrayList;

public class Customer {
	
	private String customerName;
	
	ArrayList<Double> transactions;

	public Customer(String customerName,double initialAmount) {
		this.customerName = customerName;
		this.transactions = new ArrayList<Double>();
		addTransaction(initialAmount);
	}

	public String getCustomerName() {
		return customerName;
	}

	public ArrayList<Double> getTransactions() {
		return transactions;
	}
	
	public void addTransaction(double amount){
		this.transactions.add(amount);
	}
	
}
