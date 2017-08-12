package com.vimal;

import java.util.ArrayList;

public class Branch {

	private String branchName;

	private ArrayList<Customer> customers;

	public Branch(String branchName) {

		this.branchName = branchName;
		this.customers = new ArrayList<Customer>();
	}

	public String getBranchName() {
		return branchName;
	}
	
	

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public boolean newCustomer(String name,double amount) {

		if (getCustomer(name) ==null ) {
			this.customers.add(new Customer(name,amount));
			return true;
		} else {
			return false;
		}

	}
	
	public boolean addCustomerTransaction(String name,double transactionAmount){
		Customer existingCustomer = getCustomer(name);
		if(existingCustomer!=null){
			existingCustomer.addTransaction(transactionAmount);
			return true;
		}else{
			return false;
		}
	} 
	



	private Customer getCustomer(String name) {
	
		for (int i = 0; i < this.customers.size(); i++) {
			Customer checkedCustomer = this.customers.get(i);
			if (checkedCustomer.getCustomerName().equalsIgnoreCase(name)) {
				return checkedCustomer;
			}
		}
		return null;
	}
	


}
